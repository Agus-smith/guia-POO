/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class act1_libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        libro l1 = new libro();
        libro l2 = new libro();
        l1.preguntas();
        l1.IBSN();
        System.out.println(l1);
        l2.preguntas();
        l2.IBSN();
        System.out.println(l2);
        System.out.println(l1);

    }

}
