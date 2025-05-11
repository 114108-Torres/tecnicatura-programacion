import java.util.Scanner;

/* 13. Luego de finalizada la carga calcular y mostrar los siguientes resultados:
• Cantidad total de autos.
• Cantidad de autos con poco uso.
• Promedio de antigüedad de los autos que no sean muy antiguos
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pocoUso = 0;
        int sumaAntiguedades = 0;
        int contador = 0;

        System.out.print("Ingrese la cantidad de autos a cargar en sistema: ");
        int totalAutos = sc.nextInt();

        for (int i = 1; i <= totalAutos; i++) {
            System.out.print("Ingrese la antigüedad del auto " + i + ": ");
            int antigAuto = sc.nextInt();

            if (antigAuto >= 1 && antigAuto <= 5) {
                System.out.println("El auto " + i + " es NUEVO.");
                sumaAntiguedades += antigAuto;
                contador++;
            } else if (antigAuto > 5 && antigAuto <= 10) {
                System.out.println("El auto " + i + " tiene POCO USO.");
                pocoUso++;
                sumaAntiguedades += antigAuto;
                contador++;
            } else if (antigAuto > 10 && antigAuto <= 20) {
                System.out.println("El auto " + i + " tiene MUCHO USO.");
                sumaAntiguedades += antigAuto;
                contador++;
            } else if (antigAuto > 20) {
                System.out.println("El auto " + i + " es MUY ANTIGUO.");
            }

            System.out.println(); // Salto de línea entre autos
        }

        System.out.println("La cantidad total de autos es: " + totalAutos);
        System.out.println("La cantidad de autos con POCO USO es: " + pocoUso);

        if (contador > 0) {
            double promedio = (double) sumaAntiguedades / contador;
            System.out.println("El promedio de antigüedad de los autos no MUY ANTIGUOS es de: " + promedio + " años.");
        } else {
            System.out.println("No se ingresaron autos que no sean MUY ANTIGUOS.");
        }
    }
}