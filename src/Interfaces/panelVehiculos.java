package Interfaces;

import Clases.Vehiculo;
import static Interfaces.MenuP.content;
import TextPrompt.TextPrompt;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class panelVehiculos extends javax.swing.JPanel {

    Vehiculo vehiculo = new Vehiculo();

    public panelVehiculos() {
        initComponents();
        vehiculo.mostrarVehiculo(tablaVehiculos);
        iniciarPopMenu();
        tablaVehiculos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tablaVehiculos.getTableHeader().setOpaque(false);
        tablaVehiculos.getTableHeader().setBackground(Color.GREEN);
        
        TextPrompt campo1 = new TextPrompt("Ingrese el Vehiculo a buscar...", campoFiltro);

        tablaVehiculos.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesME = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        vehiculosL = new javax.swing.JLabel();
        campoFiltro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVehiculos = new Componentes.Table();
        comboBoxFiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1050, 560));
        setPreferredSize(new java.awt.Dimension(1050, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vehiculosL.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        vehiculosL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vehiculosL.setText("Vehiculos");
        jPanel1.add(vehiculosL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 139, -1));

        campoFiltro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        campoFiltro.setForeground(new java.awt.Color(204, 204, 204));
        campoFiltro.setBorder(null);
        campoFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoFiltroKeyReleased(evt);
            }
        });
        jPanel1.add(campoFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 420, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 420, 10));

        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaVehiculos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1030, 340));

        comboBoxFiltro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        comboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Placa", "Propietario" }));
        comboBoxFiltro.setBorder(null);
        jPanel1.add(comboBoxFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 120, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Filtro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 40, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void campoFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFiltroKeyReleased

        String paramFiltro = comboBoxFiltro.getSelectedItem().toString();
        String filtro = campoFiltro.getText();

        vehiculo.filtrarVehiculo(tablaVehiculos, filtro, paramFiltro);

        if ((campoFiltro.getText()).length() < 1) {

            vehiculo.mostrarVehiculo(tablaVehiculos);
        }

    }//GEN-LAST:event_campoFiltroKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoFiltro;
    private javax.swing.JComboBox<String> comboBoxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu opcionesME;
    private Componentes.Table tablaVehiculos;
    private javax.swing.JLabel vehiculosL;
    // End of variables declaration//GEN-END:variables

    public void iniciarPopMenu() {

        JMenuItem modificar = new JMenuItem("Modificar");
        JMenuItem eliminar = new JMenuItem("Eliminar");

        opcionesME.add(modificar);
        opcionesME.add(eliminar);

        tablaVehiculos.setComponentPopupMenu(opcionesME);

        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int fila = tablaVehiculos.getSelectedRow();

                    if (fila >= 0) {

                        panelModificarVehiculo p1 = new panelModificarVehiculo();

                        vehiculo.seleccionarVehiculo(tablaVehiculos, p1.getCampoPlaca(), p1.getCampoMarca(), p1.getCampoModelo(), p1.getCampoColor(), p1.getComboboxTipoCar());

                        showPanel(p1);

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
                    int fila = tablaVehiculos.getSelectedRow();

                    if (fila >= 0) {

                        String placa = tablaVehiculos.getValueAt(fila, 0).toString();
                        vehiculo.eliminarVehiculo(placa);
                        vehiculo.mostrarVehiculo(tablaVehiculos);

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

    public void showPanel(JPanel panel) {

        panel.setSize(1050, 560);
        panel.setLocation(0, 0);

        content.removeAll();
        content.add(panel);
        content.revalidate();
        content.repaint();

    }
}
