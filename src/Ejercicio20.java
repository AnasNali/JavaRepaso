import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        
        System.out.println("Introduce un numero");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
          // condition for nonprime number
          if (num % i == 0) {
            flag = true;
            break;
          }
        }
    
        if (!flag)
          System.out.println(num + " es primo");
        else
          System.out.println(num + " es par.");

        sc.close();
    }
}