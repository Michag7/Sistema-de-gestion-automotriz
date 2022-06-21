package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class CConexion {

    Connection conectar = null;

    String usuario = "postgres";
    String contrasenia = "Messi1o101o";
    String bd = "BD_ProyectoFinal";
    String ip = "localhost";
    String puerto = "5432";

    String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + bd;

    public Connection establecerConexion() {

        try {
            Class.forName("org.postgresql.Driver");

            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);

             //JOptionPane.showMessageDialog(null,"Se conectó correctamente a la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.toString());
        }

        return conectar;

    }

}
