import java.time.LocalDate;
/*
7. Programar una clase Partido que represente a un partido de futbol.
La misma debe contener dos atributos de tipo Equipo que indiquen los equipos contendientes y atributos necesarios para indicar el resultado del mismo.
 */


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

    public String getNombre() {
        return nombre;
    }


}


