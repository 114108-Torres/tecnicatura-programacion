/*
8. Dado el valor de los tres lados de un triángulo se necesita calcular su perímetro.
Se pide crear en el mé_todo main() un objeto y determinar si el perímetro es superior a 10. Determinar la o las clases necesarias, sus atributos y métodos.
 */

public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

}
