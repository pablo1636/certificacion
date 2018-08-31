package modelo;
// Generated 30/08/2018 16:01:07 by Hibernate Tools 4.3.1



/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer id;
     private String nombreyapellido;
     private String direccion;
     private String localidad;
     private String usuario;
     private String password;

    public Usuarios() {
    }

	
    public Usuarios(String nombreyapellido, String localidad) {
        this.nombreyapellido = nombreyapellido;
        this.localidad = localidad;
    }
    public Usuarios(String nombreyapellido, String direccion, String localidad, String usuario, String password) {
       this.nombreyapellido = nombreyapellido;
       this.direccion = direccion;
       this.localidad = localidad;
       this.usuario = usuario;
       this.password = password;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombreyapellido() {
        return this.nombreyapellido;
    }
    
    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}

