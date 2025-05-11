import java.util.Scanner;

/* 9. Ingresar un número n y a continuación n números positivos.
Informar la cantidad de mayores a 5 que se hayan ingresado.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números desea ingresar?: ");
        int cantidadNumeros = sc.nextInt();

        int mayoresA5 = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese un número positivo (" + i + " de " + cantidadNumeros + "): ");
            int numero = sc.nextInt();

            if (numero > 0 && numero > 5) {
                mayoresA5++;
            } else if (numero <= 0) {
                System.out.println("⚠️ El número debe ser positivo. No se contabiliza.");
                i--; // Repetir esta vuelta
            }
        }

        System.out.println("Se ingresaron " + mayoresA5 + " números mayores a 5.");
    }
}