/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main_cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        cadena c1 = new cadena();

        boolean salir = false;

        do {
            System.out.println("---------------------------");
            System.out.println("MENU");
            System.out.println("1- Ingresar frase(es necesario que entre a este antes que a otros)");
            System.out.println("2- Mostrar cuantas vocales tiene");
            System.out.println("3- Invertir la frase");
            System.out.println("4- Buscar cuantas veces se repite una letra");
            System.out.println("5- Comparar longitud con otra frase");
            System.out.println("6- Agregar una frase");
            System.out.println("7- Reemplazar  una las (a) por otra letra");
            System.out.println("8- Buscar si contiene tal letra ");
            System.out.println("9- Salir");
            System.out.println("---------------------------");

            int eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    c1.llenar();
                    break;

                case 2:
                    c1.mostrarVocales();
                    break;

                case 3:
                    c1.invertirFrase();
                    break;

                case 4:
                    c1.vecesRepetido();
                    break;

                case 5:
                    c1.compararLongitud();
                    break;

                case 6:
                    c1.unirFrases();
                    break;

                case 7:
                    c1.reemplazar();
                    break;

                case 8:
                    c1.contiene();
                    break;

                case 9:
                    salir = true;
                    break;
            }

        } while (salir != true);

    }

}
