Create Table cliente(
	CID INTEGER PRIMARY KEY,
	c_nombre Varchar(200) NOT NULL,
	c_apellido Varchar(200) NOT NULL,
	c_telefono Varchar(20),
	c_correo Varchar(200),
	c_ciudad Varchar(20) not null,
	c_direccion Varchar(20),
	c_generoBiologico Varchar(20) NOT NULL
);

Create Table vehiculo(
	v_placa Varchar(20) PRIMARY KEY,
	v_marca Varchar(20) NOT NULL,
	v_modelo INTEGER NOT NULL,
	v_color Varchar(20) NOT NULL,
	V_tipo Varchar(20) NOT NULL,
	CID INTEGER NOT NULL,
	
	FOREIGN KEY(CID) REFERENCES cliente(CID)
);



Create Table administrador(
	AID INTEGER PRIMARY KEY,
	a_nombre Varchar(200) NOT NULL,
	a_apellido Varchar(200) NOT NULL,
	a_telefono Varchar(20),
	a_correo Varchar(20),
	a_ciudad Varchar(20) not null,
	a_direccion varchar(20),
	a_usuario varchar(20)not null,
	a_constraseña Varchar(20) NOT NULL
);

Create table contrato(
	contrato_id Serial PRIMARY KEY,
	contrato_FechaInicio Varchar(200) NOT NULL,
	contrato_FechaFinalizacion Varchar(200),
	contrato_tipo Varchar(20) NOT NULL,
	contrato_salario INTEGER NOT NULL,
	contrato_jornada Varchar(20) NOT NULL
);

Create Table operario(
	OID INTEGER PRIMARY KEY,
	o_nombre Varchar(200) NOT NULL,
	o_apellido Varchar(200) NOT NULL,
	o_telefono Varchar(20),
	o_correo Varchar(200),
	o_ciudad Varchar(20) not null,
	o_direccion Varchar(20),
	o_generoBiologico Varchar(20) NOT NULL,
	o_especialidad Varchar(200),
	contrato_id integer not null,
	
	FOREIGN KEY(contrato_id) REFERENCES contrato(contrato_id) on delete cascade
);


Create Table servicio(
	SID varchar(20) PRIMARY KEY,
	s_descripcion Varchar(200) NOT NULL,
	s_costo INTEGER NOT NULL,
	OID integer not null,
		
	foreign key(OID) REFERENCES operario(OID) on delete cascade
);

Create Table factura(
	FID serial PRIMARY KEY,
	f_valorTotal INTEGER NOT NULL,
	f_fechaFacturacion Varchar(200) NOT NULL,
	AID integer NOT NULL,
	
	FOREIGN KEY(AID) REFERENCES administrador(AID)
);

Create table facturacion(
	FID serial not null,
	v_placa varchar(20) not null,
	SID varchar(20) not null,
	fecha_inventario VARCHAR(200) not null,
	
	primary key (FID,v_placa,SID),
	foreign key (FID) references factura(FID),
	foreign key (v_placa) references vehiculo(v_placa),
	foreign key (SID) references servicio(SID)
);