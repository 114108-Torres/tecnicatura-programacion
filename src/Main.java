import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int CantidadArticulos = 3;
        Scanner scanner = new Scanner(System.in);
        double subTotal = 0;

        for (int i = 1  ; i <= CantidadArticulos; i++) {
            System.out.println("Ingrese el precio del articulo" + i +  " $ ");
            double precio = scanner.nextDouble();

            System.out.println("Ingrese la cantidad del articulo" + i );
            int cantidad = scanner.nextInt();

            subTotal += precio * cantidad;
        }

        double precioFinal = subTotal * 1.21;
        double total = Math.round(precioFinal * 100.0) / 100.0;

        System.out.println("El precio final con IVA 21% de la factura es de $" + total );

    }
}