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
public class cadena {

    Scanner leer = new Scanner(System.in);

    private String frase;
    private int longitud;

    public cadena() {
    }

    public cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    //SET
    public void setfrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //GET
    public String getfrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    //METODOS
    public String llenar() {
        System.out.println("ingrese una frase");
        this.frase = leer.nextLine();

        longitud = frase.length();
        System.out.println("la frase contine:" + longitud + " caracteres");

        return null;
    }
    
 public String unirFrases() {

        System.out.println("ingrese una nueva frase para unir con la anterior: ");
        String frase2 = leer.nextLine();
        System.out.println("el resultado es: " + frase + " " + frase2);

        return null;

    }
 
    public int mostrarVocales() {
        frase = frase.toUpperCase();
        int cantVocales = 0;
        for (int i = 0; i < longitud; i++) {
            // System.out.println(frase.substring(i, i+1));
            switch (frase.substring(i, i + 1)) {
                case "A":
                    cantVocales = cantVocales + 1;
                    break;
                case "E":
                    cantVocales = cantVocales + 1;
                    break;
                case "I":
                    cantVocales = cantVocales + 1;
                    break;
                case "O":
                    cantVocales = cantVocales + 1;
                    break;
                case "U":
                    cantVocales = cantVocales + 1;
                    break;
            }

        }
        System.out.println("en la frase se encuentran " + cantVocales + " vocales");
        return 0;

    }

    public String invertirFrase() {

        String[] fraseInvertida = new String[longitud];
        int j = longitud;
        for (int i = 0; i < longitud; i++) {

            fraseInvertida[i] = frase.substring(j - 1, j);

            j = j - 1;
        }
        for (int i = 0; i < longitud; i++) {

            System.out.print(fraseInvertida[i]);
        }
        System.out.println("");
        return null;

    }

    public int vecesRepetido() {

        System.out.println("ingrese una letra para ver cuantas veces se repite: ");
        String letra = leer.nextLine();
        int repeticiones = 0;

        for (int i = 0; i < longitud; i++) {

            String l1 = frase.substring(i, i + 1);

            if (l1.equals(letra)) {

                repeticiones++;
            }

        }
        System.out.println(repeticiones);

        return repeticiones;

    }

    public int compararLongitud() {
        System.out.println("ingrese otra frase para comparar su longitud con la anterior: ");
        String frase2 = leer.nextLine();
        int longitud2 = frase2.length();
        if (longitud > longitud2) {

            System.out.println("( " + frase + " )" + " es mayor a : " + "(" + frase2 + ")" + " por " + (longitud - longitud2) + " caracteres");

        } else {
            System.out.println("( " + frase + " )" + " es menor a : " + "(" + frase2 + ")" + " por " + (longitud2 - longitud) + " caracteres");
        }

        return 0;

    }

   

    public String reemplazar() {
        System.out.println("ingrese una caracter para reemplazar las (a): ");
        String letra = leer.nextLine();
        frase = frase.toLowerCase();
        String[] vectorfrase = new String[longitud];
        for (int i = 0; i < longitud; i++) {

            // System.out.println(frase.substring(i, i+1));
            vectorfrase[i] = frase.substring(i, i + 1);

            if (vectorfrase[i].equals("a")) {
                vectorfrase[i] = letra;
            }
        }
        for (int i = 0; i < longitud; i++) {

            System.out.print(vectorfrase[i]);

        }

        return null;

    }

    public String contiene() {

        boolean esta = false;

        System.out.println("ingrese una letra para ver si se encuentra en la frase: ");
        String letra = leer.nextLine();

        for (int i = 0; i < longitud; i++) {

            if (frase.substring(i, i + 1).equals(letra)) {
                esta = true;
            }

        }
        System.out.println("la letra ingresada se encuentra en la frase: " + esta);
        return null;

    }
}
