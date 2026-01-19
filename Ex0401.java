/*
Fazer um programa para ler os valores da largura e altura de um retângulo.
Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
Usar uma classe separada.
 */

import java.util.Scanner;
import java.lang.Math;

public class Ex0401 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira o valor de x: ");
        double x = sc.nextDouble();
        System.out.print("Insira o valor de y: ");
        double y = sc.nextDouble();
        System.out.printf("Area: %.2f%nPerímetro: %.2f%nDiagonal: %.2f", area(x, y), perimetro(x, y), (diagonal(x, y)));
    }

    public static double area(double x, double y){
        return (x * y);
    }

    public static double perimetro(double x, double y){
        return (2*x + 2*y);
    }

    public static double diagonal(double x, double y){
        return Math.sqrt((x * x) + (y * y));
    }
}
