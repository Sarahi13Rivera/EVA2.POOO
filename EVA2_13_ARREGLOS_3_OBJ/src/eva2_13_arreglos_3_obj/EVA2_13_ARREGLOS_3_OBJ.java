/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_arreglos_3_obj;

import java.util.Scanner;

/**
 *
 * @author HP1000
 */
public class EVA2_13_ARREGLOS_3_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[]arregloPer = new Persona[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
        //Crear el objeto:
        arregloPer[i]= new Persona();
            System.out.println("¿Cual es tu nombre?");
            arregloPer[i].setNombre(input.nextLine());
        }
        //Mostrar Datos
        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre: " + arregloPer[i].getNombre());
        }
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
