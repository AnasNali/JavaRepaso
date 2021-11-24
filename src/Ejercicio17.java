import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String dia;

        System.out.println("Introduce el dia de la semana");
        dia = sc.nextLine();

        switch (dia) {

            case "lunes":
            System.out.println("Es laboral");                
                break;
        
            case "Martes":
            System.out.println("Es laboral");                
                break;

            case "Miercoles":
            System.out.println("Es laboral");  
            break;

            case "Jueves":
            System.out.println("Es laboral");
                break;


            case "Viernes":
            System.out.println("Es laboral");                
                break;
        
            case "Sabado":
            System.out.println("Es festivo");  
                break;

            case "Domingo":
            System.out.println("Es festivo");  
                break;

            default:
            System.out.println("¿Que dia de la semana es ese?");
                break;
        }

        sc.close();

    }
}
