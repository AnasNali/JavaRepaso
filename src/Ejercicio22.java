
public class Ejercicio22 {
    public static void main(String[] args) {
        String frase = "La lluvia en Sevilla es una maravilla";

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
            
        }
        
        System.out.println("La frase contiene " + contador + " vocales");
    }
}
