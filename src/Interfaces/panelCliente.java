package Interfaces;

import Clases.Cliente;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import static Interfaces.MenuP.content;
import TextPrompt.TextPrompt;
import java.awt.Font;
import javax.swing.JOptionPane;

public class panelCliente extends javax.swing.JPanel {

    Cliente cliente = new Cliente();

    public panelCliente() {
        initComponents();

        cliente.mostrarCliente(tablaClientes);
        establecerTamañoColumnas();
        iniciarPopMenu();
        TextPrompt campo1 = new TextPrompt("Ingrese el Cliente a buscar...", campoFiltro);

        tablaClientes.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesME = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        clientesL = new javax.swing.JLabel();
        campoFiltro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new Componentes.Table();
        comboBoxFiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clientesL.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        clientesL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientesL.setText("Clientes");
        jPanel1.add(clientesL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 139, -1));

        campoFiltro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        campoFiltro.setForeground(new java.awt.Color(204, 204, 204));
        campoFiltro.setText("Ingrese el nombre del cliente a buscar");
        campoFiltro.setBorder(null);
        campoFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoFiltroKeyReleased(evt);
            }
        });
        jPanel1.add(campoFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 420, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 420, 10));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaClientes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1030, 340));

        comboBoxFiltro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        comboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identificacion", "Nombre", "Apellido" }));
        comboBoxFiltro.setBorder(null);
        jPanel1.add(comboBoxFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 120, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Filtro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 40, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void campoFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFiltroKeyReleased

        String paramFiltro = comboBoxFiltro.getSelectedItem().toString();
        String filtro = campoFiltro.getText();
        cliente.filtroCliente(tablaClientes, filtro, paramFiltro);

        if ((campoFiltro.getText()).length() < 1) {

            cliente.mostrarCliente(tablaClientes);
        }
        establecerTamañoColumnas();
    }//GEN-LAST:event_campoFiltroKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoFiltro;
    private javax.swing.JLabel clientesL;
    private javax.swing.JComboBox<String> comboBoxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu opcionesME;
    private Componentes.Table tablaClientes;
    // End of variables declaration//GEN-END:variables

    public void iniciarPopMenu() {

        JMenuItem modificar = new JMenuItem("Modificar");
        JMenuItem eliminar = new JMenuItem("Eliminar");

        opcionesME.add(modificar);
        opcionesME.add(eliminar);

        tablaClientes.setComponentPopupMenu(opcionesME);

        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int fila = tablaClientes.getSelectedRow();

                    if (fila >= 0) {
                        panelModificarCliente p1 = new panelModificarCliente();

                        cliente.seleccionarCliente(tablaClientes, p1.getCampoIdentificacion(), p1.getCampoNombre(), p1.getCampoApellido(),
                                p1.getCampoTelefono(), p1.getCampoCorreo(), p1.getCampoCiudad(), p1.getCampoLocalidad(), p1.getComboboxGenero());

                        p1.setSize(1050, 560);
                        p1.setLocation(0, 0);

                        content.removeAll();
                        content.add(p1, BorderLayout.CENTER);
                        content.revalidate();
                        content.repaint();

                    } else {
                        JOptionPane.showMessageDialog(null, "Fila no seleccionada");
                    }

                } catch (Exception exc) {

                    JOptionPane.showMessageDialog(null, "Error: " + exc.toString());
                }

            }
        });

        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int fila = tablaClientes.getSelectedRow();

                    if (fila >= 0) {

                        long identificacion = Long.parseLong(tablaClientes.getValueAt(fila, 0).toString());
                        cliente.eliminarCliente(identificacion);
                        cliente.mostrarCliente(tablaClientes);
                        establecerTamañoColumnas();
                    } else {
                        JOptionPane.showMessageDialog(null, "Fila no seleccionada");
                    }

                } catch (Exception exc) {

                    JOptionPane.showMessageDialog(null, "Error: " + exc.toString());
                }

            }
        }
        );

    }

    public void establecerTamañoColumnas() {
        tablaClientes.getColumnModel().getColumn(4).setPreferredWidth(200);

    }

}
