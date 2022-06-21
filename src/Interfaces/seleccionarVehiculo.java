package Interfaces;

import Clases.gestionCeldas;
import Conexion.CConexion;
import TextPrompt.TextPrompt;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class seleccionarVehiculo extends javax.swing.JFrame implements MouseListener {

    panelFacturacion panelFact;

    public seleccionarVehiculo(panelFacturacion panelFact) {
        initComponents();

        this.panelFact = panelFact;
        mostrarVehiculo(tSeleccionarVehiculo, "Mostrar", null);
        setLocationRelativeTo(null);
        tSeleccionarVehiculo.addMouseListener(this);
        establecerTamañoColums();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tSeleccionarVehiculo = new Componentes.Table();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 34, 28));

        tSeleccionarVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tSeleccionarVehiculo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 480, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private Componentes.Table tSeleccionarVehiculo;
    // End of variables declaration//GEN-END:variables

    public void mostrarVehiculo(JTable paramTablaVehiculos, String funcion, String filtro) {

        CConexion objetoConexion = new CConexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Placa");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("");

        int dueño = Integer.parseInt(panelFact.getCampoIdentificacion().getText());

        paramTablaVehiculos.setModel(modelo);

        if (funcion.equals("Mostrar")) {
            sql = "select v_placa, v_marca, v_modelo from vehiculo where CID = " + dueño + ";";
        } else {
            sql = "select v_placa, v_marca, v_modelo from vehiculo where v_placa like '" + filtro + "%' or v_marca like '%"
                    + filtro + "%' or cast(v_modelo as varchar) like '" + filtro + "%';";

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
                datos[3] = "Seleccionarcar";

                modelo.addRow(datos);
            }

            paramTablaVehiculos.setModel(modelo);

            imageTableSelect();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void imageTableSelect() {
        tSeleccionarVehiculo.getColumnModel().getColumn(3).setCellRenderer(new gestionCeldas("Seleccionarcar"));

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        int fila = tSeleccionarVehiculo.rowAtPoint(e.getPoint());
        int columna = tSeleccionarVehiculo.columnAtPoint(e.getPoint());

        if (columna == 3) {

            seleccionVehiculo(panelFact.getCampoPlaca(), panelFact.getCampoMarca(), panelFact.getCampoModelo(),
                    panelFact.getCampoColor(), panelFact.getComboboxTipoCar());
            this.dispose();

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void seleccionVehiculo(JTextField paramPlaca,
            JTextField paramMarca, JTextField paramModelo, JTextField paramColor, JComboBox paramTipo) {

        CConexion objetoConexion = new CConexion();

        String sql = "";

        Statement st;

        try {

            int fila = tSeleccionarVehiculo.getSelectedRow();

            if (fila >= 0) {

                String placa = tSeleccionarVehiculo.getValueAt(fila, 0).toString();

                sql = "select * from vehiculo where v_placa = '" + placa + "';";

                st = objetoConexion.establecerConexion().createStatement();

                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {

                    paramPlaca.setText(rs.getString(1));
                    paramMarca.setText(rs.getString(2));
                    paramModelo.setText(rs.getString(3));
                    paramColor.setText(rs.getString(4));
                    paramTipo.setSelectedItem(rs.getString(5));

                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }
    }

    public void establecerTamañoColums() {

        tSeleccionarVehiculo.getColumnModel().getColumn(3).setPreferredWidth(0);

    }
}
