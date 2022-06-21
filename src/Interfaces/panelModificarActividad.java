package Interfaces;

import Clases.Actividad;
import static Interfaces.MenuP.content;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelModificarActividad extends javax.swing.JPanel {

    Actividad actividad = new Actividad();

    public panelModificarActividad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        modificarUsuarioL = new javax.swing.JLabel();
        codigoL = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        descripcionL = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        valorL = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        cancelarP = new javax.swing.JPanel();
        cancelarL = new javax.swing.JLabel();
        modificarP = new javax.swing.JPanel();
        modificarL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modificarUsuarioL.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        modificarUsuarioL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarUsuarioL.setText("Modificar Actividad");
        jPanel1.add(modificarUsuarioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 200, 40));

        codigoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        codigoL.setText("Codigo");
        jPanel1.add(codigoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 110, -1));

        campoCodigo.setEditable(false);
        campoCodigo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoCodigo.setForeground(new java.awt.Color(204, 204, 204));
        campoCodigo.setBorder(null);
        jPanel1.add(campoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 210, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 210, 20));

        descripcionL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        descripcionL.setText("Descripcion");
        jPanel1.add(descripcionL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 80, -1));

        campoDescripcion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoDescripcion.setForeground(new java.awt.Color(204, 204, 204));
        campoDescripcion.setBorder(null);
        jPanel1.add(campoDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 210, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 210, 20));

        valorL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        valorL.setText("Valor");
        jPanel1.add(valorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 80, -1));

        campoValor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoValor.setForeground(new java.awt.Color(204, 204, 204));
        campoValor.setBorder(null);
        jPanel1.add(campoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 210, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 210, 20));

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

        jPanel1.add(cancelarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 100, 30));

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

        jPanel1.add(modificarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 100, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addServicio.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 270, 240));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void modificarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarLMouseClicked

        String codigo = campoCodigo.getText();
        String descripcion = campoDescripcion.getText();
        int valor = Integer.parseInt(campoValor.getText());

        actividad.modificarActividad(codigo, descripcion, valor);

        panelActividad p1 = new panelActividad();
        showPanel(p1);

    }//GEN-LAST:event_modificarLMouseClicked

    private void cancelarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLMouseClicked
        panelActividad p1 = new panelActividad();
        showPanel(p1);
    }//GEN-LAST:event_cancelarLMouseClicked

    public JTextField getCampoCodigo() {
        return campoCodigo;
    }

    public JTextField getCampoDescripcion() {
        return campoDescripcion;
    }

    public JTextField getCampoValor() {
        return campoValor;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel cancelarL;
    private javax.swing.JPanel cancelarP;
    private javax.swing.JLabel codigoL;
    private javax.swing.JLabel descripcionL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel modificarL;
    private javax.swing.JPanel modificarP;
    private javax.swing.JLabel modificarUsuarioL;
    private javax.swing.JLabel valorL;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel panel) {

        panel.setSize(1050, 570);
        panel.setLocation(0, 0);

        content.removeAll();
        content.add(panel);
        content.revalidate();
        content.repaint();

    }
}
