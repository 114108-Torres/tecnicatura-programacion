/*1. Programar una clase Persona con atributos suficientes para almacenar nombre,
apellido y edad de una persona. Crear un programa que permita ingresar los datos
de algunas personas por teclado y con esos datos cree instancias y muestre por pantalla el estado de las mismas. */


public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad);
    }
}
