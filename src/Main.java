import java.util.Scanner;

/* 8. Ingresar 10 números por teclado, informar su suma y promedio.
 */

public class Main {
    public static void main(String[] args) {
    int numTotales = 10;
    int total = 0;
    double promedio;

    Scanner sc = new Scanner(System.in);

    for (int i = 1; i <= numTotales; i++) {
    System.out.println("Ingrese un numero: ");
    int num = sc.nextInt();
    total += num;
    }
    promedio =  total / numTotales;

    System.out.println("El promedio es: " + promedio);
    System.out.println("El total es: " + total);
}
}