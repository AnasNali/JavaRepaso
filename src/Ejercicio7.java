import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {

        String valorAscii = JOptionPane.showInputDialog("Introduce el numero que quieres convertir en ASCII");
        int ascii = Integer.parseInt(valorAscii);
        char conversion = (char)ascii;
        System.out.println(conversion);
        
    }
    
}
