/*

• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package act6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class cafetera {

    Scanner leer = new Scanner(System.in);

    private int capacidadMaxima = 10000;
    private int cantidadActual;

    public cafetera() {
    }

    public cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    //SET
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //GET
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    //METODOS
    public int llenarCafetera() {
        cantidadActual = capacidadMaxima;
        return 0;

    }

    public int servirTaza() {
        System.out.println("De cuanto es la taza que hay que llenar?");
        int taza = leer.nextInt();
        if (cantidadActual >= taza) {

            cantidadActual = cantidadActual - taza;

        } else {
            System.out.println("no hay suficiente cafe, su taza se lleno con la cantidad de: " + cantidadActual);
        }
        return 0;
    }

    public int vaciarCafetera() {
        cantidadActual = 0;
        return 0;
    }

    public int agregarCafe() {
        System.out.println("ingrese la cantidad de cafe a ingresar: ");
        int agregar = leer.nextInt();
        cantidadActual = cantidadActual + agregar;
        if (capacidadMaxima <= cantidadActual) {
            System.out.println("es imposible agregar mas cafe a la cafetera, sobraron: " + (capacidadMaxima - cantidadActual));
        }
        return 0;
    }
}
