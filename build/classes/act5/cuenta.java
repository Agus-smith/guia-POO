/*
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package act5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class cuenta {

    Scanner leer = new Scanner(System.in);

    private int DNI;
    private int numeroCuenta;
    private int saldoActual;
    private int interes;

    public cuenta() {
    }

    public cuenta(int DNI, int numeroCuenta, int saldoActual, int interes) {
        this.DNI = DNI;
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    //set
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    //get
    public int getDNI() {
        return DNI;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public int getInteres() {
        return interes;
    }
    //metodos

    public int datos() {
        System.out.println("ingrese su numero de cuenta");
        numeroCuenta = leer.nextInt();
        System.out.println("ingrese su DNI");
        DNI = leer.nextInt();
        System.out.println("ingrese su saldo actual");
        saldoActual = leer.nextInt();
        return 0;
    }

    public int ingresar() {
        int ingreso;
        String sn;
        System.out.println("desea ingresar plata? S/N");
        sn = leer.next();
        sn = sn.toUpperCase();
        if (sn.equals("S")) {
            System.out.println("Cuanto es el saldo a ingresar?");
            ingreso = leer.nextInt();
            saldoActual = saldoActual + ingreso;
        }

        return 0;
    }

    public int retirar() {
        int retiro;
        String sn;
        System.out.println("desea retirar plata? S/N");
        sn = leer.next();
        sn = sn.toUpperCase();
        if (sn.equals("S")) {
            System.out.println("Cuanto es el saldo a retirar?");
            retiro = leer.nextInt();
            if (saldoActual >= retiro) {
                saldoActual = saldoActual - retiro;

            } else {
                if (saldoActual < retiro) {

                    System.out.println("su saldo es insufisiente, solo ha podido retirar:  " + saldoActual);
                    saldoActual = 0;
                }
            }
        }
        return 0;
    }

    public int extraccionRapida() {
        int retiro;
        String sn;
        System.out.println("desea sacar dinero rapidamente? S/N");
        sn = leer.next();
        sn = sn.toUpperCase();
        if (sn.endsWith("S")) {
            System.out.println("Cuanto es el saldo a retirar?");
            retiro = leer.nextInt();
            if (saldoActual * 20 / 100 >= retiro) {
                saldoActual = saldoActual - retiro;

            } else {
                System.out.println("el retiro rapido no puede superar el 20% de su saldo actual");
            }

        }

        return 0;
    }

    public int consultarSaldo() {
        System.out.println("su saldo actual es de: " + saldoActual);
        return 0;

    }

    public int consultarDatos() {
      
        
        System.out.println("cuenta: ");
        System.out.println(" Numero de cuenta: " + numeroCuenta + " DNI: " + DNI +", saldo actual: " + saldoActual );

        return 0;
    }
}
