import  javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Ejercicio9 {

    //Determinamos el formato del resultado para obtener solo dos decimales
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {

        String precio = JOptionPane.showInputDialog("Introduce el precio base del producto");


        //Transoformar el dato introducido en un Double para poder utilizar decimales
        double valor = Double.parseDouble(precio);

        //Valor del IVA
        Double IVA = 0.21;

        //Aplicamos el IVA al valor
        Double precioFinal = (valor + (valor * IVA));

        //Sacamos por pantalla el resultado con dos decimales
        System.out.println("El precio total con IVA es de: " + df2.format(precioFinal));
        
    }
}
