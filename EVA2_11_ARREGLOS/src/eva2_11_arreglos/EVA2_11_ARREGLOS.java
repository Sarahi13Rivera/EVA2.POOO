/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_arreglos;

/**
 *
 * @author HP1000
 */
public class EVA2_11_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLOS
        //Fila o columna de excel
        //Almacenan datos del mismo tipo
        //Se pueden acceder por indices
        //JAVA: primer posicion --> 0, ultima:cantidad de elementos -1
        //JAVA:arreglos son objetos
        
        int [] arreglo = new int[10];//arreglo con 10 enteros
        //¿como lo usamos?
        arreglo[0]=100;//el arreglo en la posicion 0, se le asigna 10
        System.out.println("El valor del arreglo [0]= " + arreglo.length );
        arreglo[1]=200;
        arreglo[2]=300;
        arreglo[3]=400;
        arreglo[4]=500;
        arreglo[5]=600;
        arreglo[6]=700;
        arreglo[7]=800;
        arreglo[8]=900;
        arreglo[9]=1000;
        //arreglo arreglo[10] = 200 //aqui pasamos el arreglo
        String[] arreCade = new String[10];
        arreCade[5]="Hola Mundo";
        double[]arreDouble = new double [100000];
        arreDouble [99999]=0.2;
        Persona[]clasePOO = new Persona [32];//Arreglo para 32 objetos tipo persona
    }
    
}
class Persona{
    private String nombre;

     public Persona(){
    
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