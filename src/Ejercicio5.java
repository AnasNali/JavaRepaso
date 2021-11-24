import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {
        

        String radioString = JOptionPane.showInputDialog("Introduce el radio del circulo");
        double radio = Double.parseDouble(radioString);
        double radioAlCuadrado = Math.pow(radio, 2);

        System.out.println("El área del circulo es de: " + (radioAlCuadrado * Math.PI));


    }
    
}
