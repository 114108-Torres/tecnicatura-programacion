import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas personas desea ingresar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // Limpia el buffer

        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Persona " + (i + 1) + " ---");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellido: ");
            String apellido = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine(); // Limpia el buffer

            personas[i] = new Persona(nombre, apellido, edad);
        }

        System.out.println("\n--- Personas Ingresadas ---");
        for (Persona p : personas) {
            p.mostrarDatos();
        }
    }
}