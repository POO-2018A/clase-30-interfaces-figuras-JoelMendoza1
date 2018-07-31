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
public class Circulo implements Figura {
    double diametro;
    public static double Pi=3.1416;

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Perimetro del Circulo");
        return 2*Pi*diametro;
    }

    @Override
    public double calcularArea() {
        System.out.println("Area del Circulo");
        return Pi*diametro*diametro;
    }
    
}
