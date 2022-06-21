package Interfaces;

import static Interfaces.MenuP.content;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class panelVerContrato extends javax.swing.JPanel {

    public panelVerContrato() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigoL = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tipoL = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        inicioL = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        finL = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jornadaL = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        salarioL = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        iconL = new javax.swing.JLabel();
        atrasL = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("Contrato");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 100, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setText("Codigo :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        codigoL.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jPanel1.add(codigoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 320, 30));

        jSeparator1.setBackground(new java.awt.Color(54, 38, 87));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 10, 370));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setText("Tipo :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        tipoL.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jPanel1.add(tipoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 320, 30));

        jSeparator2.setBackground(new java.awt.Color(54, 38, 87));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 380, 10));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setText("Inicio :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        inicioL.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jPanel1.add(inicioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 320, 30));

        jSeparator3.setBackground(new java.awt.Color(54, 38, 87));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 380, 10));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel5.setText("Fin :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 50, -1));

        finL.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jPanel1.add(finL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 360, 30));

        jSeparator4.setBackground(new java.awt.Color(54, 38, 87));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 380, 10));

        jSeparator5.setBackground(new java.awt.Color(54, 38, 87));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 380, 10));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setText(" Jornada :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jornadaL.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jPanel1.add(jornadaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 370, 30));

        jSeparator6.setBackground(new java.awt.Color(54, 38, 87));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 380, 10));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel7.setText("Salario :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 90, -1));

        salarioL.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jPanel1.add(salarioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 360, 30));

        jSeparator7.setBackground(new java.awt.Color(54, 38, 87));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 380, 10));

        iconL.setBackground(new java.awt.Color(255, 255, 255));
        iconL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPanelVercontrato.png"))); // NOI18N
        jPanel1.add(iconL, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 250, 310));

        atrasL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        atrasL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arrow_back_ios_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        atrasL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasLMouseClicked(evt);
            }
        });
        jPanel1.add(atrasL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void atrasLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasLMouseClicked
        panelOperarios p1 = new panelOperarios();
        
        p1.setSize(1050, 570);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_atrasLMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atrasL;
    private javax.swing.JLabel codigoL;
    private javax.swing.JLabel finL;
    private javax.swing.JLabel iconL;
    private javax.swing.JLabel inicioL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel jornadaL;
    private javax.swing.JLabel salarioL;
    private javax.swing.JLabel tipoL;
    // End of variables declaration//GEN-END:variables

    public JLabel getCodigoL() {
        return codigoL;
    }

    public JLabel getFinL() {
        return finL;
    }

    public JLabel getInicioL() {
        return inicioL;
    }

    public JLabel getJornadaL() {
        return jornadaL;
    }

    public JLabel getSalarioL() {
        return salarioL;
    }

    public JLabel getTipoL() {
        return tipoL;
    }

}
