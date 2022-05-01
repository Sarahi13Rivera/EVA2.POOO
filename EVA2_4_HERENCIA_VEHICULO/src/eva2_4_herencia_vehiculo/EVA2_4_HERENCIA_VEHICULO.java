/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_herencia_vehiculo;

/**
 *
 * @author HP1000
 */
public class EVA2_4_HERENCIA_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculos v =  new Vehiculos("diesel", 4, 0.0, 0, 4, "Chevrolet", "impala", 1952 );
        v.imprimirDatos();
        Motocicletas m = new Motocicletas("x", "xx", "oo");
        m.imprimirDatos();
        Automovil a = new Automovil("impalal", "x", "xx");
        a.imprimirDatos();
        Camiones c = new Camiones();
    }
    
}
class Camiones extends Vehiculos{
private String capacidadCarga;
private int numEjes;

public Camiones(){
  this.capacidadCarga = "";
        this.numEjes = 0;  
}
    public Camiones(String capacidadCarga, int numEjes) {
        this.capacidadCarga = capacidadCarga;
        this.numEjes = numEjes;
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
    @Override
public void imprimirDatos(){
    System.out.println("Capacidad de carga" + capacidadCarga);
    System.out.println("Numero de ejes " + numEjes);
}

}
class Camionetas extends Vehiculos{
  private String tipoCarga;

    public Camionetas() {
        this.tipoCarga = "";
    }

    public Camionetas(String tipoCombustible, int numerollantas, double capacidadMotor, int cilindrosMotor, String marca, String modelo, int año) {
        super(tipoCombustible, numerollantas, capacidadMotor, cilindrosMotor, marca, modelo, año);
        this.tipoCarga = tipoCarga;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }
  @Override
  public void imprimirDatos(){
      System.out.println("Tipo de carga " + tipoCarga);
  }
}
class Automovil extends Vehiculos{
    private String tipoAuto;
    private String equipamiento;
    private String tipoTrasmision;

    public Automovil() {
        this.tipoAuto = "";
        this.equipamiento = "";
        this.tipoTrasmision = "";
    }

    public Automovil(String tipoAuto, String equipamiento, String tipoTrasmision, String tipoCombustible, int numerollantas, double capacidadMotor, int cilindrosMotor, String marca, String modelo, int año) {
        super(tipoCombustible, numerollantas, capacidadMotor, cilindrosMotor, marca, modelo, año);
        this.tipoAuto = tipoAuto;
        this.equipamiento = equipamiento;
        this.tipoTrasmision = tipoTrasmision;
    }

    Automovil(String impalal, String x, String xx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Tipo de Automovil" + tipoAuto);
        System.out.println("Equipamiento " + equipamiento);
        System.out.println("Tipo de Trasmision " + tipoTrasmision);
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getTipoTrasmision() {
        return tipoTrasmision;
    }

    public void setTipoTrasmision(String tipoTrasmision) {
        this.tipoTrasmision = tipoTrasmision;
    }
    
}
class Motocicletas extends Vehiculos{
    private String trasmision;
    private String tipoMoto;
    private String tipoSuspension;

     public Motocicletas() {
        this.trasmision = "";
        this.tipoMoto = "";
        this.tipoSuspension = "";
    }
    public Motocicletas(String trasmision, String tipoMoto, String tipoSuspension) {
        this.trasmision = trasmision;
        this.tipoMoto = tipoMoto;
        this.tipoSuspension = tipoSuspension;
    }

    public String getTrasmision() {
        return trasmision;
    }

    public void setTrasmision(String trasmision) {
        this.trasmision = trasmision;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public String getTipoSuspension() {
        return tipoSuspension;
    }

    public void setTipoSuspension(String tipoSuspension) {
        this.tipoSuspension = tipoSuspension;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Tipo de trasmision " + trasmision);
        System.out.println("Tipo de motor " + tipoMoto);
        System.out.println("Tipo de suspension" + tipoSuspension);
    }
}
class Vehiculos{
    private String tipoCombustible;
    private int numerollantas;
    private double capacidadMotor;
    private int cilindrosMotor;
    private String marca;
    private String modelo;
    private int año;

    public Vehiculos() {
        this.tipoCombustible = "";
        this.numerollantas = 0;
        this.capacidadMotor = 0.0;
        this.cilindrosMotor = 0;
        this.marca = "";
        this.modelo = "";
        this.año = 0;
    }

    public Vehiculos(String tipoCombustible, int numerollantas, double capacidadMotor, int cilindrosMotor, String marca, String modelo, int año) {
        this.tipoCombustible = tipoCombustible;
        this.numerollantas = numerollantas;
        this.capacidadMotor = capacidadMotor;
        this.cilindrosMotor = cilindrosMotor;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    Vehiculos(String diesel, int i, double d, int i0, int i1, String chevrolet, String impala, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumerollantas() {
        return numerollantas;
    }

    public void setNumerollantas(int numerollantas) {
        this.numerollantas = numerollantas;
    }

    public double getCapacidadMotor() {
        return capacidadMotor;
    }

    public void setCapacidadMotor(double capacidadMotor) {
        this.capacidadMotor = capacidadMotor;
    }

    public int getCilindrosMotor() {
        return cilindrosMotor;
    }

    public void setCilindrosMotor(int cilindrosMotor) {
        this.cilindrosMotor = cilindrosMotor;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public void imprimirDatos(){
        System.out.println("Tipo de combustible " + tipoCombustible);
        System.out.println("Numero de llantas " + numerollantas);
        System.out.println("Capacidad del motor " + capacidadMotor);
        System.out.println("Cilindros del motor " + cilindrosMotor);
        System.out.println("Marca " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Año " + año);
    }
    
}