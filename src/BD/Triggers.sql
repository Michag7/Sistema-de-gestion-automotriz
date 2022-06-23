--Trigger de validación para la insercción o actualización de datos al esquema de administrador
CREATE OR REPLACE FUNCTION function_admin() returns trigger as $$
  BEGIN
    if new.aid is NULL THEN
    RAISE EXCEPTION 'El id del administrador no puede ser nulo';
    end if;
    
    IF LENGTH(cast(new.aid as varchar)) = 0 THEN
    RAISE EXCEPTION 'El id del administrador no puede estar vacío';
    end if;
    
    if LENGTH(cast(new.aid as varchar)) != 10 THEN
    raise exception 'El id del administrador debe contener 10 caracteres';
    end if;
    
    if New.a_nombre is NULL THEN
    RAISE EXCEPTION 'El nombre del administrador no puede ser nulo';
    end if;
    
    if new.a_apellido is NULL THEN
    RAISE EXCEPTION 'El apellido del administrador no puede ser nulo';
    end if;
    
    if new.a_telefono IS NULL THEN 
    RAISE EXCEPTION 'El número telefónico del administrador no puede ser nulo';
    end if;
    
    IF LENGTH(CASt(NEW.a_telefono as varchar)) = 0 THEN
    RAISE EXCEPTION 'El número telefónico del administrador no puede estar vacío';
    end if;
    
    IF LENGTH(cast(NEW.a_telefono as varchar)) != 10 THEN
    raise EXCEPTION 'El número telefónico debe contener 10 caracteres';
    end if;
    
    if new.a_correo IS NULL THEN
    RAISE EXCEPTION 'El correo electrónico del administrador no puede ser nulo';
    end if;
    
    if new.a_ciudad is NULL THEN
    Raise EXCEPTION 'La ciudad del administrador no puede ser nulo';
    end if;
    
    if new.a_dirrecion is null then 
    RAISE EXCEPTION 'la localidad del administrador no puede ser nulo';
    end if;
    
    if new.a_usuario IS NULL THEN
    RAISE EXCEPTION 'El username del administrador no puede ser nulo';
    end if;
    
    if new.a_contraseña IS NULL THEN 
    RAISE EXCEPTION 'La contraseña del administrador no puede ser nulo';
    end if;
    
 end;
$$ LANGUAGE 'plpgsql';

CREATE TRIGGER trigger_admin BEFORE INSERT OR UPDATE 
ON administrador FOR EACH ROW
EXECUTE FUNCTION function_admin();

-------------------------------------------------------------------------------------
--Trigger de validación para la insercción o actualización de datos al esquema de cliente
CREATE OR REPLACE FUNCTION function_cliente() returns trigger as $$
  BEGIN
    if new.cid is NULL THEN
    RAISE EXCEPTION 'El id del cliente no puede ser nulo';
    end if;
    
    IF LENGTH(cast(new.cid as varchar)) = 0 THEN
    RAISE EXCEPTION 'El id del cliente no puede estar vacío';
    end if;
    
    if LENGTH(cast(new.cid as varchar)) != 10 THEN
    raise exception 'El id del cliente debe contener 10 caracteres';
    end if;
    
    if New.c_nombre is NULL THEN
    RAISE EXCEPTION 'El nombre del cliente no puede ser nulo';
    end if;
    
    if new.c_apellido is NULL THEN
    RAISE EXCEPTION 'El apellido del cliente no puede ser nulo';
    end if;
    
    if new.c_telefono IS NULL THEN 
    RAISE EXCEPTION 'El número telefónico del administrador no puede ser nulo';
    end if;
    
    IF LENGTH(CASt(NEW.c_telefono as varchar)) = 0 THEN
    RAISE EXCEPTION 'El número telefónico del cliente no puede estar vacío';
    end if;
    
    IF LENGTH(cast(NEW.c_telefono as varchar)) != 10 THEN
    raise EXCEPTION 'El número telefónico debe contener 10 caracteres';
    end if;
    
    if new.c_correo IS NULL THEN
    RAISE EXCEPTION 'El correo electrónico del cliente no puede ser nulo';
    end if;
    
    if new.c_ciudad is NULL THEN
    Raise EXCEPTION 'La ciudad del cliente no puede ser nulo';
    end if;
    
    if new.c_dirreccion is null then 
    RAISE EXCEPTION 'la localidad del cliente no puede ser nulo';
    end if;
    
    if new.c_generobiologico is null then 
      RAISE EXCEPTION 'El género biológico del cliente no puede ser nulo';
    end if;
 end;
