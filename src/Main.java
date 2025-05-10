import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numeroUno = scanner.nextInt();
        System.out.println("Ingrese otro numero:");
        int numeroDos = scanner.nextInt();

        int suma = numeroUno + numeroDos;
        int resto = numeroUno - numeroDos;
        int multiplicacion = numeroUno * numeroDos;
        int division = numeroUno / numeroDos;

        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resto);
        System.out.println("La multiplicación de los números es: " + multiplicacion);
        System.out.println("La division de los números es: " + division);
    }
}