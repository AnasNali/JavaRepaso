import java.util.Scanner;
public class Ejercicio25 {

    public static void main(String[] args) {
        
        System.out.println("Introduce el valor de x: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println("Introduce el valor de y: ");

        int y = sc.nextInt();

        System.out.println("Selecciona entre los siguientes operadores: ");
        System.out.println("+: suma los dos operandos.");
        System.out.println("-: resta los operandos.");
        System.out.println("*: multiplica los operandos.");
        System.out.println("/: divide los operandos, este debe dar un resultado con decimales (double)");
        System.out.println("^:  1º operando como base y 2º como exponente.");
        System.out.println("%:  módulo, resto de la división entre operando1 y operando2.");


        String signo = sc.next();


        double suma = x+y; 
        double resta = x-y;
        double multiplicacion = x*y;
        double division = x/y;
        double exponente = Math.pow(x, y);
        double resto = x%y;


        switch (signo) {
            case "+":
                System.out.println("La suma es: " + suma);
                break;

            case "-":
                System.out.println("La resta es: " + resta);
            break;
            

            case "*":
            System.out.println("La multiplicacion da: " + multiplicacion);
                break;

            case "/":
            System.out.println("La division da: " + division);
                break;

            case "^":
            System.out.println("El resultado es de: " + exponente);
                break;

            case "%":
            System.out.println("El resto de la division es de: " + resto );
                break;

            default:
            System.out.println("Error");
                break;
        }





        if (signo == "^") {
        }

        if (signo == "%") {
            System.out.println("El resto de la division es de: " + resto );
            
        }

        sc.close();

    }
    
}
