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
public class Triangulo implements Figura {
    double altura;
    double base;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

   
    
  

    @Override
    public double calcularArea() {
        System.out.println("Perimetro del Triangulo");
       return (base*altura)/2;
    }
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Area del Triangulo");
        double resultado= base +2 *Math.pow(Math.pow(base/2, 2)+Math.pow(altura, 2),0.5);
        return resultado;
    }
    
    
}
