/*  Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5. */

import java.util.Scanner;


public class Ex0306 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Insira a quantidade de casos teste: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            double a, b, c;
            System.out.printf("Insira o primeiro número: ");
            a = sc.nextDouble();
            System.out.printf("Insira o segundo número: ");
            b = sc.nextDouble();
            System.out.printf("Insira o terceiro número: ");
            c = sc.nextDouble();
            System.out.printf("A média do caso é igual a: %.2f%n", (a*2.0 + b*3.0 + c*5.0)/10);
        }
    sc.close();
    }
}
