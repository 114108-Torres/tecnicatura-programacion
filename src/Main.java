import java.util.Scanner;

/* 11. Ingresar el tiempo en segundos que realizó el ganador de la clasificación de una carrera de F1.
Luego ingresar los tiempos de los otros 9 corredores e informar cuántos disputarán la carrera.
Para que un corredor pueda participar su tiempo de clasificación no puede superar en 15 % al del ganador.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TOTAL_CORREDORES = 9;
        int contador = 0;

        System.out.print("Ingrese el tiempo en segundos del ganador de la clasificación de la F1 :");
        int segGanador = sc.nextInt();

        for (int i = 1; i <= TOTAL_CORREDORES; i++) {
            System.out.print("Ingrese el tiempo en segundos del corredor " + i + " : ");
            int segCorredor = sc.nextInt();
            if (CalcularTiempos(segGanador,segCorredor)) {
                contador++;
            }
        }
        System.out.print("La cantidad de corredores que participan de la carrera es : " + contador + " pilotos (no superaron el 15% del tiempo del ganador).");

    }

    public static boolean CalcularTiempos (int tiempoGanador, int tiempoCorredor) {
        return tiempoCorredor < (tiempoGanador * 1.15);
    }
}