import  javax.swing.JOptionPane;

public class Ejercicio8 {
    
    public static void main(String[] args) {
      
        String texto = JOptionPane.showInputDialog("Introduce el caracter que quieras transformar");
        char caracter = texto.charAt(0);
        int codigo = (int)caracter;
        System.out.println(codigo);

    }
}