$$ LANGUAGE 'plpgsql';

CREATE TRIGGER trigger_cliente BEFORE INSERT OR UPDATE 
ON cliente FOR EACH ROW
EXECUTE FUNCTION function_cliente();
-------------------------------------------------------------------------------------

--Trigger de validación para la insercción o actualización de datos al esquema de vehículo
CREATE OR REPLACE FUNCTION function_vehiculo() returns trigger as $$
  BEGIN
    if new.v_placa is NULL THEN
    RAISE EXCEPTION 'La placa del vehículo no puede ser nulo';
    end if;
    
    IF LENGTH(new.v_placa) = 0 THEN
    RAISE EXCEPTION 'La placa del vehículo no puede estar vacío';
    end if;
    
    if LENGTH(new.v_placa) != 6 THEN
    raise exception 'La placa del vehículo debe contener sólo 6 caracteres';
    end if;
    
    if New.v_marca is NULL THEN
    RAISE EXCEPTION 'La marca del vehículo no puede ser nulo';
    end if;
    
    if new.v_modelo is NULL THEN
    RAISE EXCEPTION 'El módelo del vehículo no puede ser nulo';
    end if;
    
    if LENGTH(new.v_placa) != 4 THEN
    raise exception 'El módelo del vehículo debe contener sólo 4 caracteres';
    end if;
    
    if new.v_color IS NULL THEN 
    RAISE EXCEPTION 'El color del vehículo no puede ser nulo';
    end if;
    
    if new.v_tipo IS NULL THEN
    RAISE EXCEPTION 'El tipo de vehículo no puede ser nulo';
    end if;
    
    if new.cid is NULL THEN
    Raise EXCEPTION 'La identificación del cliente propietario del vehículo no puede ser nulo';
    end if;
 end;
$$ LANGUAGE 'plpgsql';

CREATE TRIGGER trigger_vehiculo BEFORE INSERT OR UPDATE 
ON vehiculo FOR EACH ROW
EXECUTE FUNCTION function_vehiculo();

-------------------------------------------------------------------------------------
--Trigger de validación para la insercción o actualización de datos al esquema de contrato de un operario
CREATE OR REPLACE FUNCTION function_contrato() returns trigger as $$
  BEGIN
    if new.contrato_FechaInicio is NULL THEN
    RAISE EXCEPTION 'La fecha de inicio del contrato no puede ser nulo';
    end if;
    
    if new.contrato_FechaFinalizacion is NULL THEN
    RAISE EXCEPTION 'La fecha de finalización del contrato no puede ser nulo';
    end if;
    
    if new.contrato_tipo is NULL THEN
    RAISE EXCEPTION 'El tipo de contrato no puede ser nulo';
    end if;
    
    IF LENGTH(CASt(NEW.contrato_salario as varchar)) >= 6 THEN
    RAISE EXCEPTION 'El salario debe tener mínimo 6 caracteres';
    end if;
    
    if new.contrato_jornada is NULL THEN
    RAISE EXCEPTION 'La jornada del contrato no puede ser nulo';
    end if;
   
 end;
$$ LANGUAGE 'plpgsql';

CREATE TRIGGER trigger_contrato BEFORE INSERT OR UPDATE 
ON contrato FOR EACH ROW
EXECUTE FUNCTION function_contrato();

