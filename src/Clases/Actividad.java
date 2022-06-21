//PROYECTO DESARROLLO DE SOFTWARE
package Clases;

import Conexion.CConexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Actividad {

    private String codigo;
    private String descripcion;
    private int costo;

    //Relaciones:
    private Operario operario;

    public Actividad() {
        this.codigo = "";
        this.descripcion = "";
        this.costo = 0;
        this.operario = null;
    }

//Constructor de la clase Actividad
    public Actividad(String codigo, String descripcion, int costo, Operario operario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costo = costo;
        this.operario = operario;
    }

    //Métodos de acceso - getter
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public Operario getOperario() {
        return operario;
    }

    //Métodos de acceso - setter
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setOperario(Operario operario) {
        this.operario = operario;
    }

    public void mostrarActividad(JTable paramTablaActividades) {

        CConexion objetoConexion = new CConexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Costo");
        modelo.addColumn("Operario");

        paramTablaActividades.setModel(modelo);

        sql = "select * from servicio;";

        String[] datos = new String[4];

        Statement st;

        try {

            st = objetoConexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);

                modelo.addRow(datos);
            }

            paramTablaActividades.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void insertarActividad(String codigo, String descripcion, int costo, long OID) {

        setCodigo(codigo);
        setDescripcion(descripcion);
        setCosto(costo);

        CConexion objetoConexion = new CConexion();

        String consulta = "insert into servicio (SID , s_descripcion, s_costo, oid) values (?,?,?,?);";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, getCodigo());
            cs.setString(2, getDescripcion());
            cs.setInt(3, getCosto());
            cs.setLong(4, OID);

            cs.execute();

            //JOptionPane.showMessageDialog(null, "Se insertó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void seleccionarActividad(JTable paramTablaActividad, JTextField paramCodigo, JTextField paramDescripcion, JTextField paramCosto) {

        try {

            int fila = paramTablaActividad.getSelectedRow();

            if (fila >= 0) {

                paramCodigo.setText(paramTablaActividad.getValueAt(fila, 0).toString());
                paramDescripcion.setText(paramTablaActividad.getValueAt(fila, 1).toString());
                paramCosto.setText(paramTablaActividad.getValueAt(fila, 2).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
            return;
        }

    }

    public void modificarActividad(String codigo, String descripcion, int costo) {

        setCodigo(codigo);
        setDescripcion(descripcion);
        setCosto(costo);

        CConexion objetoConexion = new CConexion();

        String consulta = "UPDATE servicio SET s_descripcion = ?, s_costo =? WHERE servicio.SID = ?;";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);

            cs.setString(1, getDescripcion());
            cs.setInt(2, getCosto());
            cs.setString(3, getCodigo());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se modificó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void eliminarActividad(String codigo) {

        setCodigo(codigo);

        CConexion objetoConexion = new CConexion();

        String consulta = "DELETE FROM servicio WHERE servicio.SID =?";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, getCodigo());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se Eliminó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void filtroActividad(JTable paramTablaActividades, String codigoActividad, String paramFiltro) {

        CConexion objetoConexion = new CConexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Costo");
        modelo.addColumn("Operario");

        paramTablaActividades.setModel(modelo);

        if (paramFiltro.equals("Codigo")) {
            sql = "select * from servicio where SID like '" + codigoActividad + "%';";
        }
        if (paramFiltro.equals("Descripcion")) {
            sql = "select * from servicio where s_descripcion like '%" + codigoActividad + "%';";
        }
        if (paramFiltro.equals("Costo")) {
            sql = "select * from servicio where cast(s_costo as varchar) like '" + codigoActividad + "%';";
        }
        if (paramFiltro.equals("Operario")) {
            sql = "select * from servicio where cast(OID as varchar) like '" + codigoActividad + "%';";
        }

        String[] datos = new String[4];

        Statement st;

        try {

            st = objetoConexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);

                modelo.addRow(datos);
            }

            paramTablaActividades.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

}
