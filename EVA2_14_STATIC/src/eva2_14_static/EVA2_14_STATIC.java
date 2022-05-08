/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_FINAL;

/**
 *
 * @author HP1000
 */
public class EVA2_14_FINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
}
class EstudiantePosgrado extends Estudiante{
    
}
final class Estudiante extends Persona{
    private String numeroControl;
    
    public Estudiante(){
    }

    public Estudiante(String numeroControl) {
        this.numeroControl = numeroControl;
    }
     public Estudiante(String numeroControl, String nombre) {
        super(nombre);
         this.numeroControl = numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
    
}
class Persona{
private String nombre;
    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
