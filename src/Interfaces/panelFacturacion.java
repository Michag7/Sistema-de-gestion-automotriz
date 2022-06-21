package Interfaces;

import Clases.Actividad;
import Clases.Administrador;
import Clases.Cliente;
import Clases.Factura;
import Clases.Persona;
import Clases.Persona.Genero;
import Clases.Vehiculo;
import Clases.Vehiculo.Tipo;
import Clases.gestionCeldas;
import Conexion.CConexion;
import static Interfaces.MenuP.content;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class panelFacturacion extends javax.swing.JPanel implements MouseListener {

    Cliente cliente = new Cliente();
    Vehiculo vehiculo = new Vehiculo();
    Factura factura = new Factura();
    ArrayList<Actividad> listaActividades;
    int valorCalculado = 0;

    public panelFacturacion() {
        initComponents();
        this.listaActividades = new ArrayList<>();
        tablaServicios.setModel(new ModeloTablaPersonalizado1());
        tablaServicios.addMouseListener(this);

        establecerTamañoColums();
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
        generoL = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        localidadL = new javax.swing.JLabel();
        comboboxGenero = new javax.swing.JComboBox(Persona.Genero.values());
        cancelarP = new javax.swing.JPanel();
        cancelarL = new javax.swing.JLabel();
        generarFP = new javax.swing.JPanel();
        generarFL = new javax.swing.JLabel();
        campoCiudad = new javax.swing.JTextField();
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
        jSeparator12 = new javax.swing.JSeparator();
        colorL = new javax.swing.JLabel();
        añadirServicio = new javax.swing.JPanel();
        añadirServicioL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        valorTotalL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoCodigoS = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaServicios = new Componentes.Table();
        buscarCarP = new javax.swing.JPanel();
        buscarCarL = new javax.swing.JLabel();
        registrarClienteP = new javax.swing.JPanel();
        registraClienteL = new javax.swing.JLabel();
        buscarClienteP = new javax.swing.JPanel();
        buscarClienteL = new javax.swing.JLabel();
        registrarCarP = new javax.swing.JPanel();
        registrarCarL = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        execepcion = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modificarUsuarioL.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        modificarUsuarioL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarUsuarioL.setText("Facturación");
        jPanel1.add(modificarUsuarioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 40));

        identificacionL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        identificacionL.setText("Identificación");
        jPanel1.add(identificacionL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 90, -1));

        campoIdentificacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoIdentificacion.setForeground(new java.awt.Color(204, 204, 204));
        campoIdentificacion.setBorder(null);
        jPanel1.add(campoIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 180, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 180, 10));

        nombreL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombreL.setForeground(new java.awt.Color(204, 204, 204));
        nombreL.setText("  Nombre   ");
        jPanel1.add(nombreL, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 70, -1));

        campoNombre.setEditable(false);
        campoNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(204, 204, 204));
        campoNombre.setBorder(null);
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 180, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 180, 10));

        apellidoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        apellidoL.setForeground(new java.awt.Color(204, 204, 204));
        apellidoL.setText("Apellido");
        jPanel1.add(apellidoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 50, -1));

        campoApellido.setEditable(false);
        campoApellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoApellido.setForeground(new java.awt.Color(204, 204, 204));
        campoApellido.setBorder(null);
        jPanel1.add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 180, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 180, -1));

        telefonoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        telefonoL.setForeground(new java.awt.Color(204, 204, 204));
        telefonoL.setText("Telefono");
        jPanel1.add(telefonoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        campoTelefono.setEditable(false);
        campoTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoTelefono.setForeground(new java.awt.Color(204, 204, 204));
        campoTelefono.setBorder(null);
        jPanel1.add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 180, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 180, -1));

        correoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        correoL.setForeground(new java.awt.Color(204, 204, 204));
        correoL.setText("Correo");
        jPanel1.add(correoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 50, -1));

        campoCorreo.setEditable(false);
        campoCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoCorreo.setForeground(new java.awt.Color(204, 204, 204));
        campoCorreo.setBorder(null);
        jPanel1.add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 180, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 180, -1));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 20, 450));

        ciudadL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ciudadL.setForeground(new java.awt.Color(204, 204, 204));
        ciudadL.setText("Ciudad");
        jPanel1.add(ciudadL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 50, -1));

        campoLocalidad.setEditable(false);
        campoLocalidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoLocalidad.setForeground(new java.awt.Color(204, 204, 204));
        campoLocalidad.setBorder(null);
        jPanel1.add(campoLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 180, -1));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 180, -1));

        generoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        generoL.setForeground(new java.awt.Color(204, 204, 204));
        generoL.setText("Genero");
        jPanel1.add(generoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 50, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 180, -1));

        localidadL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        localidadL.setForeground(new java.awt.Color(204, 204, 204));
        localidadL.setText("Localidad");
        jPanel1.add(localidadL, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 70, -1));

        comboboxGenero.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        comboboxGenero.setBorder(null);
        comboboxGenero.setEnabled(false);
        jPanel1.add(comboboxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 180, -1));

        cancelarP.setBackground(new java.awt.Color(54, 38, 87));

        cancelarL.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cancelarL.setForeground(new java.awt.Color(255, 255, 255));
        cancelarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarL.setText("Cancelar Proceso");
        cancelarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cancelarPLayout = new javax.swing.GroupLayout(cancelarP);
        cancelarP.setLayout(cancelarPLayout);
        cancelarPLayout.setHorizontalGroup(
            cancelarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelarL, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        cancelarPLayout.setVerticalGroup(
            cancelarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(cancelarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 100, 30));

        generarFP.setBackground(new java.awt.Color(54, 38, 87));

        generarFL.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        generarFL.setForeground(new java.awt.Color(255, 255, 255));
        generarFL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generarFL.setText("Generar Factura");
        generarFL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generarFLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout generarFPLayout = new javax.swing.GroupLayout(generarFP);
        generarFP.setLayout(generarFPLayout);
        generarFPLayout.setHorizontalGroup(
            generarFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generarFL, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        generarFPLayout.setVerticalGroup(
            generarFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generarFL, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(generarFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 520, 100, 30));

        campoCiudad.setEditable(false);
        campoCiudad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoCiudad.setForeground(new java.awt.Color(204, 204, 204));
        campoCiudad.setBorder(null);
        jPanel1.add(campoCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 180, -1));

        placaL.setBackground(new java.awt.Color(204, 204, 204));
        placaL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        placaL.setText("Placa");
        jPanel1.add(placaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 50, 20));

        campoMarca.setEditable(false);
        campoMarca.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoMarca.setForeground(new java.awt.Color(204, 204, 204));
        campoMarca.setBorder(null);
        jPanel1.add(campoMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 210, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 210, 20));

        tipoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tipoL.setForeground(new java.awt.Color(204, 204, 204));
        tipoL.setText("Tipo");
        jPanel1.add(tipoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 40, 20));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 210, 10));

        marcaL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        marcaL.setForeground(new java.awt.Color(204, 204, 204));
        marcaL.setText("Marca");
        jPanel1.add(marcaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 40, 20));

        comboboxTipoCar.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        comboboxTipoCar.setBorder(null);
        comboboxTipoCar.setEnabled(false);
        jPanel1.add(comboboxTipoCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 210, 20));

        campoPlaca.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoPlaca.setForeground(new java.awt.Color(204, 204, 204));
        campoPlaca.setBorder(null);
        jPanel1.add(campoPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 210, -1));

        campoModelo.setEditable(false);
        campoModelo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoModelo.setForeground(new java.awt.Color(204, 204, 204));
        campoModelo.setBorder(null);
        jPanel1.add(campoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 210, -1));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 210, 10));

        modeloL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        modeloL.setForeground(new java.awt.Color(204, 204, 204));
        modeloL.setText("Modelo");
        jPanel1.add(modeloL, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, 20));

        campoColor.setEditable(false);
        campoColor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoColor.setForeground(new java.awt.Color(204, 204, 204));
        campoColor.setBorder(null);
        campoColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoColorActionPerformed(evt);
            }
        });
        jPanel1.add(campoColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 210, -1));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, 110, 10));

        colorL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        colorL.setForeground(new java.awt.Color(204, 204, 204));
        colorL.setText("Color");
        jPanel1.add(colorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 40, 10));

        añadirServicio.setBackground(new java.awt.Color(54, 38, 87));

        añadirServicioL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        añadirServicioL.setForeground(new java.awt.Color(255, 255, 255));
        añadirServicioL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añadirServicioL.setText("Añadir Servicio");
        añadirServicioL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirServicioLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout añadirServicioLayout = new javax.swing.GroupLayout(añadirServicio);
        añadirServicio.setLayout(añadirServicioLayout);
        añadirServicioLayout.setHorizontalGroup(
            añadirServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, añadirServicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(añadirServicioL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        añadirServicioLayout.setVerticalGroup(
            añadirServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, añadirServicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(añadirServicioL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(añadirServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, 110, 30));

        jPanel2.setBackground(new java.awt.Color(123, 85, 220));

        valorTotalL.setBackground(new java.awt.Color(123, 85, 220));
        valorTotalL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(valorTotalL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(valorTotalL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 100, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Valor Total:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 80, 30));

        campoCodigoS.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        campoCodigoS.setBorder(null);
        jPanel1.add(campoCodigoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 110, -1));

        tablaServicios.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaServicios.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablaServicios.setSelectionForeground(new java.awt.Color(123, 85, 220));
        jScrollPane2.setViewportView(tablaServicios);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 490, 150));

        buscarCarP.setBackground(new java.awt.Color(255, 255, 255));

        buscarCarL.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        buscarCarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarCarL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/car_search.png"))); // NOI18N
        buscarCarL.setToolTipText("Buscar cliente");
        buscarCarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarCarLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarCarLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarCarLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buscarCarPLayout = new javax.swing.GroupLayout(buscarCarP);
        buscarCarP.setLayout(buscarCarPLayout);
        buscarCarPLayout.setHorizontalGroup(
            buscarCarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarCarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buscarCarL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buscarCarPLayout.setVerticalGroup(
            buscarCarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarCarPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buscarCarL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(buscarCarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 50, 50));

        registrarClienteP.setBackground(new java.awt.Color(255, 255, 255));

        registraClienteL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registraClienteL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/person_add_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        registraClienteL.setToolTipText("Registrar cliente");
        registraClienteL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registraClienteLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registraClienteLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registraClienteLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout registrarClientePLayout = new javax.swing.GroupLayout(registrarClienteP);
        registrarClienteP.setLayout(registrarClientePLayout);
        registrarClientePLayout.setHorizontalGroup(
            registrarClientePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarClientePLayout.createSequentialGroup()
                .addComponent(registraClienteL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        registrarClientePLayout.setVerticalGroup(
            registrarClientePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrarClientePLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registraClienteL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(registrarClienteP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 50, 50));

        buscarClienteP.setBackground(new java.awt.Color(255, 255, 255));

        buscarClienteL.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        buscarClienteL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarClienteL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/person_search_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        buscarClienteL.setToolTipText("Buscar cliente");
        buscarClienteL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarClienteLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarClienteLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarClienteLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buscarClientePLayout = new javax.swing.GroupLayout(buscarClienteP);
        buscarClienteP.setLayout(buscarClientePLayout);
        buscarClientePLayout.setHorizontalGroup(
            buscarClientePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarClientePLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buscarClienteL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buscarClientePLayout.setVerticalGroup(
            buscarClientePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarClientePLayout.createSequentialGroup()
                .addComponent(buscarClienteL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(buscarClienteP, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 50, 50));

        registrarCarP.setBackground(new java.awt.Color(255, 255, 255));

        registrarCarL.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        registrarCarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarCarL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/car.png"))); // NOI18N
        registrarCarL.setToolTipText("Buscar cliente");
        registrarCarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarCarLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarCarLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarCarLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout registrarCarPLayout = new javax.swing.GroupLayout(registrarCarP);
        registrarCarP.setLayout(registrarCarPLayout);
        registrarCarPLayout.setHorizontalGroup(
            registrarCarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrarCarPLayout.createSequentialGroup()
                .addComponent(registrarCarL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        registrarCarPLayout.setVerticalGroup(
            registrarCarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarCarPLayout.createSequentialGroup()
                .addComponent(registrarCarL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(registrarCarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 100, 50, 50));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 210, 10));

        execepcion.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        execepcion.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(execepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 210, 10));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarLMouseClicked

    }//GEN-LAST:event_cancelarLMouseClicked

    private void generarFLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarFLMouseClicked

        //Atributos Cliente
        long identificacion = Long.parseLong(campoIdentificacion.getText());
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        long telefono = Long.parseLong(campoTelefono.getText());
        String correo = campoCorreo.getText();
        String ciudad = campoCiudad.getText();
        String localidad = campoLocalidad.getText();
        Genero genero = Genero.valueOf(comboboxGenero.getSelectedItem().toString());

        Cliente clienteFac = new Cliente();
        clienteFac.setIdentificacion(identificacion);

        //Atributos Vehiculo
        String placa = campoPlaca.getText();
        String marca = campoMarca.getText();
        short modelo = Short.parseShort(campoModelo.getText());
        String color = campoColor.getText();
        Tipo tipo = Tipo.valueOf(comboboxTipoCar.getSelectedItem().toString());

        String veriClt = cliente.buscarCliente(identificacion);
        String veriVhc = vehiculo.buscarVehiculo(placa);

        if ((veriClt.trim()).equals("")) {
            cliente.insertarCliente(identificacion, nombre, apellido, genero, telefono, correo, ciudad, localidad);
        }

        if ((veriVhc.trim()).equals("")) {
            vehiculo.insertarVehiculo(placa, marca, modelo, color, tipo, clienteFac);
        }

        Administrador facturador = new Administrador();
        facturador.setIdentificacion(1006288141);

        factura.insertarFactura(valorCalculado, LocalDate.now(), facturador);

        int pos = 0;

        while (pos < listaActividades.size()) {

            Actividad elemento = listaActividades.get(pos);

            String sid = elemento.getCodigo();

            insertarFacturacion(placa, sid);
            pos++;
        }

        panelFacturacion p1 = new panelFacturacion();
        showPanel(p1);
    }//GEN-LAST:event_generarFLMouseClicked

    private void campoColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoColorActionPerformed

    }//GEN-LAST:event_campoColorActionPerformed

    private void añadirServicioLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirServicioLMouseClicked
        String codigo = campoCodigoS.getText();

        Actividad actividad = buscarActividad(codigo);

        if (listaActividades.contains(actividad)) {

            execepcion.setText("Servicio ya añadido");
            return;
        }

        listaActividades.add(actividad);
        execepcion.setText("");

        int valorTotal = valorCalculado(actividad);

        valorCalculado = valorCalculado + valorTotal;

        valorTotalL.setText("$ " + String.valueOf(valorCalculado));

        imageTableDelete();

        tablaServicios.updateUI();

        establecerTamañoColums();

    }//GEN-LAST:event_añadirServicioLMouseClicked

    private void buscarClienteLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarClienteLMouseEntered
        buscarClienteP.setBackground(new Color(123, 85, 220));
    }//GEN-LAST:event_buscarClienteLMouseEntered

    private void buscarClienteLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarClienteLMouseExited
        buscarClienteP.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_buscarClienteLMouseExited

    private void registraClienteLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registraClienteLMouseEntered
        registrarClienteP.setBackground(new Color(123, 85, 220));
    }//GEN-LAST:event_registraClienteLMouseEntered

    private void registraClienteLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registraClienteLMouseExited
        registrarClienteP.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_registraClienteLMouseExited

    private void buscarClienteLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarClienteLMouseClicked

        new seleccionarCliente(this).setVisible(true);

    }//GEN-LAST:event_buscarClienteLMouseClicked

    private void registraClienteLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registraClienteLMouseClicked
        nombreL.setForeground(Color.BLACK);
        apellidoL.setForeground(Color.BLACK);
        telefonoL.setForeground(Color.BLACK);
        correoL.setForeground(Color.BLACK);
        ciudadL.setForeground(Color.BLACK);
        localidadL.setForeground(Color.BLACK);
        generoL.setForeground(Color.BLACK);

        campoNombre.setEditable(true);
        campoApellido.setEditable(true);
        campoTelefono.setEditable(true);
        campoCorreo.setEditable(true);
        campoCiudad.setEditable(true);
        campoLocalidad.setEditable(true);
        comboboxGenero.setEnabled(true);


    }//GEN-LAST:event_registraClienteLMouseClicked

    private void buscarCarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarCarLMouseClicked
        new seleccionarVehiculo(this).setVisible(true);
    }//GEN-LAST:event_buscarCarLMouseClicked

    private void buscarCarLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarCarLMouseEntered
        buscarCarP.setBackground(new Color(123, 85, 220));

    }//GEN-LAST:event_buscarCarLMouseEntered

    private void buscarCarLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarCarLMouseExited
        buscarCarP.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_buscarCarLMouseExited

    private void registrarCarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarCarLMouseClicked
        placaL.setForeground(Color.BLACK);
        marcaL.setForeground(Color.BLACK);
        modeloL.setForeground(Color.BLACK);
        tipoL.setForeground(Color.BLACK);
        colorL.setForeground(Color.BLACK);

        campoMarca.setEditable(true);
        campoModelo.setEditable(true);
        campoColor.setEditable(true);
        comboboxTipoCar.setEnabled(true);


    }//GEN-LAST:event_registrarCarLMouseClicked

    private void registrarCarLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarCarLMouseEntered
        registrarCarP.setBackground(new Color(123, 85, 220));
    }//GEN-LAST:event_registrarCarLMouseEntered

    private void registrarCarLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarCarLMouseExited
        registrarCarP.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_registrarCarLMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoL;
    private javax.swing.JPanel añadirServicio;
    private javax.swing.JLabel añadirServicioL;
    private javax.swing.JLabel buscarCarL;
    private javax.swing.JPanel buscarCarP;
    private javax.swing.JLabel buscarClienteL;
    private javax.swing.JPanel buscarClienteP;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCiudad;
    private javax.swing.JTextField campoCodigoS;
    private javax.swing.JTextField campoColor;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoIdentificacion;
    private javax.swing.JTextField campoLocalidad;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel cancelarL;
    private javax.swing.JPanel cancelarP;
    private javax.swing.JLabel ciudadL;
    private javax.swing.JLabel colorL;
    private javax.swing.JComboBox<Persona.Genero> comboboxGenero;
    private javax.swing.JComboBox<Vehiculo.Tipo> comboboxTipoCar;
    private javax.swing.JLabel correoL;
    private javax.swing.JLabel execepcion;
    private javax.swing.JLabel generarFL;
    private javax.swing.JPanel generarFP;
    private javax.swing.JLabel generoL;
    private javax.swing.JLabel identificacionL;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
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
    private javax.swing.JLabel marcaL;
    private javax.swing.JLabel modeloL;
    private javax.swing.JLabel modificarUsuarioL;
    private javax.swing.JLabel nombreL;
    private javax.swing.JLabel placaL;
    private javax.swing.JLabel registraClienteL;
    private javax.swing.JLabel registrarCarL;
    private javax.swing.JPanel registrarCarP;
    private javax.swing.JPanel registrarClienteP;
    private Componentes.Table tablaServicios;
    private javax.swing.JLabel telefonoL;
    private javax.swing.JLabel tipoL;
    private javax.swing.JLabel valorTotalL;
    // End of variables declaration//GEN-END:variables

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

    public JTextField getCampoPlaca() {
        return campoPlaca;
    }

    public JTextField getCampoColor() {
        return campoColor;
    }

    public JTextField getCampoMarca() {
        return campoMarca;
    }

    public JTextField getCampoModelo() {
        return campoModelo;
    }

    public JComboBox<Tipo> getComboboxTipoCar() {
        return comboboxTipoCar;
    }

    public void showPanel(JPanel panel) {

        panel.setSize(1050, 560);
        panel.setLocation(0, 0);

        content.removeAll();
        content.add(panel);
        content.revalidate();
        content.repaint();

    }

    public Actividad buscarActividad(String codigo) {

        CConexion objetoConexion = new CConexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Costo");

        sql = "select * from servicio Where sid = '" + codigo + "';";

        Actividad actividad = new Actividad();

        Statement st;

        try {

            st = objetoConexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                actividad.setCodigo(rs.getString(1));
                actividad.setDescripcion(rs.getString(2));
                actividad.setCosto(Integer.parseInt(rs.getString(3)));

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }
        return actividad;
    }

    public int valorCalculado(Actividad actividad) {
        int valor = actividad.getCosto();

        return valor;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int fila = tablaServicios.rowAtPoint(e.getPoint());
        int columna = tablaServicios.columnAtPoint(e.getPoint());

        if (columna == 3) {

            int motivoMultaIndex = tablaServicios.getSelectedRow();

            

            Actividad actividad = listaActividades.get(motivoMultaIndex);
            listaActividades.remove(actividad);
            panelFacturacion.this.valorCalculado -= actividad.getCosto();

            valorTotalL.setText("$ " + valorCalculado);
            tablaServicios.clearSelection();
            imageTableDelete();
            tablaServicios.updateUI();
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

    public class ModeloTablaPersonalizado1 implements TableModel {

        private String[] columnNames = {"Codigo", "Descripcion", "Valor", ""};

        private Class[] columnClasses = {short.class, String.class, int.class};

        @Override
        public int getRowCount() {
            return listaActividades.size();
        }

        @Override
        public int getColumnCount() {
            return this.columnNames.length;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return this.columnNames[columnIndex];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return this.columnClasses[columnIndex];
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Actividad activi = listaActividades.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return activi.getCodigo();
                case 1:
                    return activi.getDescripcion();
                case 2:
                    return activi.getCosto();
                case 3:
                    return "Eliminar";

            }
            return null;
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void addTableModelListener(TableModelListener l) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void removeTableModelListener(TableModelListener l) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public void imageTableDelete() {
        tablaServicios.getColumnModel().getColumn(3).setCellRenderer(new gestionCeldas("Eliminar"));

    }

    public void insertarFacturacion(String placa, String servicioID) {

        CConexion objetoConexion = new CConexion();

        String consultaFID = "select max(fid) from factura;";

        String consulta = "insert into facturacion (fid, v_placa, sid, fecha_inventario) values (?,?,?,?);";

        Statement st;

        try {

            st = objetoConexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(consultaFID);

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);

            while (rs.next()) {

                cs.setInt(1, rs.getInt(1));

            }

            cs.setString(2, placa);
            cs.setString(3, servicioID);
            cs.setString(4, LocalDate.now().toString());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Se insertó correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: inserta FACCC" + e.toString());
        }

    }

    public void establecerTamañoColums() {

        tablaServicios.getColumnModel().getColumn(3).setPreferredWidth(0);

    }
}
