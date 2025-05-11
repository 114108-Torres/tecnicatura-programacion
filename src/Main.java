import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura1;
        double altura2;
        String nombre1;
        String nombre2;

            System.out.println("Ingrese el nombre de la primer persona" );
            nombre1 = scanner.next();
            System.out.println("Ingrese la altura de la primer persona" );
            altura1 = scanner.nextDouble();

            System.out.println("Ingrese el nombre de la segunda persona" );
             nombre2 = scanner.next();
            System.out.println("Ingrese la altura de la segunda persona" );
            altura2 = scanner.nextDouble();

            if (altura1 > altura2) {
                System.out.println("La persona más alta es: " +  nombre1);
            } else {
                System.out.println("La persona más alta es: " +  nombre2);
            }


    }
}