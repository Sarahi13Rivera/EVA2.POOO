/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_herencia_interfaces;

/**
 *
 * @author HP1000
 */
public class EVA2_8_HERENCIA_INTERFACES {
    int A=10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba p = new Prueba();
        p.metodoA();
        p.metodoB();
        //System.out.println(A);
    }
    
}
class Prueba implements B{

    @Override
    public void metodoB() {
        
    }

    @Override
    public void metodoA() {
        
    }
    
}
interface A{
    public void metodoA();
        }
interface B extends A{
    public void metodoB();
        }