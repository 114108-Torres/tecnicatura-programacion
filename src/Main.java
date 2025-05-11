import java.util.Scanner;

/* 5. Ingresar la cantidad de horas trabajadas por un empleado y el sueldo que cobra por hora.
 Indique el total a cobrar teniendo en cuenta que si trabajó más de 180 horas las excedentes las cobra con un 50 % de aumento.
 */

public class Main {
    public static void main(String[] args) {
         int HORAS_BASE = 180;
         double EXTRA_MULTIPLICADOR = 1.5;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas trabajadas por el empleado: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el sueldo por hora: $");
        double sueldoPorHora = scanner.nextDouble();

        double salarioTotal;

        if (horasTrabajadas <= HORAS_BASE) {
            salarioTotal = horasTrabajadas * sueldoPorHora;
        } else {
            int horasExtra = horasTrabajadas - HORAS_BASE;
            salarioTotal = (HORAS_BASE * sueldoPorHora) + (horasExtra * sueldoPorHora * EXTRA_MULTIPLICADOR);
        }

        salarioTotal = Math.round(salarioTotal * 100.0) / 100.0;

        System.out.println("Salario a percibir: $" + salarioTotal);
    }
}
