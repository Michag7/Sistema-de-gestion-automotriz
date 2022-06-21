package Interfaces;

import Clases.Factura;
import static Interfaces.MenuP.content;
import TextPrompt.TextPrompt;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class panelFactura extends javax.swing.JPanel {

    Factura factura = new Factura();

    public panelFactura() {
        initComponents();
        factura.mostrarFactura(tablaFacturas);
        iniciarPopMenu();
        tablaFacturas.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tablaFacturas.getTableHeader().setOpaque(false);
        tablaFacturas.getTableHeader().setBackground(Color.GREEN);
        
        TextPrompt campo1 = new TextPrompt("Ingrese la Factura a buscar...", campoFiltro);

        tablaFacturas.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesME = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        facturaL = new javax.swing.JLabel();
        campoFiltro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFacturas = new Componentes.Table();
        comboBoxFiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        facturaL.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        facturaL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facturaL.setText("Facturas");
        jPanel1.add(facturaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 139, -1));

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

        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaFacturas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1030, 340));

        comboBoxFiltro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        comboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Valor total", "Fecha Facturacion", "Administrador" }));
        comboBoxFiltro.setBorder(null);
        jPanel1.add(comboBoxFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 120, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Filtro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 40, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1050, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void campoFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFiltroKeyReleased
        String paramFiltro = comboBoxFiltro.getSelectedItem().toString();
        
        factura.filtrarFactura(tablaFacturas, campoFiltro.getText(), paramFiltro);
        
        
        if ((campoFiltro.getText()).length() < 1) {

            factura.mostrarFactura(tablaFacturas);
        }

    }//GEN-LAST:event_campoFiltroKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoFiltro;
    private javax.swing.JComboBox<String> comboBoxFiltro;
    private javax.swing.JLabel facturaL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu opcionesME;
    private Componentes.Table tablaFacturas;
    // End of variables declaration//GEN-END:variables

    public void iniciarPopMenu() {

        JMenuItem eliminar = new JMenuItem("Eliminar");

        opcionesME.add(eliminar);

        tablaFacturas.setComponentPopupMenu(opcionesME);

        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int fila = tablaFacturas.getSelectedRow();

                    if (fila >= 0) {

                        int codigoActividad = Integer.parseInt(tablaFacturas.getValueAt(fila, 0).toString());
                        factura.eliminarFactura(codigoActividad);
                        factura.mostrarFactura(tablaFacturas);

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
