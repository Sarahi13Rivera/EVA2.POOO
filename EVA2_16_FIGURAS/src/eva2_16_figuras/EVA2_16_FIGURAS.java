/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_figuras;

/**
 *
 * @author HP1000
 */
public class EVA2_16_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Circulo circulo = new Circulo (20.0);
        Triangulo triangulo = new Triangulo (10.0,20.0);
        Rectangulo rectangulo = new Rectangulo (25.0, 10.0);
        
        Figura prueba =triangulo; // IS-A
        
        
        imprimirArea(triangulo);//llamada a funcion
        imprimirArea(circulo);
        imprimirArea (rectangulo);
        
        claseObject(triangulo);
    }
    
    public static void imprimirArea(Figura f){
        System.out.println("Area= " + f.calcularArea());
        //restaurar el objeto;
        //convertir un tipo de dato en otro--> Casting 
        if (f instanceof Triangulo){
            System.out.println(f.getClass());
        Triangulo triangulo = (Triangulo) f; //convirtiendo una figura en un triangulo
    }
    }
    
    public static void claseObject(Object o){
        System.out.println(o.getClass());
    }
    }

 class Figura{
        public double calcularArea(){
            return -1;
        }
    }
    
     class Circulo extends Figura{
        private double radio;

        public Circulo() {
        }

        public Circulo(double radio) {
            this.radio = radio;
        }

        public double getRadio() {
            return radio;
        }

        public void setRadio(double radio) {
            this.radio = radio;
        }
        @Override
        public double calcularArea(){
             return (Math.PI* Math.pow(radio, radio));
       
    }
    }
    
    
     class Triangulo extends Figura{
        private double base;
        private double altura;

        public Triangulo() {
        }

        public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
        @Override
         public double calcularArea(){
             return (base*altura)/2;
         }
        
    }
    
     class Rectangulo extends Figura{
        private double base;
        private double altura;

        public Rectangulo() {
        }

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
        
        @Override
        public double calcularArea(){
             return (base * altura);
        
    }
     }