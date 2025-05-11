import java.util.Scanner;

/* 12. Desarrollar un programa que permita ingresar la antigüedad los autos de una concesionaria de usados.
Finalizar la carga cuando se ingrese 0. Por cada auto ingresado mostrar por pantalla un mensaje adecuado
con el siguiente criterio: si el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”,
si tiene entre 6 y 10 mostrar “POCO USO”, si tiene entre 11 y 20 “MUCHO USO” y si tiene más de 20 “MUY ANTIGUO”.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de autos a cargar en sistema: ");
        int totalAutos = sc.nextInt();

        for (int i = 1; i <= totalAutos; i++) {
            System.out.print("Ingrese la antigüedad del auto " + i + ": ");
            int antigAuto = sc.nextInt();
            if (antigAuto >= 1 && antigAuto <= 5) {
                System.out.println("El auto "+ i +" es NUEVO.");
            } else if (antigAuto > 5 && antigAuto <= 10) {
                System.out.println("El auto "+ i +" tiene POCO USO.");
            } else if (antigAuto > 10 && antigAuto <= 20) {
                System.out.println("El auto "+ i +" tiene MUCHO USO.");
            } else if (antigAuto > 20 ) {
                System.out.println("El auto "+ i +" es MUY ANTIGUO.");
            }
        }


    }
}