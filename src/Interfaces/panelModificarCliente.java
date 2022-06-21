package Interfaces;

import Clases.Cliente;
import Clases.Persona;
import Clases.Persona.Genero;
import static Interfaces.MenuP.content;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelModificarCliente extends javax.swing.JPanel {

    Cliente cliente = new Cliente();

    public panelModificarCliente() {
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
        modificarP = new javax.swing.JPanel();
        modificarL = new javax.swing.JLabel();
        campoCiudad = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modificarUsuarioL.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        modificarUsuarioL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarUsuarioL.setText("Modificar Cliente");
        jPanel1.add(modificarUsuarioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 40));

        identificacionL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        identificacionL.setText("Identificación");
        jPanel1.add(identificacionL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 110, -1));

        campoIdentificacion.setEditable(false);
        campoIdentificacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoIdentificacion.setForeground(new java.awt.Color(204, 204, 204));
        campoIdentificacion.setBorder(null);
        jPanel1.add(campoIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 210, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 210, 20));

        nombreL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombreL.setText("Nombre");
        jPanel1.add(nombreL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 80, -1));

        campoNombre.setEditable(false);
        campoNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(204, 204, 204));
        campoNombre.setBorder(null);
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 210, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 210, 20));

        apellidoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        apellidoL.setText("Apellido");
        jPanel1.add(apellidoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 80, -1));

        campoApellido.setEditable(false);
        campoApellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoApellido.setForeground(new java.awt.Color(204, 204, 204));
        campoApellido.setBorder(null);
        jPanel1.add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 210, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 210, 20));

        telefonoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        telefonoL.setText("Telefono");
        jPanel1.add(telefonoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 80, -1));

        campoTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoTelefono.setBorder(null);
        jPanel1.add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 210, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 210, 20));

        correoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        correoL.setText("Correo");
        jPanel1.add(correoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 80, -1));

        campoCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoCorreo.setBorder(null);
        jPanel1.add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 210, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 210, 20));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 110, 20, 390));

        ciudadL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ciudadL.setText("Ciudad");
        jPanel1.add(ciudadL, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 80, -1));

        campoLocalidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoLocalidad.setBorder(null);
        jPanel1.add(campoLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 210, -1));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 210, 20));

        localidadL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        localidadL.setText("Genero");
        jPanel1.add(localidadL, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 80, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 210, 10));

        localidadL1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        localidadL1.setText("Localidad");
        jPanel1.add(localidadL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 80, 10));

        comboboxGenero.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        comboboxGenero.setBorder(null);
        comboboxGenero.setEnabled(false);
        jPanel1.add(comboboxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 210, -1));

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

        jPanel1.add(cancelarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 100, 30));

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
            .addComponent(modificarL, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        modificarPLayout.setVerticalGroup(
            modificarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modificarL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(modificarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 100, 30));

        campoCiudad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoCiudad.setBorder(null);
        campoCiudad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(campoCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 210, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void modificarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarLMouseClicked

        long identificacion = Long.parseLong(campoIdentificacion.getText());
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        long telefono = Long.parseLong(campoTelefono.getText());
        String correo = campoCorreo.getText();
        String ciudad = campoCiudad.getText();
        String localidad = campoLocalidad.getText();
        Genero genero = Genero.valueOf(comboboxGenero.getSelectedItem().toString());

        cliente.modificarCliente(identificacion, nombre, apellido, genero, telefono, correo, ciudad, localidad);
        
        panelCliente p1 = new panelCliente();
        showPanel(p1);

    }//GEN-LAST:event_modificarLMouseClicked

    private void cancelarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLMouseClicked
        panelCliente p1 = new panelCliente();
        showPanel(p1);
    }//GEN-LAST:event_cancelarLMouseClicked

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
    private javax.swing.JTextField campoCiudad;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoIdentificacion;
    private javax.swing.JTextField campoLocalidad;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel cancelarL;
    private javax.swing.JPanel cancelarP;
    private javax.swing.JLabel ciudadL;
    private javax.swing.JComboBox<Persona.Genero> comboboxGenero;
    private javax.swing.JLabel correoL;
    private javax.swing.JLabel identificacionL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel localidadL;
    private javax.swing.JLabel localidadL1;
    private javax.swing.JLabel modificarL;
    private javax.swing.JPanel modificarP;
    private javax.swing.JLabel modificarUsuarioL;
    private javax.swing.JLabel nombreL;
    private javax.swing.JLabel telefonoL;
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
