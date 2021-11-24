import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor a");
        double a = sc.nextDouble();

        System.out.println("Introduce el valor b");
        double b = sc.nextDouble();

        System.out.println("Introduce el valor c");
        double c = sc.nextDouble();

        System.out.println("SOLUCIÓN");
        System.out.println("--------------------");


        double ecuacionPositiva = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
        System.out.println("El resultado uno es: " + ecuacionPositiva);

        
        double ecuacionNegativa = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
        System.out.println("El resultado dos es: " + ecuacionNegativa);


        sc.close();
    }
}
