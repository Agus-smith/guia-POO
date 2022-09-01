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
public class libro {

    Scanner leer = new Scanner(System.in);

    private String titulo;
    private String autor;
    private int NumPag;
    private double IBSN;
    private int IBSN1;
    private int IBSN2;
    private int IBSN3;
    private int IBSN4;
    private int IBSN5;

    public libro() {

    }

    public libro(String ISBN, String titulo, String autor, int NumPag, int IBSN1, int IBSN2, int IBSN3, int IBSN4, int IBSN5) {

        this.titulo = titulo;
        this.autor = autor;
        this.NumPag = NumPag;
        this.IBSN1 = IBSN1;
        this.IBSN2 = IBSN2;
        this.IBSN3 = IBSN3;
        this.IBSN4 = IBSN4;
        this.IBSN5 = IBSN5;
    }

    
    //set
    
    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setautor(String autor) {
        this.autor = autor;
    }

    public void setNumPag(int NumPag) {
        this.NumPag = NumPag;
    }

    public void setIBSN1(int IBSN1) {
        this.IBSN1 = IBSN1;
    }

    public void setIBSN2(int IBSN2) {
        this.IBSN2 = IBSN2;
    }

    public void setIBSN3(int IBSN3) {
        this.IBSN3 = IBSN3;
    }

    public void setIBSN4(int IBSN4) {
        this.IBSN4 = IBSN4;
    }

    public void setIBSN5(int IBSN5) {
        this.IBSN5 = IBSN5;
    }

    
    //get
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPag() {
        return NumPag;
    }

    public int getIBSN1() {
        return IBSN1;
    }

    public int getIBSN2() {
        return IBSN2;
    }

    public int getIBSN3() {
        return IBSN3;
    }

    public int getIBSN4() {
        return IBSN4;
    }

    public int getIBSN5() {
        return IBSN5;
    }
    
    //funciones

    public int IBSN() {
        this.IBSN1 = (int) (Math.random() * 1000 + 100);
        this.IBSN2 = (int) (Math.random() * 100 + 10);
        this.IBSN3 = (int) (Math.random() * 100000 + 10000);
        this.IBSN4 = (int) (Math.random() * 100 + 10);
        this.IBSN5 = (int) (Math.random() * 10 + 1);
        return 0;

    }

    public String preguntas() {
        System.out.println("ingrese el titulo del libro");
       titulo = leer.nextLine();
       System.out.println("ingrese el autor del libro");
        autor = leer.nextLine();
        System.out.println("ingrese el numero de paginas  del libro");
        NumPag = leer.nextInt();
        
        return null;
    }

    @Override
    public String toString() {
        return "libro{" + "titulo=" + titulo + ", autor=" + autor + ", NumPag=" + NumPag + ", IBSN=" + "" + IBSN1 + "-" + IBSN2 + "-" + IBSN3 + "-" + IBSN4 + "-" + IBSN5 + '}';
    }

}
