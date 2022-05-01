/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_herencia_2;

/**
 *
 * @author HP1000
 */

/*
is a --> es un 
has a --> tiene un 
*/
public class EVA2_2_HERENCIA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion d = new Direccion ("20", 1605 , "San Jorge", "31051", "Chihuahua" , "Chihuahua", "6144039868");
        Estudiante e = new Estudiante("00112233", "Sarahi", 40, d);
        e.imprimirDatos();
    }
    
}
class Direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;
    private String telefono;
    
    public Direccion(){
        this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.cp = "";
        this.ciudad = "";
        this.estado = "";
        this.telefono = "";
}
    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado, String telefono) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void imprimirDatos(){
        System.out.println("calle: " + calle + " # " + numero + ", col. " + colonia +
                "\n CP: " + cp + ", en " + ciudad + "," + estado  );
    }
}
//RELACION IS-A-->ESTUDIANTE ES UNA PERSONA
class Estudiante extends Persona{
    //ESTO ES UN OBJETO, PERO SIN INSTANCIAR, LO VAMOS A INSTANCIAR EN EL CONSTRUCTOR
   private String numeroControl;
   private Direccion direccion;// HAS-A--> ESTUDIANTE TIENE UNA DIRECCION

    public Estudiante() {
        super();// la llamada super deber (preferentemente) la primer instruccion 
        this.numeroControl= "";
        //INSTANCIAR LA DIRECCION
        direccion = new Direccion();
    }


public Estudiante (String numeroControl, String nombre, int edad, Direccion direccion){
    super(nombre,edad);
    this.numeroControl = numeroControl;
    this.direccion = direccion;
}
    

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
   @Override
   public void imprimirDatos(){
       super.imprimirDatos();
       System.out.println("Numero de Control: " + numeroControl);
       direccion.imprimirDatos();
   }
}
class Persona{
    private String nombre;
    private int edad;

    public Persona() {// Constructor default
        this.nombre = "";
        this.edad = 0;
    }
    public Persona(String nombre, int edad){ //constructor con argumentos
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}