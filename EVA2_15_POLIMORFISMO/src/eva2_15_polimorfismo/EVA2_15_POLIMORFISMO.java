/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_polimorfismo;

/**
 *
 * @author HP1000
 */
public class EVA2_15_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("Sarahi", 19);
        Estudiante estudiante = new Estudiante("001122", "Karen", 25);
        Docente docente = new Docente("036","Juan",50);
        
        Persona persoEstu = estudiante;
        Estudiante estuPerso = (Estudiante) persona;
    }
    
}
