package Interfaces;

import java.awt.Color;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuP extends javax.swing.JFrame {

    public MenuP() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);

        panelPrincipal p1 = new panelPrincipal();
        showPanel(p1);

        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre",
            "Octubre", "Noviembre", "Diciemrbre"};
        fechaL.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        clientesP = new javax.swing.JPanel();
        clientesL = new javax.swing.JLabel();
        iconClientes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        serviciosP = new javax.swing.JPanel();
        serviciosL = new javax.swing.JLabel();
        iconServicios = new javax.swing.JLabel();
        clientesL1 = new javax.swing.JLabel();
        iconClientes1 = new javax.swing.JLabel();
        operariosP = new javax.swing.JPanel();
        iconOperarios = new javax.swing.JLabel();
        operariosL = new javax.swing.JLabel();
        facturacionP = new javax.swing.JPanel();
        facturacionL = new javax.swing.JLabel();
        iconFacturacion = new javax.swing.JLabel();
        facturasP = new javax.swing.JPanel();
        factuasL = new javax.swing.JLabel();
        iconFacturas = new javax.swing.JLabel();
        vehiculosP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        iconVehiculos = new javax.swing.JLabel();
        principalP = new javax.swing.JPanel();
        principalL = new javax.swing.JLabel();
        iconPrincipalL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fechaL = new javax.swing.JLabel();
        rutaL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(600, 500));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 1140, 580));

        jPanel1.setBackground(new java.awt.Color(54, 38, 87));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clientesP.setBackground(new java.awt.Color(86, 70, 117));
        clientesP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesPMouseClicked(evt);
            }
        });

        clientesL.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        clientesL.setForeground(new java.awt.Color(255, 255, 255));
        clientesL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clientesL.setText(" Clientes");
        clientesL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientesLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientesLMouseExited(evt);
            }
        });

        iconClientes.setForeground(new java.awt.Color(102, 102, 255));
        iconClientes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        iconClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconClientes.png"))); // NOI18N

        javax.swing.GroupLayout clientesPLayout = new javax.swing.GroupLayout(clientesP);
        clientesP.setLayout(clientesPLayout);
        clientesPLayout.setHorizontalGroup(
            clientesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientesPLayout.createSequentialGroup()
                .addComponent(iconClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientesL, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        );
        clientesPLayout.setVerticalGroup(
            clientesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(clientesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientesL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(clientesP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 230, 50));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("iCar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 140, -1));

        serviciosP.setBackground(new java.awt.Color(86, 70, 117));
        serviciosP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviciosPMouseClicked(evt);
            }
        });

        serviciosL.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        serviciosL.setForeground(new java.awt.Color(255, 255, 255));
        serviciosL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        serviciosL.setText(" Servicios");
        serviciosL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviciosLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                serviciosLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                serviciosLMouseExited(evt);
            }
        });

        iconServicios.setForeground(new java.awt.Color(102, 102, 255));
        iconServicios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        iconServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconServicio.png"))); // NOI18N
        iconServicios.setToolTipText("");

        javax.swing.GroupLayout serviciosPLayout = new javax.swing.GroupLayout(serviciosP);
        serviciosP.setLayout(serviciosPLayout);
        serviciosPLayout.setHorizontalGroup(
            serviciosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, serviciosPLayout.createSequentialGroup()
                .addComponent(iconServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serviciosL, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        serviciosPLayout.setVerticalGroup(
            serviciosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(serviciosL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(iconServicios, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(serviciosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 50));

        clientesL1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        clientesL1.setForeground(new java.awt.Color(255, 255, 255));
        clientesL1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clientesL1.setText("Clientes");
        jPanel1.add(clientesL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        iconClientes1.setForeground(new java.awt.Color(102, 102, 255));
        iconClientes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconClientes.png"))); // NOI18N
        jPanel1.add(iconClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        operariosP.setBackground(new java.awt.Color(86, 70, 117));

        iconOperarios.setForeground(new java.awt.Color(102, 102, 255));
        iconOperarios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        iconOperarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconOperario.png"))); // NOI18N

        operariosL.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        operariosL.setForeground(new java.awt.Color(255, 255, 255));
        operariosL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        operariosL.setText(" Operarios");
        operariosL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                operariosLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                operariosLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                operariosLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout operariosPLayout = new javax.swing.GroupLayout(operariosP);
        operariosP.setLayout(operariosPLayout);
        operariosPLayout.setHorizontalGroup(
            operariosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operariosPLayout.createSequentialGroup()
                .addComponent(iconOperarios, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(operariosL, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        operariosPLayout.setVerticalGroup(
            operariosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operariosPLayout.createSequentialGroup()
                .addGroup(operariosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconOperarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operariosL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(operariosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 230, 50));

        facturacionP.setBackground(new java.awt.Color(86, 70, 117));

        facturacionL.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        facturacionL.setForeground(new java.awt.Color(255, 255, 255));
        facturacionL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        facturacionL.setText(" Facturación");
        facturacionL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturacionLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facturacionLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facturacionLMouseExited(evt);
            }
        });

        iconFacturacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        iconFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_request_quote_white_24dp.png"))); // NOI18N

        javax.swing.GroupLayout facturacionPLayout = new javax.swing.GroupLayout(facturacionP);
        facturacionP.setLayout(facturacionPLayout);
        facturacionPLayout.setHorizontalGroup(
            facturacionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturacionPLayout.createSequentialGroup()
                .addComponent(iconFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(facturacionL, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        facturacionPLayout.setVerticalGroup(
            facturacionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturacionPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(facturacionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(facturacionL, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
        );

        jPanel1.add(facturacionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 230, 50));

        facturasP.setBackground(new java.awt.Color(86, 70, 117));

        factuasL.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        factuasL.setForeground(new java.awt.Color(255, 255, 255));
        factuasL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        factuasL.setText(" Facturas");
        factuasL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                factuasLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                factuasLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                factuasLMouseExited(evt);
            }
        });

        iconFacturas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        iconFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconFacturacion.png"))); // NOI18N

        javax.swing.GroupLayout facturasPLayout = new javax.swing.GroupLayout(facturasP);
        facturasP.setLayout(facturasPLayout);
        facturasPLayout.setHorizontalGroup(
            facturasPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facturasPLayout.createSequentialGroup()
                .addComponent(iconFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(factuasL, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        facturasPLayout.setVerticalGroup(
            facturasPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturasPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(facturasPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(factuasL, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(iconFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(facturasP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 230, 50));

        vehiculosP.setBackground(new java.awt.Color(86, 70, 117));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText(" Vehiculos");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        iconVehiculos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        iconVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_directions_car_white_24dp.png"))); // NOI18N

        javax.swing.GroupLayout vehiculosPLayout = new javax.swing.GroupLayout(vehiculosP);
        vehiculosP.setLayout(vehiculosPLayout);
        vehiculosPLayout.setHorizontalGroup(
            vehiculosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vehiculosPLayout.createSequentialGroup()
                .addComponent(iconVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        vehiculosPLayout.setVerticalGroup(
            vehiculosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(iconVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(vehiculosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 230, 50));

        principalP.setBackground(new java.awt.Color(100, 81, 136));

        principalL.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        principalL.setForeground(new java.awt.Color(255, 255, 255));
        principalL.setText(" Principal");
        principalL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                principalLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                principalLMouseExited(evt);
            }
        });

        iconPrincipalL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        iconPrincipalL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconPrincipal.png"))); // NOI18N
        iconPrincipalL.setToolTipText("");

        javax.swing.GroupLayout principalPLayout = new javax.swing.GroupLayout(principalP);
        principalP.setLayout(principalPLayout);
        principalPLayout.setHorizontalGroup(
            principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPLayout.createSequentialGroup()
                .addComponent(iconPrincipalL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(principalL, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        principalPLayout.setVerticalGroup(
            principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(iconPrincipalL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(principalP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 230, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 230, 770));

        jPanel2.setBackground(new java.awt.Color(123, 85, 220));

        fechaL.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        fechaL.setForeground(new java.awt.Color(255, 255, 255));
        fechaL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        rutaL.setBackground(new java.awt.Color(123, 85, 220));
        rutaL.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        rutaL.setForeground(new java.awt.Color(255, 255, 255));
        rutaL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rutaL.setText("Administracion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rutaL, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaL, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(591, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(rutaL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 1140, 110));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientesPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesPMouseClicked
        panelCliente p1 = new panelCliente();
        showPanel(p1);

        rutaL.setText("Administracion/Clientes");
    }//GEN-LAST:event_clientesPMouseClicked

    private void serviciosPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviciosPMouseClicked
        panelActividad p1 = new panelActividad();
        showPanel(p1);

        rutaL.setText("Administracion/Servicios");
    }//GEN-LAST:event_serviciosPMouseClicked

    private void operariosLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_operariosLMouseClicked

        panelOperarios p1 = new panelOperarios();
        showPanel(p1);
        resetColor(principalP);
        resetColor(serviciosP);
        resetColor(clientesP);
        setColor(operariosP);
        resetColor(facturacionP);
        resetColor(facturasP);
        resetColor(vehiculosP);

        rutaL.setText("Administracion/Operarios");

    }//GEN-LAST:event_operariosLMouseClicked

    private void facturacionLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturacionLMouseClicked
        panelFacturacion p1 = new panelFacturacion();
        showPanel(p1);

        resetColor(principalP);
        resetColor(serviciosP);
        resetColor(clientesP);
        resetColor(operariosP);
        setColor(facturacionP);
        resetColor(facturasP);
        resetColor(vehiculosP);

        rutaL.setText("Administracion/Facturacion");

    }//GEN-LAST:event_facturacionLMouseClicked

    private void factuasLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_factuasLMouseClicked
        panelFactura p1 = new panelFactura();

        showPanel(p1);

        resetColor(principalP);
        resetColor(serviciosP);
        resetColor(clientesP);
        resetColor(operariosP);
        resetColor(facturacionP);
        setColor(facturasP);
        resetColor(vehiculosP);

        rutaL.setText("Administracion/Facturas");


    }//GEN-LAST:event_factuasLMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        panelVehiculos p1 = new panelVehiculos();

        showPanel(p1);

        resetColor(principalP);
        resetColor(serviciosP);
        resetColor(clientesP);
        resetColor(operariosP);
        resetColor(facturacionP);
        resetColor(facturasP);
        setColor(vehiculosP);

        rutaL.setText("Administracion/Vehiculos");


    }//GEN-LAST:event_jLabel1MouseClicked

    private void principalLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalLMouseEntered

        if (principalP.getBackground().getRGB() == -11123083) {
            setColor(principalP);
        }

    }//GEN-LAST:event_principalLMouseEntered

    private void principalLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalLMouseExited

        if (serviciosP.getBackground().getRGB() != -11123083 || clientesP.getBackground().getRGB() != -11123083
                || operariosP.getBackground().getRGB() != -11123083 || facturasP.getBackground().getRGB() != -11123083
                || facturacionP.getBackground().getRGB() != -11123083 || vehiculosP.getBackground().getRGB() != -11123083) {
            resetColor(principalP);
        }


    }//GEN-LAST:event_principalLMouseExited

    private void serviciosLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviciosLMouseEntered

        if (serviciosP.getBackground().getRGB() == -11123083) {
            setColor(serviciosP);
        }

    }//GEN-LAST:event_serviciosLMouseEntered

    private void serviciosLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviciosLMouseExited
        if (clientesP.getBackground().getRGB() != -11123083
                || operariosP.getBackground().getRGB() != -11123083 || facturasP.getBackground().getRGB() != -11123083
                || facturacionP.getBackground().getRGB() != -11123083 || vehiculosP.getBackground().getRGB() != -11123083 || principalP.getBackground().getRGB() != -11123083) {
            resetColor(serviciosP);
        }
    }//GEN-LAST:event_serviciosLMouseExited

    private void serviciosLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviciosLMouseClicked
        panelActividad p1 = new panelActividad();

        showPanel(p1);

        resetColor(principalP);
        setColor(serviciosP);
        resetColor(clientesP);
        resetColor(operariosP);
        resetColor(facturacionP);
        resetColor(facturasP);
        resetColor(vehiculosP);

        rutaL.setText("Administracion/Servicios");
    }//GEN-LAST:event_serviciosLMouseClicked

    private void principalLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalLMouseClicked
        panelPrincipal p1 = new panelPrincipal();
        showPanel(p1);

        setColor(principalP);
        resetColor(serviciosP);
        resetColor(clientesP);
        resetColor(operariosP);
        resetColor(facturacionP);
        resetColor(facturasP);
        resetColor(vehiculosP);

        rutaL.setText("Home");

    }//GEN-LAST:event_principalLMouseClicked

    private void clientesLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesLMouseExited
        if (serviciosP.getBackground().getRGB() != -11123083
                || operariosP.getBackground().getRGB() != -11123083 || facturasP.getBackground().getRGB() != -11123083
                || facturacionP.getBackground().getRGB() != -11123083 || vehiculosP.getBackground().getRGB() != -11123083 || principalP.getBackground().getRGB() != -11123083) {
            resetColor(clientesP);
        }
    }//GEN-LAST:event_clientesLMouseExited

    private void clientesLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesLMouseEntered
        if (clientesP.getBackground().getRGB() == -11123083) {
            setColor(clientesP);
        }
    }//GEN-LAST:event_clientesLMouseEntered

    private void operariosLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_operariosLMouseExited
        if (serviciosP.getBackground().getRGB() != -11123083 || clientesP.getBackground().getRGB() != -11123083
                || facturasP.getBackground().getRGB() != -11123083
                || facturacionP.getBackground().getRGB() != -11123083 || vehiculosP.getBackground().getRGB() != -11123083 || principalP.getBackground().getRGB() != -11123083) {
            resetColor(operariosP);
        }
    }//GEN-LAST:event_operariosLMouseExited

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        if (serviciosP.getBackground().getRGB() != -11123083 || clientesP.getBackground().getRGB() != -11123083
                || operariosP.getBackground().getRGB() != -11123083 || facturasP.getBackground().getRGB() != -11123083
                || facturacionP.getBackground().getRGB() != -11123083 || principalP.getBackground().getRGB() != -11123083) {
            resetColor(vehiculosP);
        }
    }//GEN-LAST:event_jLabel1MouseExited

    private void factuasLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_factuasLMouseEntered
        if (facturasP.getBackground().getRGB() == -11123083) {
            setColor(facturasP);
        }
    }//GEN-LAST:event_factuasLMouseEntered

    private void facturacionLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturacionLMouseEntered
        if (facturacionP.getBackground().getRGB() == -11123083) {
            setColor(facturacionP);
        }
    }//GEN-LAST:event_facturacionLMouseEntered

    private void factuasLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_factuasLMouseExited
        if (serviciosP.getBackground().getRGB() != -11123083 || clientesP.getBackground().getRGB() != -11123083
                || operariosP.getBackground().getRGB() != -11123083
                || facturacionP.getBackground().getRGB() != -11123083 || vehiculosP.getBackground().getRGB() != -11123083 || principalP.getBackground().getRGB() != -11123083) {
            resetColor(facturasP);
        }
    }//GEN-LAST:event_factuasLMouseExited

    private void facturacionLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturacionLMouseExited
        if (serviciosP.getBackground().getRGB() != -11123083 || clientesP.getBackground().getRGB() != -11123083
                || operariosP.getBackground().getRGB() != -11123083
                || vehiculosP.getBackground().getRGB() != -11123083 || principalP.getBackground().getRGB() != -11123083) {
            resetColor(facturacionP);
        }
    }//GEN-LAST:event_facturacionLMouseExited

    private void operariosLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_operariosLMouseEntered
        if (operariosP.getBackground().getRGB() == -11123083) {
            setColor(operariosP);
        }
    }//GEN-LAST:event_operariosLMouseEntered

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        if (vehiculosP.getBackground().getRGB() == -11123083) {
            setColor(vehiculosP);
        }
    }//GEN-LAST:event_jLabel1MouseEntered

    private void clientesLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesLMouseClicked
        panelCliente p1 = new panelCliente();
        showPanel(p1);
        
        resetColor(principalP);
        resetColor(serviciosP);
        setColor(clientesP);
        resetColor(operariosP);
        resetColor(facturacionP);
        resetColor(facturasP);
        resetColor(vehiculosP);

        rutaL.setText("Administracion/Clientes");
    }//GEN-LAST:event_clientesLMouseClicked

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clientesL;
    private javax.swing.JLabel clientesL1;
    private javax.swing.JPanel clientesP;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel factuasL;
    private javax.swing.JLabel facturacionL;
    private javax.swing.JPanel facturacionP;
    private javax.swing.JPanel facturasP;
    private javax.swing.JLabel fechaL;
    private javax.swing.JLabel iconClientes;
    private javax.swing.JLabel iconClientes1;
    private javax.swing.JLabel iconFacturacion;
    private javax.swing.JLabel iconFacturas;
    private javax.swing.JLabel iconOperarios;
    private javax.swing.JLabel iconPrincipalL;
    private javax.swing.JLabel iconServicios;
    private javax.swing.JLabel iconVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel operariosL;
    private javax.swing.JPanel operariosP;
    private javax.swing.JLabel principalL;
    private javax.swing.JPanel principalP;
    private javax.swing.JLabel rutaL;
    private javax.swing.JLabel serviciosL;
    private javax.swing.JPanel serviciosP;
    private javax.swing.JPanel vehiculosP;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel panel) {

        panel.setSize(1050, 560);
        panel.setLocation(0, 0);

        content.removeAll();
        content.add(panel);
        content.revalidate();
        content.repaint();

    }

    public void ajustarImageLabel(JLabel label, String ruta) {

        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);

        this.repaint();

    }

    ;
    
    void setColor(JPanel panel) {
        panel.setBackground(new Color(100, 81, 136));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(86, 70, 117));
    }

}
