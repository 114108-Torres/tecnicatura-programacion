import java.util.Scanner;
/*
8. Dado el valor de los tres lados de un triángulo se necesita calcular su perímetro.
Se pide crear en el mé_todo main() un objeto y determinar si el perímetro es superior a 10. Determinar la o las clases necesarias, sus atributos y métodos.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el lado 1 del triangulo");
        int lado1 = sc.nextInt();
        System.out.println("Ingrese el lado 2 del triangulo");
        int lado2 = sc.nextInt();
        System.out.println("Ingrese el lado 3 del triangulo");
        int lado3 = sc.nextInt();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        double perimetro = triangulo.calcularPerimetro();
        System.out.println("El perimetro es: " + perimetro);
    }
}