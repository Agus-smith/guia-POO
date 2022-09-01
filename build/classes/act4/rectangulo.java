/*
 *  Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package act4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class rectangulo {

    Scanner leer = new Scanner(System.in);
    private double area;
    private double altura;
    private double base;
    private double perimetro;

    public rectangulo() {
    }

    public rectangulo(double area, double altura, double base, double perimetro) {
        this.area = area;
        this.altura = altura;
        this.base = base;
        this.perimetro = perimetro;
    }

    //set
    public void setArea(double area) {
        this.area = area;
    }

    public void setperimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    //get
    public double getarea() {
        return area;

    }

    public double getperimetro() {
        return perimetro;
    }

    public double getaltura() {
        return altura;
    }

    public double getbase() {
        return base;
    }

    // metodos
    public double ingreso() {
        System.out.println("ingrese la altura de su rectangulo");
        altura = leer.nextDouble();
        System.out.println("ingrese la base de su rectangulo");
        base = leer.nextDouble();
        return 0;
    }

    public double calcularArea() {
        area = altura * base;

        return 0;

    }

    public double calcularPerimetro() {
        perimetro = (altura + base) * 2;
        return 0;

    }
    
    public String dibujo(){
        
        for(int i=0; i<altura; i++){
            for(int j=0;j<base; j++){
                System.out.print(" * ");
            }
            System.out.println("");
            
        }
        
      return null;
  
    }

    @Override
    public String toString() {
        return "rectangulo{" +  ", altura= " + altura +", base=" + base + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
}
