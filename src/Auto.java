
/*
5. Programar una clase Auto con datos de un automotor (marca, modelo, precio y kilometraje). Incluir un mé_todo que retorne la antigüedad del auto.
 */


import java.time.LocalDate;

public class Auto {

    private String marca;
    private String modelo;
    private double precio;
    private double kilometraje;
    private int año;

    public Auto (String marca, String modelo, double precio, double kilometraje, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometraje = kilometraje;
        this.año = año;

    }

    public int antiguedadAuto() {
        int añoActual = LocalDate.now().getYear();
        return añoActual - this.año;
    }

}