-------------------------------------------------------------------------------------
--Trigger de validación para la insercción o actualización de datos al esquema de operario
CREATE OR REPLACE FUNCTION function_operario() returns trigger as $$
 BEGIN 
    if new.oid is NULL THEN
    RAISE EXCEPTION 'El id del operario no puede ser nulo';
    end if;
    
    IF LENGTH(cast(new.oid as varchar)) = 0 THEN
    RAISE EXCEPTION 'El id del operario no puede estar vacío';
    end if;
    
    if LENGTH(cast(new.oid as varchar)) != 10 THEN
    raise exception 'El id del operario debe contener 10 caracteres';
    end if;
    
    if New.o_nombre is NULL THEN
    RAISE EXCEPTION 'El nombre del operario no puede ser nulo';
    end if;
    
    if new.o_apellido is NULL THEN
    RAISE EXCEPTION 'El apellido del operario no puede ser nulo';
    end if;
    
    if new.o_telefono IS NULL THEN 
    RAISE EXCEPTION 'El número telefónico del operario no puede ser nulo';
    end if;
    
    IF LENGTH(CASt(NEW.o_telefono as varchar)) = 0 THEN
    RAISE EXCEPTION 'El número telefónico del operario no puede estar vacío';
    end if;
    
    IF LENGTH(cast(NEW.o_telefono as varchar)) != 10 THEN
    raise EXCEPTION 'El número telefónico debe contener 10 caracteres';
    end if;
    
    if new.o_correo IS NULL THEN
    RAISE EXCEPTION 'El correo electrónico del operario no puede ser nulo';
    end if;
    
    if new.o_ciudad is NULL THEN
    Raise EXCEPTION 'La ciudad del operario no puede ser nulo';
    end if;
    
    if new.o_dirreccion is null then 
    RAISE EXCEPTION 'la localidad del operario no puede ser nulo';
    end if;
    
    if new.o_generobiologico is null then 
      RAISE EXCEPTION 'El género biológico del operario no puede ser nulo';
    end if;
    
    if new.o_especialidad is null then 
      RAISE EXCEPTION 'Diligencie el cargo del operario, no puede ser nulo';
    end if;
    
    if new.contrato_id is null then 
      RAISE EXCEPTION 'El id del contrato del operario no puede ser nulo';
    end if;
 end;
$$ LANGUAGE 'plpgsql';

CREATE TRIGGER trigger_operario BEFORE INSERT OR UPDATE 
ON operario FOR EACH ROW
EXECUTE FUNCTION function_operario();

-------------------------------------------------------------------------------------
--Trigger de validación para la insercción o actualización de datos al esquema de servicio
CREATE OR REPLACE FUNCTION function_servicio() returns trigger as $$
 BEGIN 
    if new.sid is NULL THEN
    RAISE EXCEPTION 'El identificador del servicio no puede ser nulo';
    end if;
    
    IF LENGTH(cast(new.sid as varchar)) = 0 THEN
    RAISE EXCEPTION 'El identificador del servicio no puede estar vacío';
    end if;
    
    if New.s_descripcion is NULL THEN
    RAISE EXCEPTION 'La descripción del servicio no puede ser nulo';
    end if;
    
    IF LENGTH(cast(new.s_costo as varchar)) = 0 THEN
    RAISE EXCEPTION 'El costo del servicio no puede estar vacío';
    end if;
    
    if new.OID is NULL THEN
    RAISE EXCEPTION 'El identifcador del operario que elabora el servicio no puede estar vacío';
    end if;
 end;
$$ LANGUAGE 'plpgsql';

CREATE TRIGGER trigger_servicio BEFORE INSERT OR UPDATE 
ON servicio FOR EACH ROW
EXECUTE FUNCTION function_servicio();
-------------------------------------------------------------------------------------

--Trigger de validación para la insercción o actualización de datos al esquema de factura
CREATE OR REPLACE FUNCTION function_factura() returns trigger as $$
 BEGIN 
    if new.aid is NULL THEN
    RAISE EXCEPTION 'El identificador del administrador que tramita la factura no puede ser null';
    end if;
 end;
$$ LANGUAGE 'plpgsql';

CREATE TRIGGER trigger_factura BEFORE INSERT OR UPDATE 
ON factura FOR EACH ROW
EXECUTE FUNCTION function_factura();
