/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        persona p1 = new persona();
        System.out.println("ingrese su apellido");
        p1.apellido = leer.next();
        System.out.println("ingrese su nombre");
        p1.nombre = leer.next();
        System.out.println("ingrese su fecha de nacimiento");
        p1.fechaDeNacimiento = leer.next();
        System.out.println(p1.apellido+" "+p1.nombre+" "+  p1.fechaDeNacimiento);
    }

}
