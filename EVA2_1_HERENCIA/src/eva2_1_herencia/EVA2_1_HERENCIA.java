/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_herencia;

/**
 *
 * @author HP1000
 */
public class EVA2_1_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona perso1 = new Persona();
        
        Estudiante estu1 = new Estudiante("SARAHI", 19, "21550867");
        //estu1.setNombre("Sarahi");
        //estu1.setEdad(19);
       // estu1.setNumeroControl("21550867");
       // estu1.mostrarNombre();
       estu1.imprimirDatos();
       
       Maestro mtro1 = new Maestro ("Sarahi", 25, "11223344", 1234);
       mtro1.imprimirDatos();
    }
    
}
//SUBCLASE MAESTRO
class Maestro extends Persona{
    private int numeroRegistro;
    
    public Maestro(){
        super();
        System.out.println("CLASE MAESTRO");
    }
    public Maestro(String nombre, int edad, String numeroControl, int numeroRegistro){
    super(nombre, edad);
this.numeroRegistro = numeroRegistro;    
    
}
public int getNumeroRegistro(){
return numeroRegistro;
}
public void setNumeroRegistro(int numeroRegistro){
    this.numeroRegistro = numeroRegistro;
}
    @Override
   public void imprimirDatos(){
   super.imprimirDatos();
       System.out.println("Numero de registro " + numeroRegistro);
   }

}
//SUBCLASE (HIJO)
class Estudiante extends Persona{
    private String numeroControl;
    //Constructor Default
    public Estudiante(){
      super(); //LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        System.out.println("CLASE ESTUDIANTE");
    }
    public Estudiante (String nombre, int edad, String numeroControl){
        super (nombre, edad);//LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        this.numeroControl = numeroControl;
    }
    public String getNumeroControl(){
     return numeroControl;   
    }
    public void setNumeroControl (String numeroControl){
        this.numeroControl = numeroControl;
    }
    
    /*public void mostrarNombre(){
        System.out.println("Nombre del estudiante: " + getNombre());
    }*/
    @Override
    public void imprimirDatos(){
      super.imprimirDatos();//ESTOY LLAMANDO AL METODO IMPLIMIRDATOS DE PERSONA (SUPERCLASE) 
        System.out.println("No. de control: " + numeroControl);
    }
}
class Persona{//SUPERCLASE (PADRE)
    private String nombre;
    private int edad;

    public Persona(){
    this.nombre = "Diego";
    this.edad = 15;
    System.out.println("CLASE PERSONA");
}
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
public String getNombre(){
    return nombre;
}    
public void setNombre(String nombre){
    this.nombre = nombre;
}
public int getEdad(){
    return edad;
}    
public void setEdad(int edad){
    this.edad = edad;
}
public void imprimirDatos(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
}
}
