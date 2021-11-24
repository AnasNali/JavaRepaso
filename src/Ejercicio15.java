import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {


            int numero;

            Scanner sc = new Scanner(System.in);
        
            do {

                System.out.println("Introduce un numero mayor o igual a cero: ");
                 numero = sc.nextInt();
        
        
            } while (numero < 0);

            System.out.println("Has introducido: " + numero);

            sc.close();

     

    }
}
