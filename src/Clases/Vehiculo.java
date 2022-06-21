//PROYECTO DESARROLLO DE SOFTWARE
package Clases;

import Conexion.CConexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Vehiculo {

    public enum Tipo {
        MOTOCICLETA, MOTOCARRO, AUTOMÓVIL, CAMIONETA, MICROBÚS, BUS, BUSETA, CAMIÓN, VOLQUETA
    }

    private Tipo tipo;
    private String placa;
    private short modelo;
    private String color;
    private String marca;
    private Cliente propietario;

    public Vehiculo() {
        this.placa = "";
        this.modelo = 0;
        this.color = "";
        this.marca = "";
        this.tipo = null;
        this.propietario = null;
    }

//Constructor de la clase Vehiculo
    public Vehiculo(String placa, short modelo, String color, String marca, Tipo tipo) {

//        if (placa == null || "".equals(placa)) {
//            throw new IllegalArgumentException("Debe ingresar la placa del vehiculo");
//        }
//
//        if (!(contarDigitos(modelo) == 4)) {
//            throw new IllegalArgumentException("El número del modelo debe ser solamente 4 digitos");
//        }
//
//        if (color == null || "".equals(color)) {
//            throw new IllegalArgumentException("Debe ingresar el color del vehiculo");
//        }
//
//        if (marca == null) {
//            throw new IllegalArgumentException("Debe ingresar la marca del vehiculo");
//        }
//
//        if (tipo == null) {
//            throw new IllegalArgumentException("Debe ingresar el tipo de vehiculo");
//        }
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.tipo = tipo;
    }

    //Métodos de acceso - getter
    public Tipo getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public short getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(short modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void insertarVehiculo(String placa, String marca, short modelo, String color, Tipo tipo, Cliente propietario) {

        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setColor(color);
        setTipo(tipo);
        setPropietario(propietario);

        CConexion objetoConexion = new CConexion();

        String consulta = "insert into Vehiculo (v_placa, v_marca, v_modelo, v_color, v_tipo, CID) values (?,?,?,?,?,?);";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, getPlaca());
            cs.setString(2, getMarca());
            cs.setShort(3, getModelo());
            cs.setString(4, getColor());
            cs.setString(5, String.valueOf(getTipo()));
            cs.setLong(6, getPropietario().getIdentificacion());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se insertó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public String buscarVehiculo(String placa) {

        CConexion objetoConexion = new CConexion();

        String sql = "";

        String verificacion = "";

        sql = "select v_placa from vehiculo where v_placa = '" + placa + "';";

        Statement st;

        try {

            st = objetoConexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                verificacion = rs.getString(1);

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error  placacaaaa:" + e.toString());

        }

        return verificacion;
    }

    public void mostrarVehiculo(JTable paramTablaVehiculo) {

        CConexion objetoConexion = new CConexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Placa");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Color");
        modelo.addColumn("Tipo");
        modelo.addColumn("Propietario");

        paramTablaVehiculo.setModel(modelo);

        sql = "select * from vehiculo;";

        String[] datos = new String[6];

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

                modelo.addRow(datos);
            }

            paramTablaVehiculo.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void filtrarVehiculo(JTable paramTablaVehiculo, String textoFiltro, String paramFiltro) {

        CConexion objetoConexion = new CConexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Placa");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Color");
        modelo.addColumn("Tipo");
        modelo.addColumn("Propietario");

        paramTablaVehiculo.setModel(modelo);

        if (paramFiltro.equals("Placa")) {
            sql = "select * from vehiculo where v_placa like '" + textoFiltro + "%';";
        }

        if (paramFiltro.equals("Propietario")) {
            sql = "select * from vehiculo where cast(CID as varchar) like '" + textoFiltro + "%';";
        }

        String[] datos = new String[6];

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

                modelo.addRow(datos);
            }

            paramTablaVehiculo.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void modificarVehiculo(String placa, String color) {

        setPlaca(placa);
        setColor(color);

        CConexion objetoConexion = new CConexion();

        String consulta = "UPDATE vehiculo SET v_color = ? WHERE vehiculo.v_placa = ?;";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);

            cs.setString(1, getColor());
            cs.setString(2, getPlaca());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se modificó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void eliminarVehiculo(String placa) {

        setPlaca(placa);

        CConexion objetoConexion = new CConexion();

        String consulta = "DELETE FROM vehiculo WHERE vehiculo.v_placa = ?";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, getPlaca());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se Eliminó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void seleccionarVehiculo(JTable paramTablaVehiculo, JTextField paramPlaca,
            JTextField paramMarca, JTextField paramModelo, JTextField paramColor, JComboBox paramTipo) {

        try {

            int fila = paramTablaVehiculo.getSelectedRow();

            if (fila >= 0) {

                paramPlaca.setText(paramTablaVehiculo.getValueAt(fila, 0).toString());
                paramMarca.setText(paramTablaVehiculo.getValueAt(fila, 1).toString());
                paramModelo.setText(paramTablaVehiculo.getValueAt(fila, 2).toString());
                paramColor.setText(paramTablaVehiculo.getValueAt(fila, 3).toString());
                paramTipo.setSelectedItem(paramTablaVehiculo.getValueAt(fila, 4));

            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }

    }

}
