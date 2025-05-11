
/*
3 Agregar a la clase persona un métdo que retorne su índice de masa corporal. Este último dato se calcula como: IMC = peso / altura2
 */



public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double altura;

    public Persona(String nombre, String apellido, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + calcularEMC());
    }

    public double calcularEMC (){
        double emc = peso / Math.sqrt(altura);
        return emc;
    }
}
