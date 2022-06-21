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

public class seleccionarCliente extends javax.swing.JFrame implements MouseListener {

    panelFacturacion panelFact;

    public seleccionarCliente(panelFacturacion panelFact) {
        initComponents();

        this.panelFact = panelFact;
        mostrarCliente(tSeleccionarCliente, "Mostrar", null);
        setLocationRelativeTo(null);
        tSeleccionarCliente.addMouseListener(this);
        TextPrompt campo1 = new TextPrompt("Ingrese el Cliente a buscar...", campoFiltro);
        establecerTamañoColums();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tSeleccionarCliente = new Componentes.Table();
        campoFiltro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

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

        tSeleccionarCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tSeleccionarCliente);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 480, 210));

        campoFiltro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        campoFiltro.setForeground(new java.awt.Color(204, 204, 204));
        campoFiltro.setBorder(null);
        campoFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoFiltroKeyReleased(evt);
            }
        });
        jPanel1.add(campoFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 420, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 380, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void campoFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFiltroKeyReleased
        mostrarCliente(tSeleccionarCliente, "", campoFiltro.getText());

        if ((campoFiltro.getText()).length() < 1) {

            mostrarCliente(tSeleccionarCliente, "Mostrar", null);
        }

        imageTableSelect();
        establecerTamañoColums();
    }//GEN-LAST:event_campoFiltroKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private Componentes.Table tSeleccionarCliente;
    // End of variables declaration//GEN-END:variables

    public void mostrarCliente(JTable paramTablaClientes, String funcion, String filtro) {

        CConexion objetoConexion = new CConexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Identificación");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("");

        paramTablaClientes.setModel(modelo);

        if (funcion.equals("Mostrar")) {
            sql = "select CID, c_nombre, c_apellido from cliente;";
        } else {
            sql = "select CID, c_nombre, c_apellido from cliente where c_nombre like '%" + filtro + "%' or c_apellido like '%"
                    + filtro + "%' or cast(CID as varchar) like '" + filtro + "%';";

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
                datos[3] = "Seleccionar";

                modelo.addRow(datos);
            }

            paramTablaClientes.setModel(modelo);

            imageTableSelect();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    public void imageTableSelect() {
        tSeleccionarCliente.getColumnModel().getColumn(3).setCellRenderer(new gestionCeldas("Seleccionar"));

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        int fila = tSeleccionarCliente.rowAtPoint(e.getPoint());
        int columna = tSeleccionarCliente.columnAtPoint(e.getPoint());

        if (columna == 3) {

            seleccionCliente(panelFact.getCampoIdentificacion(), panelFact.getCampoNombre(), panelFact.getCampoApellido(),
                    panelFact.getCampoTelefono(), panelFact.getCampoCorreo(), panelFact.getCampoCiudad(),
                    panelFact.getCampoLocalidad(), panelFact.getComboboxGenero());
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

    public void seleccionCliente(JTextField paramIdentificacion,
            JTextField paramNombre, JTextField paramApellido, JTextField paramTelefono, JTextField paramCorreo,
            JTextField paramCiudad, JTextField paramLocalidad, JComboBox paramGenero) {

        CConexion objetoConexion = new CConexion();

        String sql = "";

        Statement st;

        try {

            int fila = tSeleccionarCliente.getSelectedRow();

            if (fila >= 0) {

                int cid = Integer.parseInt(tSeleccionarCliente.getValueAt(fila, 0).toString());

                sql = "select * from cliente where CID = " + cid + ";";

                st = objetoConexion.establecerConexion().createStatement();

                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {

                    paramIdentificacion.setText(rs.getString(1));
                    paramNombre.setText(rs.getString(2));
                    paramApellido.setText(rs.getString(3));
                    paramTelefono.setText(rs.getString(4));
                    paramCorreo.setText(rs.getString(5));
                    paramCiudad.setText(rs.getString(6));
                    paramLocalidad.setText(rs.getString(7));
                    paramGenero.setSelectedItem(rs.getString(8));

                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }
    }
    
    public void establecerTamañoColums(){
    
    tSeleccionarCliente.getColumnModel().getColumn(3).setPreferredWidth(0);
    
    }

}
