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
public class main_operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        operacion op1 = new operacion();
        op1.crearOperacion();
        op1.sumar();
        System.out.println("la suma dio: " + op1.sumar());
        op1.restar();
        System.out.println("la resta dio: " + op1.restar());
        op1.multiplicar();
        System.out.println("la multiplicacion dio: " + op1.multiplicar());
        op1.diviidir();
        if (op1.resultado == 0) {
            System.out.println("ERROR una multiplicacion por 0 siempre da 0");
        }
        System.out.println("la division dio: " + op1.diviidir());
        if (op1.resultado == 0) {
            System.out.println("ERROR una division por 0 siempre da 0");
        }

    }

}
