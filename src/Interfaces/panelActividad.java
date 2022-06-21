package Interfaces;

import Clases.Actividad;
import static Interfaces.MenuP.content;
import TextPrompt.TextPrompt;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class panelActividad extends javax.swing.JPanel {

    Actividad actividad = new Actividad();

    public panelActividad() {
        initComponents();
        actividad.mostrarActividad(tablaActividades);
        iniciarPopMenu();
        tablaActividades.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tablaActividades.getTableHeader().setOpaque(false);
        tablaActividades.getTableHeader().setBackground(Color.GREEN);
        TextPrompt campo1 = new TextPrompt("Ingrese el Servicio a buscar...", campoFiltro);

        tablaActividades.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesME = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        clientesL = new javax.swing.JLabel();
        campoFiltro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        nuevoP = new javax.swing.JPanel();
        nuevoL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaActividades = new Componentes.Table();
        comboBoxFiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1050, 560));
        setPreferredSize(new java.awt.Dimension(1050, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clientesL.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        clientesL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientesL.setText("Servicios");
        jPanel1.add(clientesL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 139, -1));

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

        nuevoP.setBackground(new java.awt.Color(54, 38, 87));
        nuevoP.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N

        nuevoL.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nuevoL.setForeground(new java.awt.Color(255, 255, 255));
        nuevoL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoL.setText("Nuevo");
        nuevoL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout nuevoPLayout = new javax.swing.GroupLayout(nuevoP);
        nuevoP.setLayout(nuevoPLayout);
        nuevoPLayout.setHorizontalGroup(
            nuevoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevoPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevoL, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        nuevoPLayout.setVerticalGroup(
            nuevoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevoPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevoL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(nuevoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, 132, 30));

        tablaActividades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaActividades);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1030, 340));

        comboBoxFiltro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        comboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Descripcion", "Costo", "Operario" }));
        comboBoxFiltro.setBorder(null);
        jPanel1.add(comboBoxFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 120, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Filtro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 40, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoLMouseClicked
        panelNuevaActividad p1 = new panelNuevaActividad();
        showPanel(p1);
    }//GEN-LAST:event_nuevoLMouseClicked

    private void campoFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFiltroKeyReleased
        String tipoFiltro = comboBoxFiltro.getSelectedItem().toString();
        String filtro = campoFiltro.getText();

        actividad.filtroActividad(tablaActividades, filtro, tipoFiltro);

        if ((campoFiltro.getText()).length() < 1) {

            actividad.mostrarActividad(tablaActividades);
        }


    }//GEN-LAST:event_campoFiltroKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoFiltro;
    private javax.swing.JLabel clientesL;
    private javax.swing.JComboBox<String> comboBoxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nuevoL;
    private javax.swing.JPanel nuevoP;
    private javax.swing.JPopupMenu opcionesME;
    private Componentes.Table tablaActividades;
    // End of variables declaration//GEN-END:variables

    public void iniciarPopMenu() {

        JMenuItem modificar = new JMenuItem("Modificar", getIcon("/Imagenes/herramientas-y-utensilios.png", 16, 16));
        JMenuItem eliminar = new JMenuItem("Eliminar");
        
       
        opcionesME.add(modificar);
        opcionesME.add(eliminar);

        tablaActividades.setComponentPopupMenu(opcionesME);

        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int fila = tablaActividades.getSelectedRow();

                    if (fila >= 0) {
                        panelModificarActividad p1 = new panelModificarActividad();

                        actividad.seleccionarActividad(tablaActividades, p1.getCampoCodigo(), p1.getCampoDescripcion(), p1.getCampoValor());
                        getIcon("/Imagenes/carrr.png", 12, 12);
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
                    int fila = tablaActividades.getSelectedRow();

                    if (fila >= 0) {

                        String codigoActividad = tablaActividades.getValueAt(fila, 0).toString();
                        actividad.eliminarActividad(codigoActividad);
                        actividad.mostrarActividad(tablaActividades);

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

    public Icon getIcon(String ruta, int width, int height) {

        Icon mIcono = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(width, height, 0));
        return mIcono;
    }

}
