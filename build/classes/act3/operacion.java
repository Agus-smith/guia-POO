/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class operacion {

    Scanner leer = new Scanner(System.in);
    private int numero1;
    private int numero2;
    int resultado;
    public int getresultado;

    public operacion() {
    }

    public operacion(int numero1, int numero2, int resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //set
    public void setnumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setnumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void setresultado(int resultado) {
        this.resultado = resultado;
    }

    //get
    public int getnumero1() {

        return numero1;
    }

    public int getnumero2() {

        return numero2;
    }

    public int getresultado() {
        return resultado;
    }

    //funiones
    public int crearOperacion() {

        System.out.println("ingrese un numero");
        numero1 = leer.nextInt();
        System.out.println("ingrese otro numero");
        numero2 = leer.nextInt();
        return numero1;
    }

    public int sumar() {
        resultado = numero1 + numero2;
        return (int) resultado;
    }

    public int restar() {
        resultado = numero1 - numero2;
        return resultado;
    }

    public int multiplicar() {
        if (numero1 != 0 || numero2 != 0) {
            resultado = numero1 * numero2;

        }
        return resultado;
    }

    public int diviidir() {
        if (numero1 != 0 || numero2 != 0) {
            resultado = numero1 / numero2;

        }
        return resultado;
    }

    @Override
    public String toString() {
        return "operacion{" + ", numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }

}
