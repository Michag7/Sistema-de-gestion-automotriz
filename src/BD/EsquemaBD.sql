--Creación del esquema de Cliente
Create Table IF NOT EXISTS cliente(
	CID INTEGER PRIMARY KEY,
	c_nombre Varchar(200),
	c_apellido Varchar(200),
	c_telefono Varchar(20),
	c_correo Varchar(200),
	c_ciudad Varchar(20),
	c_direccion Varchar(20),
	c_generoBiologico Varchar(20)
);

--Creación del esquema de Vehículo
Create Table IF NOT EXISTS vehiculo(
	v_placa Varchar(20) PRIMARY KEY,
	v_marca Varchar(20),
	v_modelo INTEGER,
	v_color Varchar(20),
	V_tipo Varchar(20),
	CID INTEGER,
	
	FOREIGN KEY(CID) REFERENCES cliente(CID)
);


--Creación del esquema de Administrador
Create Table IF NOT EXISTS administrador(
	AID INTEGER PRIMARY KEY,
	a_nombre Varchar(200),
	a_apellido Varchar(200),
	a_telefono Varchar(20),
	a_correo Varchar(200),
	a_ciudad Varchar(20),
	a_direccion varchar(20),
	a_usuario varchar(20),
	a_constraseña Varchar(20)
);

--Creación del esquema de Contrato correspondiente a un operario
Create table IF NOT EXISTS contrato(
	contrato_id Serial PRIMARY KEY,
	contrato_FechaInicio Varchar(200),
	contrato_FechaFinalizacion Varchar(200),
	contrato_tipo Varchar(20),
	contrato_salario INTEGER,
	contrato_jornada Varchar(20)
);

--Creación del esquema de Operario
Create Table IF NOT EXISTS operario(
	OID INTEGER PRIMARY KEY,
	o_nombre Varchar(200) ,
	o_apellido Varchar(200),
	o_telefono Varchar(20),
	o_correo Varchar(200),
	o_ciudad Varchar(20),
	o_direccion Varchar(20),
	o_generoBiologico Varchar(20),
	o_especialidad Varchar(200),
	contrato_id integer,
	
	FOREIGN KEY(contrato_id) REFERENCES contrato(contrato_id) on delete cascade
);

--Creación del esquema de Servicio
Create Table IF NOT EXISTS servicio(
	SID varchar(20) PRIMARY KEY,
	s_descripcion Varchar(200),
	s_costo INTEGER,
	OID integer,
		
	foreign key(OID) REFERENCES operario(OID) on delete cascade
);

--Creación del esquema de Factura
Create Table IF NOT EXISTS factura(
	FID serial PRIMARY KEY,
	f_valorTotal INTEGER,
	f_fechaFacturacion Varchar(200),
	AID integer,
	
	FOREIGN KEY(AID) REFERENCES administrador(AID)
);

--Creación del esquema de facturación
Create table IF NOT EXISTS facturacion(
	FID serial,
	v_placa varchar(20),
	SID varchar(20),
	fecha_inventario VARCHAR(200),
	
	primary key (FID,v_placa,SID),
	foreign key (FID) references factura(FID),
	foreign key (v_placa) references vehiculo(v_placa),
	foreign key (SID) references servicio(SID)
);