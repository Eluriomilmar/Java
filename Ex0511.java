/*
Há um conjunto de dados contento a altura e o gênero de N pessoas. Fazer um programa que calcule e escreva as menores e
maiores alturas do grupo, a média de altura das mulheres, e o número de homens.
 */

import java.util.Scanner;

public class Ex0511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira quantidade de pessoas a serem registradas: ");
        int qtd = sc.nextInt();
        double[] alturas = new double[qtd];
        char[] generos = new char[qtd];
        int qtd_homens = 0;
        int qtd_mulheres = 0;
        double total_altura_mulheres = 0;
        double maior_altura = 0;
        double menor_altura = 0;

        for (int i = 0 ; i < qtd ; i ++) {
            System.out.printf("Altura da %dª pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Gênero(M/F) da %dª pessoa: ", i + 1);
            generos[i] = sc.next().charAt(0);
            System.out.printf("%n");
            if (i == 0) {
                maior_altura = alturas[i];
                menor_altura = alturas[i];
            } else {
                if (alturas[i] < menor_altura) {
                    menor_altura = alturas[i];
                }
                if (alturas[i] > maior_altura) {
                    maior_altura = alturas[i];
                }
            }
            if (generos[i] == 'F') {
                total_altura_mulheres += alturas[i];
                qtd_mulheres += 1;
            }
            if (generos[i] == 'M') {
                qtd_homens += 1;
            }
        }

        System.out.printf("Menor altura: %.2f%n", menor_altura);
        System.out.printf("Maior altura: %.2f%n", maior_altura);
        System.out.printf("Média das alturas das mulheres: %.2f%n", total_altura_mulheres/qtd_mulheres);
        System.out.printf("Quantidade de homens: %d", qtd_homens);

        sc.close();
    }
}
