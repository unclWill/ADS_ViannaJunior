/*
 * Autor: William Silva (https://gitlab.com/unclWill)
 * Data : 27/02/2024
 *
 * Exercício 4) Crie uma classe chamada "Retângulo" que represente um retângulo. Esta classe
 * deve ter os seguintes atributos: comprimento (double) e largura (double). Além disso, a
 * classe deve ter métodos para calcular a área e o perímetro do retângulo. Em seguida,
 * crie um programa principal que instancia objetos da classe "Retângulo", calcula a área
 * e o perímetro de cada um e exibe os resultados.
 */

public class Main {
    public static void main(String[] args) {
        Retangulo ret1, ret2, ret3;

        ret1 = new Retangulo(5.2, 3.9);
        exibeResultado(ret1.calcularArea(), ret1.calcularPerimetro());

        ret2 = new Retangulo(9.5, 6);
        exibeResultado(ret2.calcularArea(), ret2.calcularPerimetro());

        ret3 = new Retangulo(17.7, 10.3);
        exibeResultado(ret3.calcularArea(), ret3.calcularPerimetro());
    }

    private static void exibeResultado(double area, double perimetro) {
        System.out.println("\nDados do retângulo");
        System.out.printf("ÁREA = %.4f%nPERÍMETRO = %.4f%n", area, perimetro);
    }
}