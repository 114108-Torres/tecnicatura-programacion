
/*
6. Programar una clase Equipo que represente a un equipo de fútbol. Incluir en la misma atributos para almacenar el nombre del equipo
 y los datos relativos a un campeonato con forma de liga: puntos, cantidad de partidos ganados, empatados y perdidos,
 cantidad de goles realizados y recibidos y posición.
 */


import java.time.LocalDate;

public class Equipo {

 private String nombre;
 private int puntos;
 private int ganados;
 private int empatados;
 private int perdidos;
 private int golesFavor;
 private int golesContra;
 private int posicion;

    public Equipo (String nombre, int puntos, int ganados, int empatados, int perdidos, int golesFavor, int golesContra, int posicion) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.ganados = ganados;
        this.empatados = empatados;
        this.perdidos = perdidos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.posicion = posicion;
    }
public int diferenciaGoles () {
    return golesFavor - golesContra;
}


}

