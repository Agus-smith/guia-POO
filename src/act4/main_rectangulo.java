/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act4;

/**
 *
 * @author Admin
 */
public class main_rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        rectangulo rec1 = new rectangulo();
        rec1.ingreso();
        rec1.calcularArea();
        rec1.calcularPerimetro();
        System.out.println(rec1);
         System.out.println("");
        System.out.println("en dibujo se veria como: ");
        rec1.dibujo();
    }

}
