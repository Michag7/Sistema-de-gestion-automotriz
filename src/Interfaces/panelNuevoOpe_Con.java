package Interfaces;

import Clases.Cliente;
import Clases.Contrato;
import Clases.Contrato.tipoContrato;
import Clases.Operario;
import Clases.Persona;
import Clases.Persona.Genero;
import static Interfaces.MenuP.content;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelNuevoOpe_Con extends javax.swing.JPanel {

    Operario operario = new Operario();
    Contrato contrato = new Contrato();

    public panelNuevoOpe_Con() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        modificarUsuarioL = new javax.swing.JLabel();
        identificacionL = new javax.swing.JLabel();
        campoIdentificacion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        nombreL = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        apellidoL = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        telefonoL = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        correoL = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        ciudadL = new javax.swing.JLabel();
        campoLocalidad = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        localidadL = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        localidadL1 = new javax.swing.JLabel();
        comboboxGenero = new javax.swing.JComboBox(Persona.Genero.values());
        cancelarP = new javax.swing.JPanel();
        cancelarL = new javax.swing.JLabel();
        registrarP = new javax.swing.JPanel();
        registrarL = new javax.swing.JLabel();
        campoCiudad = new javax.swing.JTextField();
        localidadL2 = new javax.swing.JLabel();
        campoCargo = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        campoCodigoContrato = new javax.swing.JTextField();
        tipoL = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        mesesL = new javax.swing.JLabel();
        comboboxTipoCt = new javax.swing.JComboBox(Contrato.tipoContrato.values());
        campoDuracion = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        duracionL = new javax.swing.JLabel();
        salarioL = new javax.swing.JLabel();
        campoSalario = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        codigoL = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modificarUsuarioL.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        modificarUsuarioL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarUsuarioL.setText("Registrar Operario");
        jPanel1.add(modificarUsuarioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 200, 40));

        identificacionL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        identificacionL.setText("Identificación");
        jPanel1.add(identificacionL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 110, -1));

        campoIdentificacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoIdentificacion.setForeground(new java.awt.Color(204, 204, 204));
        campoIdentificacion.setBorder(null);
        jPanel1.add(campoIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 210, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 210, 20));

        nombreL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombreL.setText("Nombre");
        jPanel1.add(nombreL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 80, -1));

        campoNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(204, 204, 204));
        campoNombre.setBorder(null);
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 210, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 210, 20));

        apellidoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        apellidoL.setText("Apellido");
        jPanel1.add(apellidoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 80, -1));

        campoApellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoApellido.setForeground(new java.awt.Color(204, 204, 204));
        campoApellido.setBorder(null);
        jPanel1.add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 210, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 210, 20));

        telefonoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        telefonoL.setText("Telefono");
        jPanel1.add(telefonoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 80, -1));

        campoTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoTelefono.setForeground(new java.awt.Color(204, 204, 204));
        campoTelefono.setBorder(null);
        jPanel1.add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 210, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 210, 20));

        correoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        correoL.setText("Correo");
        jPanel1.add(correoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 80, -1));

        campoCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoCorreo.setForeground(new java.awt.Color(204, 204, 204));
        campoCorreo.setBorder(null);
        jPanel1.add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 210, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 210, 20));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 20, 430));

        ciudadL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ciudadL.setText("Ciudad");
        jPanel1.add(ciudadL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 80, -1));

        campoLocalidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoLocalidad.setForeground(new java.awt.Color(204, 204, 204));
        campoLocalidad.setBorder(null);
        jPanel1.add(campoLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 210, -1));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 210, 20));

        localidadL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        localidadL.setText("Genero");
        jPanel1.add(localidadL, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 200, 10));

        localidadL1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        localidadL1.setText("Localidad");
        jPanel1.add(localidadL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 90, 20));

        comboboxGenero.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        comboboxGenero.setBorder(null);
        jPanel1.add(comboboxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 200, -1));

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
            .addComponent(cancelarL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        cancelarPLayout.setVerticalGroup(
            cancelarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(cancelarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 100, 30));

        registrarP.setBackground(new java.awt.Color(54, 38, 87));

        registrarL.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        registrarL.setForeground(new java.awt.Color(255, 255, 255));
        registrarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarL.setText("Registrar");
        registrarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout registrarPLayout = new javax.swing.GroupLayout(registrarP);
        registrarP.setLayout(registrarPLayout);
        registrarPLayout.setHorizontalGroup(
            registrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarL, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        registrarPLayout.setVerticalGroup(
            registrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarL, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(registrarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 420, 100, 30));

        campoCiudad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoCiudad.setForeground(new java.awt.Color(204, 204, 204));
        campoCiudad.setBorder(null);
        jPanel1.add(campoCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 210, -1));

        localidadL2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        localidadL2.setText("Cargo");
        jPanel1.add(localidadL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 80, 20));

        campoCargo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoCargo.setForeground(new java.awt.Color(204, 204, 204));
        campoCargo.setBorder(null);
        jPanel1.add(campoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 210, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 200, 10));

        campoCodigoContrato.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoCodigoContrato.setForeground(new java.awt.Color(204, 204, 204));
        campoCodigoContrato.setBorder(null);
        jPanel1.add(campoCodigoContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 210, -1));

        tipoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tipoL.setText("Tipo");
        jPanel1.add(tipoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 80, -1));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 210, 10));

        mesesL.setFont(new java.awt.Font("Roboto", 0, 8)); // NOI18N
        mesesL.setText("ingrese la cantidad en meses");
        jPanel1.add(mesesL, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, 110, 20));

        comboboxTipoCt.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        comboboxTipoCt.setBorder(null);
        jPanel1.add(comboboxTipoCt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 210, -1));

        campoDuracion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoDuracion.setForeground(new java.awt.Color(204, 204, 204));
        campoDuracion.setBorder(null);
        campoDuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoDuracionMouseClicked(evt);
            }
        });
        campoDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDuracionActionPerformed(evt);
            }
        });
        jPanel1.add(campoDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 210, -1));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 210, 10));

        duracionL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        duracionL.setText("Duracion");
        jPanel1.add(duracionL, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 80, 20));

        salarioL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        salarioL.setText("Salario");
        jPanel1.add(salarioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 80, 20));

        campoSalario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoSalario.setForeground(new java.awt.Color(204, 204, 204));
        campoSalario.setBorder(null);
        jPanel1.add(campoSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 210, -1));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 210, 10));

        codigoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        codigoL.setText("Codigo");
        jPanel1.add(codigoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 80, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void registrarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarLMouseClicked

        long identificacion = Long.parseLong(campoIdentificacion.getText());
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        long telefono = Long.parseLong(campoTelefono.getText());
        String correo = campoCorreo.getText();
        String ciudad = campoCiudad.getText();
        String localidad = campoLocalidad.getText();
        String cargo = campoCargo.getText();
        Genero genero = Genero.valueOf(comboboxGenero.getSelectedItem().toString());

        int codigoContrato = Integer.parseInt(campoCodigoContrato.getText());
        int meses = Integer.parseInt(campoDuracion.getText());
        LocalDate fechaFinal = LocalDate.now().plusMonths(meses);
        long salario = Long.parseLong(campoSalario.getText());
        tipoContrato tipoC = tipoContrato.valueOf(comboboxTipoCt.getSelectedItem().toString());

        Contrato contrato1 = new Contrato(codigoContrato, LocalDate.now(), fechaFinal, tipoC, salario);

        this.contrato.insertarContrato(LocalDate.now(), fechaFinal, tipoC, salario);
        operario.insertarOperario(identificacion, nombre, apellido, telefono, correo, ciudad, localidad, cargo, genero, contrato1);

        panelOperarios p1 = new panelOperarios();
        showPanel(p1);

    }//GEN-LAST:event_registrarLMouseClicked

    private void cancelarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLMouseClicked
        panelOperarios p1 = new panelOperarios();
        showPanel(p1);
    }//GEN-LAST:event_cancelarLMouseClicked

    private void campoDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDuracionActionPerformed

    private void campoDuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoDuracionMouseClicked
        mesesL.setText("");

    }//GEN-LAST:event_campoDuracionMouseClicked

    public JTextField getCampoIdentificacion() {
        return campoIdentificacion;
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public JTextField getCampoApellido() {
        return campoApellido;
    }

    public JTextField getCampoTelefono() {
        return campoTelefono;
    }

    public JTextField getCampoCorreo() {
        return campoCorreo;
    }

    public JTextField getCampoCiudad() {
        return campoCiudad;
    }

    public JTextField getCampoLocalidad() {
        return campoLocalidad;
    }

    public JComboBox<Persona.Genero> getComboboxGenero() {
        return comboboxGenero;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoL;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCargo;
    private javax.swing.JTextField campoCiudad;
    private javax.swing.JTextField campoCodigoContrato;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDuracion;
    private javax.swing.JTextField campoIdentificacion;
    private javax.swing.JTextField campoLocalidad;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoSalario;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel cancelarL;
    private javax.swing.JPanel cancelarP;
    private javax.swing.JLabel ciudadL;
    private javax.swing.JLabel codigoL;
    private javax.swing.JComboBox<Persona.Genero> comboboxGenero;
    private javax.swing.JComboBox<Contrato.tipoContrato> comboboxTipoCt;
    private javax.swing.JLabel correoL;
    private javax.swing.JLabel duracionL;
    private javax.swing.JLabel identificacionL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel localidadL;
    private javax.swing.JLabel localidadL1;
    private javax.swing.JLabel localidadL2;
    private javax.swing.JLabel mesesL;
    private javax.swing.JLabel modificarUsuarioL;
    private javax.swing.JLabel nombreL;
    private javax.swing.JLabel registrarL;
    private javax.swing.JPanel registrarP;
    private javax.swing.JLabel salarioL;
    private javax.swing.JLabel telefonoL;
    private javax.swing.JLabel tipoL;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel panel) {

        panel.setSize(1140, 570);
        panel.setLocation(0, 0);

        content.removeAll();
        content.add(panel);
        content.revalidate();
        content.repaint();

    }
}
