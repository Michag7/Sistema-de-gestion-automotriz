//PROYECTO DESARROLLO DE SOFTWARE
package Clases;

public class Persona {

    public enum Genero {
        FEMENINO, MASCULINO, Masculino, Femenino
    }

    private long identificacion;
    private String nombre;
    private String apellido;
    private long telefono;
    private String correo;
    private String ciudad;
    private String direccion;
    private Genero genero;

    public Persona(long identificacion, String nombre, String apellido, long telefono, String correo, String ciudad, String direccion, Genero genero) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.genero = genero;
    }

// Constructor de la clase Persona.
//    public Persona(long identificacion, String nombre, String apellido, Genero genero, long telefono) throws IllegalArgumentException{
//        
////        if ( nombre == null || "".equals(nombre) ){
////            throw new IllegalArgumentException ("Debe ingresar el nombre de la persona"); 
////        }
////        
////        if ( apellido == null || "".equals(apellido) ){
////            throw new IllegalArgumentException ("Debe ingresar el apellido de la persona"); 
////        }
////        
////        if ( genero == null || "".equals(genero) ){
////            throw new IllegalArgumentException ("Debe ingresar el genero de la persona"); 
////        }
////        
////        if ( telefono == 0){
////            throw new IllegalArgumentException ("Debe ingresar el número telefónico correspondiente de la persona"); 
//        //}
//        
//        this.identificacion = identificacion;
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.genero = genero;
//        this.telefono = telefono;
//    }
//    
    // Métodos de acceso - getter
    public long getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Genero getGenero() {
        return genero;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    // Métodos de acceso - setter
    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDirreccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
