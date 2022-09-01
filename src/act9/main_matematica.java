/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main_matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int eleccion;
        boolean salir = false;

        matematica m1 = new matematica();
       
        do {
            System.out.println("----------------------");
            System.out.println("CALCULADORA");
            System.out.println("1- Ingresar numeros");
            System.out.println("2- Numero mayor");
            System.out.println("3- Potencia del numero mayor");
            System.out.println("4- Raiz cuadrada del numero manor");
            System.out.println("5- Salir");
            System.out.println("----------------------");

            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    m1.llenar();
                    break;
                case 2:
                    m1.devolverMayor();
                    break;
                case 3:
                    m1.calcularPotencia();
                    break;

                case 4:
                    m1.calcularRaiz();
                    break;

                case 5:

                    salir = true;

            }

        } while (salir != true);
    }

}
