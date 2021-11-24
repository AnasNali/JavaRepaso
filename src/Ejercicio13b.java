import  javax.swing.JOptionPane;

public class Ejercicio13b {
    public static void main(String[] args) {
        //Obtenemos el numero de ventas totales y lo transformo en int
        String numeroVentaString = JOptionPane.showInputDialog("Introduce el numero de ventas totales");
        int numVentas = Integer.parseInt(numeroVentaString);

        int sumaVentas = 0;

        for (int i = 0; i < numVentas; i++) {
            String precioVentaString = JOptionPane.showInputDialog("Introduce el precio de la venta " + (i+1));
            int precioVenta = Integer.parseInt(precioVentaString);

            sumaVentas = sumaVentas + precioVenta;
        }

        JOptionPane.showMessageDialog(null, "El precio total de venta es de " + sumaVentas);

    }
    
}
