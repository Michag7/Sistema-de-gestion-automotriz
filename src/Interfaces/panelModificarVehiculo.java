package Interfaces;


import Clases.Vehiculo;
import static Interfaces.MenuP.content;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelModificarVehiculo extends javax.swing.JPanel {

    Vehiculo vehiculo = new Vehiculo();

    public panelModificarVehiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        modificarUsuarioL = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        cancelarP = new javax.swing.JPanel();
        cancelarL = new javax.swing.JLabel();
        modificarP = new javax.swing.JPanel();
        modificarL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        placaL = new javax.swing.JLabel();
        campoMarca = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        tipoL = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        marcaL = new javax.swing.JLabel();
        comboboxTipoCar = new javax.swing.JComboBox(Vehiculo.Tipo.values());
        campoPlaca = new javax.swing.JTextField();
        campoModelo = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        modeloL = new javax.swing.JLabel();
        campoColor = new javax.swing.JTextField();
        colorL = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modificarUsuarioL.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        modificarUsuarioL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarUsuarioL.setText("Modificar Vehiculo");
        jPanel1.add(modificarUsuarioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 40));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 60, 20, 390));

        cancelarP.setBackground(new java.awt.Color(54, 38, 87));

        cancelarL.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cancelarL.setForeground(new java.awt.Color(255, 255, 255));
        cancelarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarL.setText("Cancelar");
        cancelarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cancelarPLayout = new javax.swing.GroupLayout(cancelarP);
        cancelarP.setLayout(cancelarPLayout);
        cancelarPLayout.setHorizontalGroup(
            cancelarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cancelarPLayout.setVerticalGroup(
            cancelarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(cancelarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 100, 30));

        modificarP.setBackground(new java.awt.Color(54, 38, 87));

        modificarL.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        modificarL.setForeground(new java.awt.Color(255, 255, 255));
        modificarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarL.setText("Modificar");
        modificarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout modificarPLayout = new javax.swing.GroupLayout(modificarP);
        modificarP.setLayout(modificarPLayout);
        modificarPLayout.setHorizontalGroup(
            modificarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modificarL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        modificarPLayout.setVerticalGroup(
            modificarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modificarL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(modificarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 100, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addServicio.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 270, 240));

        placaL.setBackground(new java.awt.Color(204, 204, 204));
        placaL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        placaL.setText("Placa");
        jPanel1.add(placaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 50, 20));

        campoMarca.setEditable(false);
        campoMarca.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoMarca.setForeground(new java.awt.Color(204, 204, 204));
        campoMarca.setBorder(null);
        jPanel1.add(campoMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 210, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 210, 20));

        tipoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tipoL.setForeground(new java.awt.Color(204, 204, 204));
        tipoL.setText("Tipo");
        jPanel1.add(tipoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 40, 20));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 210, 10));

        marcaL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        marcaL.setForeground(new java.awt.Color(204, 204, 204));
        marcaL.setText("Marca");
        jPanel1.add(marcaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 40, 20));

        comboboxTipoCar.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        comboboxTipoCar.setBorder(null);
        comboboxTipoCar.setEnabled(false);
        jPanel1.add(comboboxTipoCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 210, 20));

        campoPlaca.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoPlaca.setForeground(new java.awt.Color(204, 204, 204));
        campoPlaca.setBorder(null);
        jPanel1.add(campoPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 210, -1));

        campoModelo.setEditable(false);
        campoModelo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoModelo.setForeground(new java.awt.Color(204, 204, 204));
        campoModelo.setBorder(null);
        jPanel1.add(campoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 210, -1));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 210, 10));

        modeloL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        modeloL.setForeground(new java.awt.Color(204, 204, 204));
        modeloL.setText("Modelo");
        jPanel1.add(modeloL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, 20));

        campoColor.setEditable(false);
        campoColor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoColor.setForeground(new java.awt.Color(204, 204, 204));
        campoColor.setBorder(null);
        campoColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoColorActionPerformed(evt);
            }
        });
        jPanel1.add(campoColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 210, -1));

        colorL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        colorL.setForeground(new java.awt.Color(204, 204, 204));
        colorL.setText("Color");
        jPanel1.add(colorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 40, 10));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 210, 10));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void modificarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarLMouseClicked

        String placa = campoPlaca.getText();
        String color = campoColor.getText();

        vehiculo.modificarVehiculo(placa, color);

        panelActividad p1 = new panelActividad();
        showPanel(p1);

    }//GEN-LAST:event_modificarLMouseClicked

    private void cancelarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLMouseClicked
        panelVehiculos p1 = new panelVehiculos();
        showPanel(p1);
    }//GEN-LAST:event_cancelarLMouseClicked

    private void campoColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoColorActionPerformed

    }//GEN-LAST:event_campoColorActionPerformed

    public JTextField getCampoColor() {
        return campoColor;
    }

    public JTextField getCampoMarca() {
        return campoMarca;
    }

    public JTextField getCampoModelo() {
        return campoModelo;
    }

    public JTextField getCampoPlaca() {
        return campoPlaca;
    }

    public JComboBox<Vehiculo.Tipo> getComboboxTipoCar() {
        return comboboxTipoCar;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoColor;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JLabel cancelarL;
    private javax.swing.JPanel cancelarP;
    private javax.swing.JLabel colorL;
    private javax.swing.JComboBox<Vehiculo.Tipo> comboboxTipoCar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel marcaL;
    private javax.swing.JLabel modeloL;
    private javax.swing.JLabel modificarL;
    private javax.swing.JPanel modificarP;
    private javax.swing.JLabel modificarUsuarioL;
    private javax.swing.JLabel placaL;
    private javax.swing.JLabel tipoL;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel panel) {

        panel.setSize(1050, 560);
        panel.setLocation(0, 0);

        content.removeAll();
        content.add(panel);
        content.revalidate();
        content.repaint();

    }
}
