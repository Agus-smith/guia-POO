/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act9;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class matematica {

    Scanner leer = new Scanner(System.in);

    private double num1;
    private double num2;

    public matematica() {
    }

    public matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //SET
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //GET
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    //METODOS
    public double llenar() {
        System.out.println("ingrese un numero: ");
        num1 = leer.nextDouble();
        System.out.println("ingrese otro numero: ");
        num2 = leer.nextDouble();
        return 0;
    }

    public double devolverMayor() {

        System.out.println("el numero " + "(" + (Math.max(num1, num2)) + ")" + "es mayor que el otro");

        return 0;

    }

    public double calcularPotencia() {
        double mayor;
        mayor = Math.max(num1, num2);
        mayor = Math.round(mayor);
        double menor = Math.min(num1, num2);
        menor = Math.round(menor);  
        System.out.println("la potencia de: " + mayor + " es " +( Math.pow(mayor,menor)));
        return 0;

    }

    public double calcularRaiz() {
        double menor;
        menor = Math.min(num1, num2);
        menor = Math.round(menor);
        System.out.println("la raiz cuadrada de: " + menor + " es " + Math.sqrt(menor));
        return 0;

    }

}
