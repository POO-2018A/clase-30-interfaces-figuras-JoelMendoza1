/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ESFOT
 */
public class Cuadrado implements Figura {
   private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
   
    
   
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    

    @Override
    public double calcularArea() {
        System.out.println("Area del cuadrado");
       return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Perimetro del cuadrado");
        return lado*4;//To change body of generated methods, choose Tools | Templates.
    }
   
}
