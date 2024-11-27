/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

public class Cliente {
    private String contraseña;
    private String nombre;
    private String apellido;
    private String email;
    
    //constructores
   
    
    //get(),set()
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.contraseña = Contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }
    
    //metodos auxiliares propios de la clase
    public void registrarse(){
        System.out.println("Registro exitoso. . .");
    }
    
    public void historialReservas(){
        System.out.println("Ingresando al historial. . .");
    }
    
    public void actualizarDatosPersonales(){
        System.out.println("Actualizacion exitosa. . .");
    }

} //fin de clase Cliente

