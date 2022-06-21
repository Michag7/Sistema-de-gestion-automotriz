
//PROYECTO DESARROLLO DE SOFTWARE

package Clases;

public class Administrador extends Persona{
    
    //Atributos propios que posee la clase
    private long usuario; //Este campo corresponde a la cédula del admin
    private String contraseña;

    public Administrador() {
        super(0, null, null, 0, null, null, null, null);
        this.usuario = 0;
        this.contraseña = "";
    }

    
    
    
    public Administrador(String contraseña, long identificacion, String nombre, String apellido, long telefono, String correo, String ciudad, String dirreccion, Genero genero) {
        super(identificacion, nombre, apellido, telefono, correo, ciudad, dirreccion, genero);
        this.usuario = identificacion;
        this.contraseña = contraseña;
    }
  
   
    
    //Métodos de acceso - getter
    public long getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    
    
    //Métodos de acceso - setter
    public void setUsuario(long usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    //Otros métodos
    @Override
    public String toString() {
        return (getNombre() + " " + getApellido());
    }
    
    
}
