import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {

        System.out.println("El numero introducido es par");
            
        } else {
            System.out.println("El numero introducido es impar");
            
        }

        sc.close();
    }
    
}
