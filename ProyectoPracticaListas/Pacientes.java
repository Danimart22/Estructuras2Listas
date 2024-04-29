package ProyectoPracticaListas;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.Period;
public class Pacientes{
    private String nombre;
    private String apellido;
    private int edad;
    private String RH;
    private String ultimaCita;
    public Pacientes(String nombre, String apellido, int edad, String rH, String ultimaCita) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        RH = rH;
        this.ultimaCita = ultimaCita;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getRH() {
        return RH;
    }
    public void setRH(String rH) {
        RH = rH;
    }
    public String getUltimaCita() {
        return ultimaCita;
    }
    public void setUltimaCita(String ultimaCita) {
        this.ultimaCita = ultimaCita;
    }
    public Pacientes(String nombre, String apellido, int edad, String rH) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        RH = rH;
    }
    public static LocalDateTime verificarEdad(int edad){
        if(25 <= edad && edad <= 35){
            
        }else if(35 < edad && edad <= 45){

        } else if(edad > 45){

        }else{
            System.out.println("\nSu edad no entra en el rango de edades para la renovación automatica. ");
        }
        return null;
  
    }
    public static LocalDateTime verificarEdad(int edad, String ultimaCita){
        if(25 <= edad && edad <= 35){
            
        }else if(35 < edad && edad <= 45){

        } else if(edad > 45){

        }else{
            System.out.println("\nSu edad no entra en el rango de edades para la renovación automatica. ");
        }

        return null;
    }
    
}
