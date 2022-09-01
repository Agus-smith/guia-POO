/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main_nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        cafetera c1 = new cafetera();
        boolean salir = true;

        do {
            
              System.out.println("------------------------");
            
            System.out.println("MENU");
            System.out.println("1- Llenar cafetera");
            System.out.println("2- Servir taza");
            System.out.println("3- vaciar cafetera");
            System.out.println("4- Agregar cafe");
            System.out.println("5- Salir");
            
            System.out.println("------------------------");
            
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    c1.llenarCafetera();
                    break;
                case 2:
                    c1.servirTaza();
                    break;
                case 3:
                    c1.vaciarCafetera();
                    break;
                case 4:
                    c1.agregarCafe();
                    break;
                case 5:
                    salir = false;

            }

        } while (salir = true);
    }

}
