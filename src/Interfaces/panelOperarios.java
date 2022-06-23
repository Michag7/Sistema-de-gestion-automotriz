package Interfaces;

import Clases.Contrato;
import Clases.Operario;
import Clases.gestionCeldas;
import static Interfaces.MenuP.content;
import TextPrompt.TextPrompt;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

public class panelOperarios extends javax.swing.JPanel implements MouseListener {

    Operario operario = new Operario();
    Contrato contrato = new Contrato();

    public panelOperarios() {
        initComponents();
        operario.mostrarOperarios(tablaOperarios);
        imageLabelTableO();
        iniciarPopMenu();

        tablaOperarios.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tablaOperarios.getTableHeader().setOpaque(false);
        tablaOperarios.getTableHeader().setBackground(Color.GREEN);
        tablaOperarios.addMouseListener(this);

        TextPrompt campo1 = new TextPrompt("Ingrese el Operario a buscar...", campoFiltro);

        tablaOperarios.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesME = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        nuevoP = new javax.swing.JPanel();
        nuevoL = new javax.swing.JLabel();
        operariosL = new javax.swing.JLabel();
        campoFiltro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaOperarios = new Componentes.Table();
        comboBoxFiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addGroup(nuevoPLayout.createSequentialGroup()
                .addComponent(nuevoL, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        nuevoPLayout.setVerticalGroup(
            nuevoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevoPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nuevoL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(nuevoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, 132, 30));

        operariosL.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        operariosL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        operariosL.setText("Operarios");
        jPanel1.add(operariosL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 139, -1));

        campoFiltro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        campoFiltro.setForeground(new java.awt.Color(204, 204, 204));
        campoFiltro.setBorder(null);
        campoFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoFiltroMousePressed(evt);
            }
        });
        campoFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoFiltroKeyReleased(evt);
            }
        });
        jPanel1.add(campoFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 420, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 420, 10));

        tablaOperarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaOperarios);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1030, 340));

        comboBoxFiltro.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        comboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identificacion", "Nombre", "Apellido", "Contrato id" }));
        comboBoxFiltro.setBorder(null);
        jPanel1.add(comboBoxFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 120, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Filtro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 40, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void campoFiltroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoFiltroMousePressed
        campoFiltro.setText("");

        operario.mostrarOperarios(tablaOperarios);

        imageLabelTableO();
    }//GEN-LAST:event_campoFiltroMousePressed

    private void nuevoLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoLMouseClicked
        panelNuevoOpe_Con p1 = new panelNuevoOpe_Con();
        showPanel(p1);
    }//GEN-LAST:event_nuevoLMouseClicked

    private void campoFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFiltroKeyReleased
        String paramFiltro = comboBoxFiltro.getSelectedItem().toString();
        String filtro = campoFiltro.getText();
        operario.filtrarOperario(tablaOperarios, filtro, paramFiltro);

        if ((campoFiltro.getText()).length() < 1) {

            operario.mostrarOperarios(tablaOperarios);
        }

        imageLabelTableO();

    }//GEN-LAST:event_campoFiltroKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoFiltro;
    private javax.swing.JComboBox<String> comboBoxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nuevoL;
    private javax.swing.JPanel nuevoP;
    private javax.swing.JPopupMenu opcionesME;
    private javax.swing.JLabel operariosL;
    private Componentes.Table tablaOperarios;
    // End of variables declaration//GEN-END:variables

    public void iniciarPopMenu() {

        JMenuItem modificarOperario = new JMenuItem("Modificar Informacion");
        JMenuItem eliminarOperario = new JMenuItem("Rescindir Contrato");

        opcionesME.add(modificarOperario);
        opcionesME.add(eliminarOperario);

        tablaOperarios.setComponentPopupMenu(opcionesME);

        modificarOperario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int fila = tablaOperarios.getSelectedRow();

                if (fila >= 0) {
                    panelModificarOperario p1 = new panelModificarOperario();

                    operario.seleccionarOperario(tablaOperarios, p1.getCampoIdentificacion(), p1.getCampoNombre(), p1.getCampoApellido(),
                            p1.getCampoTelefono(), p1.getCampoCorreo(), p1.getCampoCiudad(), p1.getCampoLocalidad(), p1.getCampoCargo(), p1.getComboboxGenero());

                    showPanel(p1);
                } else {
                    JOptionPane.showMessageDialog(null, "Fila no seleccionada");
                }

            }
        });

        eliminarOperario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int fila = tablaOperarios.getSelectedRow();

                    if (fila >= 0) {

                        int codigoContrato = Integer.parseInt(tablaOperarios.getValueAt(fila, 9).toString());
                        contrato.eliminarContrato(codigoContrato);
                        operario.mostrarOperarios(tablaOperarios);

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

        panel.setSize(1140, 570);
        panel.setLocation(0, 0);

        content.removeAll();
        content.add(panel);
        content.revalidate();
        content.repaint();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int fila = tablaOperarios.rowAtPoint(e.getPoint());
        int columna = tablaOperarios.columnAtPoint(e.getPoint());

        if (columna == 10) {
            panelVerContrato p1 = new panelVerContrato();

            contrato.verContrato(tablaOperarios, p1.getCodigoL(), p1.getInicioL(), p1.getFinL(), p1.getTipoL(), p1.getSalarioL(), p1.getJornadaL());

            showPanel(p1);

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

    public void imageLabelTableO() {
        tablaOperarios.getColumnModel().getColumn(10).setCellRenderer(new gestionCeldas("Contrato"));

        tablaOperarios.getColumnModel().getColumn(10).setPreferredWidth(0);
        tablaOperarios.getColumnModel().getColumn(9).setPreferredWidth(50);
        tablaOperarios.getColumnModel().getColumn(8).setPreferredWidth(100);
        tablaOperarios.getColumnModel().getColumn(6).setPreferredWidth(100);
        tablaOperarios.getColumnModel().getColumn(5).setPreferredWidth(70);
        tablaOperarios.getColumnModel().getColumn(4).setPreferredWidth(180);

    }
}
