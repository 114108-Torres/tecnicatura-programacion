import java.util.Scanner;
/*
2. Crear una clase Punto que permita representar puntos en un plano de un sistema de coordenadas cartesianas.
Crear un programa que permita ingresar los datos de dos puntos y con ellos cree dos instancias de la clase Punto.
A partir de las instancias creadas calcular y mostrar la distancia existente entre ambos puntos.
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Ingrese las coordenadas [x] del primer punto: ");
        int x1 = sc.nextInt();
        System.out.print("¿Ingrese las coordenadas [y] del primer punto: ");
        int y1 = sc.nextInt();
        Punto punto1 = new Punto(x1, y1);

        System.out.print("¿Ingrese las coordenadas [x] del segundo punto: ");
        int x2 = sc.nextInt();
        System.out.print("¿Ingrese las coordenadas [y] del segundo punto: ");
        int y2 = sc.nextInt();
        Punto punto2 = new Punto(x2, y2);

        double distancia = punto1.distanciaEntrePuntos(punto2);
        System.out.print("La distancia entre los Puntos 1 y 2 es de: " + distancia);



    }

 }
