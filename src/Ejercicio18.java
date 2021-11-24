import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        System.out.println("Introduce el valor minimo");
        Scanner sc = new Scanner(System.in);
        int valorMin = sc.nextInt();
       

        System.out.println("Introduce el valor maximo");
        int valorMax = sc.nextInt();


        for (int i = 0; i < 100; i++) {
            System.out.println(Math.random() * (valorMax - valorMin ));
        }
        
        sc.close();
    }
    
}
