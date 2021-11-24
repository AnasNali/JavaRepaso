import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int aux = 0;

      

        while (num != -1) {

            aux++;
            num = sc.nextInt();

            
        }

            System.out.println("Se ha introducido un total de " + aux + " intentos");

            sc.close();


    }
}
