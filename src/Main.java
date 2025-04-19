import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el precio del producto: $");
        Scanner sc = new Scanner(System.in);
        double precio = sc.nextDouble();
        double precioTotal = precio * 1.21;
        System.out.println("El precio final del producto con IVA 21 %: $  " + precioTotal);
    }
}