/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexion.CConexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.postgresql.core.Encoding;

public class Contrato {

    public enum tipoContrato {
        INDEFINIDO, DEFINIDO, POR_LABOR
    }

    private int contratoID;
    private LocalDate contrato_FechaInicio;
    private LocalDate contrato_FechaFinalizacion;
    private tipoContrato contrato_tipo;
    private long contrato_salario;
    private String contrato_jornada = "8:00AM - 6:00PM";

    public Contrato() {
        this.contratoID = 0;
        this.contrato_FechaInicio = null;
        this.contrato_FechaFinalizacion = null;
        this.contrato_tipo = null;
        this.contrato_salario = 0;

    }

    public Contrato(int contratoID, LocalDate contrato_FechaInicio, LocalDate contrato_FechaFinalizacion, tipoContrato contrato_tipo, long contrato_salario) {
        this.contratoID = contratoID;
        this.contrato_FechaInicio = contrato_FechaInicio;
        this.contrato_FechaFinalizacion = contrato_FechaFinalizacion;
        this.contrato_tipo = contrato_tipo;
        this.contrato_salario = contrato_salario;
    }



    // metodos get
    
    
    public int getContratoID() {
        return contratoID;
    }

    public LocalDate getContrato_FechaFinalizacion() {
        return contrato_FechaFinalizacion;
    }

    public LocalDate getContrato_FechaInicio() {
        return contrato_FechaInicio;
    }

    public String getContrato_jornada() {
        return contrato_jornada;
    }

    public long getContrato_salario() {
        return contrato_salario;
    }

    public tipoContrato getContrato_tipo() {
        return contrato_tipo;
    }

    // metodos set

    public void setContratoID(int contratoID) {
        this.contratoID = contratoID;
    }
   
    
    public void setContrato_FechaFinalizacion(LocalDate contrato_FechaFinalizacion) {
        this.contrato_FechaFinalizacion = contrato_FechaFinalizacion;
    }

    public void setContrato_FechaInicio(LocalDate contrato_FechaInicio) {
        this.contrato_FechaInicio = contrato_FechaInicio;
    }

    public void setContrato_jornada(String contrato_jornada) {
        this.contrato_jornada = contrato_jornada;
    }

    public void setContrato_salario(long contrato_salario) {
        this.contrato_salario = contrato_salario;
    }

    public void setContrato_tipo(tipoContrato contrato_tipo) {
        this.contrato_tipo = contrato_tipo;
    }

    public void verContrato(JTable paramTablaOperarios, JLabel paramContratoID, JLabel paramFechaInicio, JLabel paramFechaFinal,
            JLabel paramTipoContrato, JLabel paramSalario, JLabel paramJornada) {

        CConexion objetoConexion = new CConexion();

        String sql = "";

        Statement st;

        try {

            int fila = paramTablaOperarios.getSelectedRow();

            if (fila >= 0) {

                int contratoID1 = Integer.parseInt(paramTablaOperarios.getValueAt(fila, 9).toString());

                sql = "select * from contrato where contrato_id = " + contratoID1 + ";";

                st = objetoConexion.establecerConexion().createStatement();

                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {

                    paramContratoID.setText(rs.getString(1));
                    paramFechaInicio.setText(rs.getString(2));
                    paramFechaFinal.setText(rs.getString(3));
                    paramTipoContrato.setText(rs.getString(4));
                    paramSalario.setText(rs.getString(5));
                    paramJornada.setText(rs.getString(6));

                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }
    }

    public void insertarContrato(LocalDate contrato_FechaInicio, LocalDate contrato_FechaFinalizacion, tipoContrato contrato_tipo, long contrato_salario) {

        setContrato_FechaInicio(contrato_FechaInicio);
        setContrato_FechaFinalizacion(contrato_FechaFinalizacion);
        setContrato_tipo(contrato_tipo);
        setContrato_salario(contrato_salario);

        CConexion objetoConexion = new CConexion();

        String consulta = "insert into contrato(contrato_fechainicio, contrato_fechafinalizacion, contrato_tipo, contrato_salario, contrato_jornada) values (?,?,?,?,?);";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);

            cs.setString(1, getContrato_FechaInicio().toString());
            cs.setString(2, getContrato_FechaFinalizacion().toString());
            cs.setString(3, getContrato_tipo().toString());
            cs.setLong(4, getContrato_salario());
            cs.setString(5, getContrato_jornada());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se insertó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }

    public void eliminarContrato(int codigoContrato) {

        setContratoID(codigoContrato);

        CConexion objetoConexion = new CConexion();

        String consulta = "DELETE FROM contrato WHERE contrato.contrato_id= ?";

        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1, getContratoID());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se Eliminó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }

    }
}
