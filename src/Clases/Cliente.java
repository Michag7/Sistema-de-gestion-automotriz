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

public class Cliente extends Persona {

    public Cliente() {
        super(0, null, null, 0, null, null, null, null);
    }

    public Cliente(long identificacion, String nombre, String apellido, long telefono, String correo, String ciudad, String direccion, Genero genero) {
        super(identificacion, nombre, apellido, telefono, correo, ciudad, direccion, genero);
    }

    public void insertarCliente(long identificacion, String nombre, String apellido, Genero genero, long telefono, String correoElectronico, String ciudad, String localidad) {

        setIdentificacion(identificacion);
        setNombre(nombre);
        setApellido(apellido);
        setGenero(genero);
        setTelefono(telefono);
        setCorreo(correoElectronico);
        setCiudad(ciudad);
        setDirreccion(localidad);

        CConexion objetoConexion = new CConexion();

        String consulta = "insert into cliente (CID , c_nombre, c_apellido, c_telefono, c_correo, c_ciudad, c_direccion, c_generobiologico) values (?,?,?,?,?,?,?,?);";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setLong(1, getIdentificacion());
            cs.setString(2, getNombre());
            cs.setString(3, getApellido());
            cs.setLong(4, getTelefono());
            cs.setString(5, getCorreo());
            cs.setString(6, getCiudad());
            cs.setString(7, getDireccion());
            cs.setString(8, String.valueOf(getGenero()));

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se insertó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void mostrarCliente(JTable paramTablaClientes) {

        CConexion objetoConexion = new CConexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Identificación");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Localidad");
        modelo.addColumn("Genero biologico");

        paramTablaClientes.setModel(modelo);

        sql = "select * from cliente;";

        String[] datos = new String[8];

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

                modelo.addRow(datos);
            }

            paramTablaClientes.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void filtroCliente(JTable paramTablaClientes, String textoFiltro, String paramFiltro) {

        CConexion objetoConexion = new CConexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Identificación");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Localidad");
        modelo.addColumn("Genero B");

        paramTablaClientes.setModel(modelo);

        
        if (paramFiltro.equals("Identificacion")) {
            sql = "select * from cliente where cast(CID as varchar) like '" + textoFiltro + "%';";
        }
        if (paramFiltro.equals("Nombre")) {
            sql = "select * from cliente where c_nombre like '%" + textoFiltro + "%';";
        }
        if (paramFiltro.equals("Apellido")) {
            sql = "select * from cliente where c_apellido like '%" + textoFiltro + "%';";
        }
       
       

        String[] datos = new String[8];

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

                modelo.addRow(datos);
            }

            paramTablaClientes.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void modificarCliente(long identificacion, String nombre, String apellido, Genero genero, long telefono, String correoElectronico, String ciudad, String localidad) {

        setIdentificacion(identificacion);
        setNombre(nombre);
        setApellido(apellido);
        setGenero(genero);
        setTelefono(telefono);
        setCorreo(correoElectronico);
        setCiudad(ciudad);
        setDirreccion(localidad);

        CConexion objetoConexion = new CConexion();

        String consulta = "UPDATE cliente SET c_nombre = ?, c_apellido = ?, c_telefono = ?, c_correo = ?, c_ciudad = ?, c_direccion = ?, c_generobiologico = ? WHERE cliente.CID = ?;";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);

            cs.setString(1, getNombre());
            cs.setString(2, getApellido());
            cs.setLong(3, getTelefono());
            cs.setString(4, getCorreo());
            cs.setString(5, getCiudad());
            cs.setString(6, getDireccion());
            cs.setString(7, String.valueOf(getGenero()));

            cs.setLong(8, getIdentificacion());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se modificó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void eliminarCliente(long identifiacion) {

        setIdentificacion(identifiacion);

        CConexion objetoConexion = new CConexion();

        String consulta = "DELETE FROM cliente WHERE cliente.CID = ?";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setLong(1, getIdentificacion());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se Eliminó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void seleccionarCliente(JTable paramTablaClientes, JTextField paramIdentificacion,
            JTextField paramNombre, JTextField paramApellido, JTextField paramTelefono, JTextField paramCorreo,
            JTextField paramCiudad, JTextField paramLocalidad, JComboBox paramGenero) {

        try {

            int fila = paramTablaClientes.getSelectedRow();

            if (fila >= 0) {

                paramIdentificacion.setText(paramTablaClientes.getValueAt(fila, 0).toString());
                paramNombre.setText(paramTablaClientes.getValueAt(fila, 1).toString());
                paramApellido.setText(paramTablaClientes.getValueAt(fila, 2).toString());
                paramTelefono.setText(paramTablaClientes.getValueAt(fila, 3).toString());
                paramCorreo.setText(paramTablaClientes.getValueAt(fila, 4).toString());
                paramCiudad.setText(paramTablaClientes.getValueAt(fila, 5).toString());
                paramLocalidad.setText(paramTablaClientes.getValueAt(fila, 6).toString());
                paramGenero.setSelectedItem(paramTablaClientes.getValueAt(fila, 7).toString());

            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }

    }

    public String buscarCliente(long identificacion) {

        CConexion objetoConexion = new CConexion();

        String sql = "";

        String verificacion = "";

        sql = "select c_nombre from cliente where CID = " + identificacion + "";

        Statement st;

        try {

            st = objetoConexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                verificacion = rs.getString(1);

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error: en buscar cliente" + e.toString());

        }

        return verificacion;
    }

}
