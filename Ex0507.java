/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostrar na tela a média
aritmética de todos elementos com três casas decimais. Depois mostrar todos os elementos do vetor que estejam abaixo
da média, com uma casa decimal cada.
 */

import java.util.Scanner;

public class Ex0507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira o tamanho do vetor: ");

        int qtd = sc.nextInt();

        double[] vetor = new double[qtd];
        double media = 0;

        for (int i = 0 ; i < vetor.length ; i++) {
            System.out.printf("Insira número: ");
            vetor[i] = sc.nextDouble();
            media += vetor[i];
        }
        media = media/vetor.length;

        System.out.printf("Média do vetor: %.3f%n", media);
        System.out.printf("Elementos abaixo da média: ");

        for (int i = 0 ; i < vetor.length ; i++) {
            if (vetor[i] < media) {
                if (i == vetor.length - 1) {
                    System.out.printf("%.1f", vetor[i]);
                } else {
                    System.out.printf("%.1f, ", vetor[i]);
                }
            }
        }
        sc.close();
    }
}
