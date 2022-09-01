/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class circunferencia {

    Scanner leer = new Scanner(System.in);
    private int radio;
    private double area;
    private double perimetro;

    public circunferencia() {
    }

    public circunferencia(int radio, double perimetro, double area) {
        this.radio = radio;
        this.perimetro = perimetro;
        this.area = area;
    }

    public void setradio(int radio) {
        this.radio = radio;
    }

    public void setarea(double area) {
        this.area = area;

    }

    public void setperimetro() {
        this.perimetro = perimetro;

    }

    public int getradio() {

        return radio;
    }

    public double getarea() {
        return area;
    }
    public double getperimetro(){
        return perimetro;
    }

    public int radio() {
        System.out.println("ingrese el radio");
        radio = leer.nextInt();
        return radio;
    }

    public double area() {

        area = Math.PI * radio * radio;
        return area;

    }

    public double perimetro() {
        perimetro= 2* Math.PI*radio;
        return perimetro;
    }

    @Override
    public String toString() {
        return "circunferencia{" +  ", radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
}
