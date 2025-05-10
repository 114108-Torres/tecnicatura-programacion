import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del artículo:");
        double precio = scanner.nextInt();

        double precioFinal = precio * 1.21;

        System.out.println("El precio final con IVA 21% incluído es de: " + precioFinal);

    }
}