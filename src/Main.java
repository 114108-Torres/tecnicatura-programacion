import java.util.Scanner;

/* 6. Ingresar un año e indicar si ese año es bisiesto.
Un año es bisiesto si es múltiplo de 4 y no es múltiplo de 100 o si es múltiplo de 400.
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();
        boolean esBisiesto = (anio % 4  == 0 && anio % 100 != 0) || (anio % 400 == 0);

        if (esBisiesto) {
            System.out.println("El año "+anio+" es bisiesto");
        } else {
            System.out.println("El año  "+anio+" no es bisiesto");
        }
    }
}
