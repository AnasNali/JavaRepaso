import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de ventas");
        int numVentas = sc.nextInt();


        int sumaVentas = 0;
        for (int i = 0; i < numVentas; i++) {
            System.out.println("Introduce el numero de venta" + (i+1));
            int venta = sc.nextInt();

            sumaVentas = sumaVentas + venta;

        }
        
        System.out.println("El total de ventas ha sido de " + sumaVentas);

        sc.close();
    }
    
}
