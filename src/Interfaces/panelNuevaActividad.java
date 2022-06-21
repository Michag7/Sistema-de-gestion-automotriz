package Interfaces;

import Clases.Actividad;
import static Interfaces.MenuP.content;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelNuevaActividad extends javax.swing.JPanel {

    Actividad actividad = new Actividad();

    public panelNuevaActividad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nuevaActividadL = new javax.swing.JLabel();
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
        registarP = new javax.swing.JPanel();
        registrarL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1050, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevaActividadL.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nuevaActividadL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevaActividadL.setText("Registrar Actividad");
        jPanel1.add(nuevaActividadL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 200, 40));

        codigoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        codigoL.setText("Codigo");
        jPanel1.add(codigoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 110, -1));

        campoCodigo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoCodigo.setForeground(new java.awt.Color(204, 204, 204));
        campoCodigo.setBorder(null);
        jPanel1.add(campoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 210, 20));

        descripcionL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        descripcionL.setText("Descripcion");
        jPanel1.add(descripcionL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 80, -1));

        campoDescripcion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoDescripcion.setForeground(new java.awt.Color(204, 204, 204));
        campoDescripcion.setBorder(null);
        jPanel1.add(campoDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 210, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 210, 20));

        valorL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        valorL.setText("Valor");
        jPanel1.add(valorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 80, -1));

        campoValor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoValor.setForeground(new java.awt.Color(204, 204, 204));
        campoValor.setBorder(null);
        jPanel1.add(campoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 210, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 210, 20));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 80, 20, 390));

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

        jPanel1.add(cancelarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 100, 30));

        registarP.setBackground(new java.awt.Color(54, 38, 87));

        registrarL.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        registrarL.setForeground(new java.awt.Color(255, 255, 255));
        registrarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarL.setText("Registrar");
        registrarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout registarPLayout = new javax.swing.GroupLayout(registarP);
        registarP.setLayout(registarPLayout);
        registarPLayout.setHorizontalGroup(
            registarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrarL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        registarPLayout.setVerticalGroup(
            registarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrarL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(registarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addServicio.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 250, 250));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void registrarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarLMouseClicked
        String codigo = campoCodigo.getText();
        String descripcion = campoDescripcion.getText();
        int valor = Integer.parseInt(campoValor.getText());

        actividad.insertarActividad(codigo, descripcion, valor, 1006288143);

        panelActividad p1 = new panelActividad();
        showPanel(p1);

    }//GEN-LAST:event_registrarLMouseClicked

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
    private javax.swing.JLabel nuevaActividadL;
    private javax.swing.JPanel registarP;
    private javax.swing.JLabel registrarL;
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
