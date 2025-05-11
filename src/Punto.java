/*
2. Crear una clase Punto que permita representar puntos en un plano de un sistema de coordenadas cartesianas.
Crear un programa que permita ingresar los datos de dos puntos y con ellos cree dos instancias de la clase Punto.
A partir de las instancias creadas calcular y mostrar la distancia existente entre ambos puntos.
 */


public class Punto {

    private int x;
    private int y ;


    public Punto(int x, int y) {
       this.x = x;
       this.y = y;
    }


        public double distanciaEntrePuntos(Punto otro) {
            int dx = this.x - otro.x;
            int dy = this.y - otro.y;
            return Math.sqrt(dx * dx + dy * dy);
    }
}
