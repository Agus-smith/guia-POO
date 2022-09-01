/*
 *Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package act5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main_Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        cuenta c1 = new cuenta();
        boolean salir = true;
        int eleccion;
        c1.datos();

        do {
            System.out.println("----------------------------");
            System.out.println("Que tramite desea realizar:");
            System.out.println("1: ingresar dinero");
            System.out.println("2: retirar dinero");
            System.out.println("3: retiro rapido");
            System.out.println("4: consultarsaldo actual");
            System.out.println("5: consultar datos de la cuenta");
            System.out.println("6: salir");
            System.out.println("----------------------------");
            eleccion = leer.nextInt();
            switch (eleccion) {

                case 1:
                    c1.ingresar();
                    break;
                case 2:
                    c1.retirar();
                    break;
                case 3:
                    c1.extraccionRapida();
                    break;
                case 4:
                    c1.consultarSaldo();
                    break;
                case 5:
                    c1.consultarDatos();
                    break;
                default:
                    salir = false;

            }
            System.out.println("");
        } while (salir = true);

    }

}
