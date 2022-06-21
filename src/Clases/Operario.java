//PROYECTO DESARROLLO DE SOFTWARE
package Clases;

import Conexion.CConexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Operario extends Persona {

    private String cargo;
    private Contrato contrato;

    public Operario() {
        super(0, null, null, 0, null, null, null, null);
        this.cargo = "";
        this.contrato = null;
    }

    public Operario(String cargo, Contrato contrato, long identificacion, String nombre, String apellido, long telefono, String correo, String ciudad, String direccion, Genero genero) {
        super(identificacion, nombre, apellido, telefono, correo, ciudad, direccion, genero);
        this.cargo = cargo;
        this.contrato = contrato;
    }

    //Métodos de acceso - getter
    public String getCargo() {
        return cargo;
    }

    public Contrato getContrato() {
        return contrato;
    }

    //Métodos de acceso - setter
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public void mostrarOperarios(JTable paramTablaOperarios) {

        CConexion objetoConexion = new CConexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Identificación");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Direccion");
        modelo.addColumn("Genero B");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Contrato");
        modelo.addColumn(" ");

        paramTablaOperarios.setModel(modelo);

        sql = "select * from operario;";

        String[] datos = new String[11];

        Statement st;

        try {

            st = objetoConexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = "Contrato";

                modelo.addRow(datos);
            }

            paramTablaOperarios.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void insertarOperario(long identificacion, String nombre, String apellido, long telefono, String correoElectronico, String ciudad, String dirreccion, String cargo, Genero genero, Contrato contrato) {

        setIdentificacion(identificacion);
        setNombre(nombre);
        setApellido(apellido);
        setGenero(genero);
        setTelefono(telefono);
        setCorreo(correoElectronico);
        setCiudad(ciudad);
        setDirreccion(dirreccion);
        setCargo(cargo);
        setContrato(contrato);

        CConexion objetoConexion = new CConexion();

        String consulta = "insert into operario(OID , o_nombre, o_apellido, o_telefono, o_correo, o_ciudad, O_direccion, o_especialidad, o_generobiologico, contrato_id) values (?,?,?,?,?,?,?,?,?,?);";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setLong(1, getIdentificacion());
            cs.setString(2, getNombre());
            cs.setString(3, getApellido());
            cs.setLong(4, getTelefono());
            cs.setString(5, getCorreo());
            cs.setString(6, getCiudad());
            cs.setString(7, getDireccion());
            cs.setString(8, getCargo());
            cs.setString(9, String.valueOf(getGenero()));
            cs.setInt(10, getContrato().getContratoID());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se insertó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void filtrarOperario(JTable paramTablaOperarios, String textoFiltro, String paramFiltro) {

        CConexion objetoConexion = new CConexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Identificación");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Direccion");
        modelo.addColumn("Genero biologico");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Contrato");
        modelo.addColumn("Ver Contrato");

        paramTablaOperarios.setModel(modelo);

        if (paramFiltro.equals("Identificacion")) {
            sql = "select * from operario where cast(OID as varchar) like '" + textoFiltro + "%';";
        }
        if (paramFiltro.equals("Nombre")) {
            sql = "select * from cliente where c_nombre like '%" + textoFiltro + "%';";
        }
        if (paramFiltro.equals("Apellido")) {
            sql = "select * from cliente where c_apellido like '%" + textoFiltro + "%';";
        }
        if (paramFiltro.equals("Contrato id")) {
            sql = "select * from cliente where cast(contrato_id as varchar) like '" + textoFiltro + "%';";
        }

        String[] datos = new String[11];

        Statement st;

        try {

            st = objetoConexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = "Contrato";

                modelo.addRow(datos);
            }

            paramTablaOperarios.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void modificarOperario(long identificacion, long telefono, String correoElectronico, String ciudad, String direccion, String cargo) {

        setIdentificacion(identificacion);
        setTelefono(telefono);
        setCorreo(correoElectronico);
        setCiudad(ciudad);
        setDirreccion(direccion);
        setCargo(cargo);

        CConexion objetoConexion = new CConexion();

        String consulta = "UPDATE operario SET o_telefono = ?, o_correo= ?, o_ciudad = ?, o_direccion = ?, o_especialidad = ? WHERE operario.OID = ?;";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);

            cs.setLong(1, getTelefono());
            cs.setString(2, getCorreo());
            cs.setString(3, getCiudad());
            cs.setString(4, getDireccion());
            cs.setString(5, getCargo());
            cs.setLong(6, getIdentificacion());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se modificó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void eliminarOperario(long identifiacion) {

        setIdentificacion(identifiacion);

        CConexion objetoConexion = new CConexion();

        String consulta = "DELETE FROM operario WHERE operario.OID = ?";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setLong(1, getIdentificacion());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se Eliminó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void seleccionarOperario(JTable paramTablaOperarios, JTextField paramIdentificacion,
            JTextField paramNombre, JTextField paramApellido, JTextField paramTelefono, JTextField paramCorreo,
            JTextField paramCiudad, JTextField paramLocalidad, JTextField paramCargo, JComboBox paramGenero) {

        try {

            int fila = paramTablaOperarios.getSelectedRow();

            if (fila >= 0) {

                paramIdentificacion.setText(paramTablaOperarios.getValueAt(fila, 0).toString());
                paramNombre.setText(paramTablaOperarios.getValueAt(fila, 1).toString());
                paramApellido.setText(paramTablaOperarios.getValueAt(fila, 2).toString());
                paramTelefono.setText(paramTablaOperarios.getValueAt(fila, 3).toString());
                paramCorreo.setText(paramTablaOperarios.getValueAt(fila, 4).toString());
                paramCiudad.setText(paramTablaOperarios.getValueAt(fila, 5).toString());
                paramLocalidad.setText(paramTablaOperarios.getValueAt(fila, 6).toString());
                paramGenero.setSelectedItem(paramTablaOperarios.getValueAt(fila, 7));
                paramCargo.setText(paramTablaOperarios.getValueAt(fila, 8).toString());
                

            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }

    }
}
