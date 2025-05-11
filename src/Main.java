import java.util.Scanner;
/*
3 Agregar a la clase persona un métdo que retorne su índice de masa corporal. Este último dato se calcula como: IMC = peso / altura2
 */

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

            System.out.print("Peso: ");
            double peso = sc.nextDouble();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();


            sc.nextLine(); // Limpia el buffer

            personas[i] = new Persona(nombre, apellido, edad, peso, altura);
        }

        System.out.println("\n--- Personas Ingresadas ---");
        for (Persona p : personas) {
            p.mostrarDatos();
        }
    }
}
