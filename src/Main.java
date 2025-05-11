import java.util.Scanner;

/* 7. Una empresa de alquiler de autos cobra $300 por día si no se superan los 200 km de uso diario.
 Por cada km extra hasta los 1000 km cobra $5 adicionales, y a partir de los 1000 cobra $10 adicionales.
 Hacer un programa que solicite la cantidad de km realizados por un cliente e indique el importe que se le debe cobrar.
 */

public class Main {
    public static void main(String[] args) {
        double kilometraje;
        double importe = 300;
        int kmBase = 200;
        double impTotal = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de kilometrajes: ");
        kilometraje = scanner.nextDouble();

        if (kilometraje < 200 && kilometraje > 0) {
            impTotal = importe;
        }
        else if (kilometraje >= 200 && kilometraje < 1000) {
            double impExtra = (kilometraje - kmBase)*5;
            impTotal= importe + impExtra;

        } else if (kilometraje >= 1000) {
            double impExtra = (kilometraje - kmBase)*10;
            impTotal= importe + impExtra;
        }
        System.out.println("El importe es a cobrar es: $" + impTotal);
    }
}
