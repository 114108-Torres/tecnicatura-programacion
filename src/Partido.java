public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    // Constructor
    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }




    public void mostrarResultado() {
        System.out.println("Partido: " + equipoLocal.getNombre() + " vs " + equipoVisitante.getNombre());
        System.out.println("Resultado: " + golesLocal + " - " + golesVisitante);
        System.out.println("Ganador: " + determinarGanador());
    }

    public String determinarGanador() {
        if (golesLocal > golesVisitante) {
            return equipoLocal.getNombre();
        } else if (golesVisitante > golesLocal) {
            return equipoVisitante.getNombre();
        } else {
            return "Empate";
        }
    }
}

