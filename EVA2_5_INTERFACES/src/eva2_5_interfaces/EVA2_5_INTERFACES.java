/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_interfaces;

/**
 *
 * @author HP1000
 */
public class EVA2_5_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Persona perso = new Persona ();
        perso.setNombre("Sarahi");
        perso.setEdad(19);
        perso.imprimirDatos();
        
        Vehiculo v = new Vehiculo("Chevrolet", "impala");
        v.imprimirDatos();
        v.mostrarMensaje();
        //MuestraDatos d = MuestraDatos;
    }
    
}
class Persona implements MuestraDatos{
    
    public Persona(){
        
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
   public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
   } 
}
class Vehiculo implements MuestraDatos, Mensaje{
    private String marca;
    private String modelo;

    public Vehiculo(){
    
}
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
   public void imprimirDatos(){
       System.out.println("Marca: " + marca);
       System.out.println("Modelo: " + modelo);
   } 
    @Override
    public void mostrarMensaje(){
        System.out.println("Hola Mundo");
    }
}
interface MuestraDatos{
//SOLO ACEPTAN METODOS PUBLICOS
    //SOLO ACEPTA DECLARACIONES DE METODOS --> Solo acepta metodos abstractos
    public void imprimirDatos();
        
    }
interface Mensaje{
    public void mostrarMensaje();
}