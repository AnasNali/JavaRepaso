import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero>=0) {
            
            System.out.println("El numero introducido contiene " + String.valueOf(numero).length() + " carácteres");

        }else{
            System.out.println("El numero introducido es negativo, debe ser un numero positivo");
        }

        sc.close();
    }
}
