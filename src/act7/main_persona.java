/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act7;

/**
 *
 * @author Admin
 */
public class main_persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[4];
        int porcmenor = 0;
        int porcbien = 0;
        int porcmayor = 0;

        boolean[] vectorEdad = new boolean[4];
        int mayor = 0;
        int menor = 0;

        persona p1 = new persona();
        p1.crearPersona();
        p1.calcularIMC();
        p1.esMayorDeEdad();
        vector[0] = p1.getEstado();
        vectorEdad[0] = p1.getMayordeedad();

        System.out.println("--------------------------");

        persona p2 = new persona();
        p2.crearPersona();
        p2.calcularIMC();
        p2.esMayorDeEdad();
        vector[1] = p2.getEstado();
        vectorEdad[1] = p2.getMayordeedad();

        System.out.println("--------------------------");

        persona p3 = new persona();
        p3.crearPersona();
        p3.calcularIMC();
        p3.esMayorDeEdad();
        vector[2] = p3.getEstado();
        vectorEdad[2] = p3.getMayordeedad();

        System.out.println("--------------------------");

        persona p4 = new persona();
        p4.crearPersona();
        p4.calcularIMC();
        p4.esMayorDeEdad();
        vector[3] = p4.getEstado();
        vectorEdad[3] = p4.getMayordeedad();

        System.out.println("--------------------------");

        for (int i = 0; i < 4; i++) {

            switch (vector[i]) {
                case 1:
                    porcmenor = porcmenor + 25;
                    break;
                case 2:
                    porcbien = porcbien + 25;
                    break;
                case 3:
                    porcmayor = porcmayor + 25;
                    break;

            }

        }
        System.out.println(porcmenor + "% esta por debajo de su peso ideal");
        System.out.println(porcbien + "% esta en su peso ideal");
        System.out.println(porcmayor + "% esta por encima de su peso ideal");

        System.out.println("-------------------------------");
        for (int i = 0; i < 4; i++) {
            if (vectorEdad[i] == true) {

                mayor = mayor + 25;

            } else {
                menor = menor + 25;
            }
        }

        System.out.println(mayor + "% es mayor de edad");
        System.out.println(menor + "% es menor de edad");

        System.out.println("-------------------------------");
    }

}
