import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        String password = "hola";

        String clave;

        final int intentos = 3;

        boolean acierto = false;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < intentos && !acierto; i++) {

            System.out.println("Introduce la contraseña: ");
            clave = sc.nextLine();

            
            if (clave.equals(password)) {    
                System.out.println("Bienvenido al sistema.");
                acierto = true;
          }
            
        }

        sc.close();

  
    }
}
