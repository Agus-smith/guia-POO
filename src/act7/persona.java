/*

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package act7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class persona {

    Scanner leer = new Scanner(System.in);

    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private int estado;
    private boolean mayordeedad;

    public persona() {
    }

    public persona(String nombre, int edad, String sexo, double peso, double altura , int estado,boolean mayordeedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.estado=estado;
   this.mayordeedad=mayordeedad;
    }

    //SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setMayordeedad(boolean mayordeedad) {
        this.mayordeedad = mayordeedad;
    }
    
    
    

    //GET
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getEstado() {
        return estado;
    }

    public boolean getMayordeedad() {
        return mayordeedad;
    }

 
    

    //METODOS
    public String crearPersona() {
        System.out.println("ingrese su nombre");
        nombre = leer.nextLine();

        System.out.println("ingrese su sexo");

        boolean verdadero = false;
        int opc;
        do {

            System.out.println("1- hombre");
            System.out.println("2- mujer");
            System.out.println("3- otro");
            opc = leer.nextInt();

            switch (opc) {
                case 1:

                    sexo = "H";

                    break;

                case 2:
                    sexo = "M";

                    break;

                case 3:
                    sexo = "O";

                    break;

                default:
                    System.out.println("No se encuentra esa letra entre las opciones");

            }

        } while (opc != 1 && opc != 2 && opc != 3);

        System.out.println("ingrese su edad");
        edad = leer.nextInt();

        System.out.println("ingrese su peso");
        peso = leer.nextDouble();

        System.out.println("ingrese su altura");
        altura = leer.nextDouble();
        return null;
    }

    public int calcularIMC() {
        double pesoIdeal = peso / (altura * altura);

        if (pesoIdeal < 20) {
            System.out.println("-1 esta por debajo de su peso ideal");
            estado = 1;

        } else {
            if (pesoIdeal >= 20 && pesoIdeal <= 25) {
                System.out.println("1  su peso es el ideal");
                estado = 2;

            } else {
                if (pesoIdeal > 25) {
                    System.out.println("+1 esta por encima de su peso ideal");
                    estado = 3;

                }
            }
        }

        return 0;
    }

    public boolean esMayorDeEdad() {

        if (edad >= 18) {

            mayordeedad = true;
        }
        System.out.println("es mayor de edad: " + mayordeedad);
        return false;
    }
}
