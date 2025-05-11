import java.util.Scanner;

/* 10. Ingresar un número y validar que sea positivo.
Si no lo es continuar solicitándolo al usuario hasta que ingrese un número correcto.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        while   (num < 0)
        {
            System.out.println("El número "+num+" no es positivo. Ingrese un número mayor que 0");
            System.out.print("Ingrese un número: ");
            num = sc.nextInt();
        }
        System.out.println("El número "+num+" es positivo. Bien hecho!");
    }
}