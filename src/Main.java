import java.util.Scanner;
/*
5. Programar una clase Auto con datos de un automotor (marca, modelo, precio y kilometraje). Incluir un mé_todo que retorne la antigüedad del auto.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese los datos del auto.");
        sc.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = sc.nextLine();
        System.out.print("Ingrese el modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Ingrese el precio: ");
        double precio = sc.nextInt();
        System.out.print("Ingrese el kilometraje: ");
        double km = sc.nextDouble();
        System.out.print("Ingrese el año de fabricación: ");
        int año = sc.nextInt();

        Auto auto = new Auto(marca, modelo, precio, km,año);
        System.out.println("La antigüedad del auto es de : " + auto.antiguedadAuto() + " años.");
    }
}
