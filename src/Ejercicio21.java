public class Ejercicio21 {
    public static void main(String[] args) {
        int num = 0;
        String numerosPrimos = "";


        for (int i = 1; i <= 100; i++) {

            int contador = 0;

            for (num = i; num >= 1; num--) {
                // condition for nonprime number
                if (i % num == 0) {
                    contador = contador + 1;
                }
            }

            if (contador == 2) {

                numerosPrimos = numerosPrimos + i + " ";
            }

        }
        System.out.println("Los numeros primos que hay entre 1 y 100 son: ");
        System.out.println(numerosPrimos);

    }
}
