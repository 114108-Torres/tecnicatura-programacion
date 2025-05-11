import java.util.Scanner;

/* 5. Ingresar la cantidad de horas trabajadas por un empleado y el sueldo que cobra por hora.
 Indique el total a cobrar teniendo en cuenta que si trabajó más de 180 horas las excedentes las cobra con un 50 % de aumento.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sueldo;
        int hsTrabajo;
        double sueldoTrabajo;

        System.out.println("Ingrese la cantidad de horas trabajados por el empleado: " );
        hsTrabajo = scanner.nextInt();
        System.out.println("Ingrese el sueldo por hora: $" );
        sueldo = scanner.nextDouble();

        if (hsTrabajo < 180) {
            sueldoTrabajo = Math.round(sueldo * hsTrabajo) ;
            System.out.println("Salario a percibir: $ " + sueldoTrabajo);
        } else if (hsTrabajo > 180) {
            sueldoTrabajo = Math.round(sueldo * 180) ;
            int hsExcedente = hsTrabajo - 180;
            double sueldoExcedente = (sueldo * 1.5) * hsExcedente;
            double sueldoConExtras = sueldoTrabajo + sueldoExcedente;
            System.out.println("Salario a percibir: $ " + sueldoConExtras);
        }


    }
}