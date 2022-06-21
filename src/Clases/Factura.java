//PROYECTO DESARROLLO DE SOFTWARE
package Clases;

import Conexion.CConexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Factura {

    private LocalDate fechaFacturacion;
    private int valorTotal;
    private Administrador facturador;

    public Factura() {
        this.fechaFacturacion = null;
        this.valorTotal = 0;
        this.facturador = null;
    }

    public Factura(LocalDate fechaFacturacion, int valorTotal, Administrador facturador) {
        this.fechaFacturacion = fechaFacturacion;
        this.valorTotal = valorTotal;
        this.facturador = facturador;
    }

    public LocalDate getFechaFacturacion() {
        return fechaFacturacion;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public Administrador getFacturador() {
        return facturador;
    }

    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public void setFacturador(Administrador facturador) {
        this.facturador = facturador;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void insertarFactura(int valorTotal, LocalDate fechaFacturacion, Administrador facturador) {

        setValorTotal(valorTotal);
        setFechaFacturacion(fechaFacturacion);
        setFacturador(facturador);

        CConexion objetoConexion = new CConexion();

        String consulta = "insert into factura (f_valortotal, f_fechafacturacion, AID) values (?,?,?);";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1, getValorTotal());
            cs.setString(2, getFechaFacturacion().toString());
            cs.setLong(3, getFacturador().getIdentificacion());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se insertó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void mostrarFactura(JTable paramTablaFacturas) {

        CConexion objetoConexion = new CConexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Codigo");
        modelo.addColumn("Valor total");
        modelo.addColumn("Fecha Facturacion");
        modelo.addColumn("Facturador");

        paramTablaFacturas.setModel(modelo);

        sql = "select * from factura;";

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

            paramTablaFacturas.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void eliminarFactura(int codigo) {

        CConexion objetoConexion = new CConexion();

        String consulta = "DELETE FROM factura WHERE factura.FID =?";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1, codigo);

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se Eliminó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void filtrarFactura(JTable paramTablaFacturas, String filtro, String paramFiltro) {

        CConexion objetoConexion = new CConexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Codigo");
        modelo.addColumn("Valor total");
        modelo.addColumn("Fecha Facturacion");
        modelo.addColumn("Facturador");

        paramTablaFacturas.setModel(modelo);

        if (paramFiltro.equals("Codigo")) {
            sql = "select * from factura where cast(FID as varchar) like '" + filtro + "%';";
        }

        if (paramFiltro.equals("Valor total")) {
            sql = "select * from factura where  cast(f_valortotal as varchar) like '" + filtro + "%'";
        }
        if (paramFiltro.equals("Fecha Facturacion")) {
            sql = "select * from factura where  f_fechafacturacion like '%"
                    + filtro + "%';";
        }
        if (paramFiltro.equals("Administrador")) {
            sql = "select * from factura where  cast(aid as varchar) like '" + filtro + "%';";
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

            paramTablaFacturas.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

}
