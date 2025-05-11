import java.util.Scanner;
/*
6. Programar una clase Equipo que represente a un equipo de fútbol. Incluir en la misma atributos para almacenar el nombre del equipo
 y los datos relativos a un campeonato con forma de liga: puntos, cantidad de partidos ganados, empatados y perdidos,
 cantidad de goles realizados y recibidos y posición.
 */

public class Main {
    public static void main(String[] args) {
        Equipo river = new Equipo("River", 12, 3, 2, 30, 10, 1,5);
        Equipo boca = new Equipo("Boca", 11, 4, 2, 28, 12, 2, 9);

        Partido superclasico = new Partido(river, boca, 3, 2);
        superclasico.mostrarResultado();
    }
}