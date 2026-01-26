/*
Faça um programa que leia N números reais e os armazene em um vetor.
Em seguida, imprima todos os elementos do vetor e mostre na tela a soma e a média de seus elementos.
 */

import java.util.Scanner;

public class Ex0502 {
    public static void main(String[] args) {
        System.out.printf("Insira quantidade de números a serem contidos no vetor: ");
        Scanner sc = new Scanner(System.in);
        double media = 0;
        double soma = 0;
        int qtd = sc.nextInt();
        while (qtd < 1) {
            System.out.printf("Quantidade de números deve ser superior a 0.%n");
            System.out.printf("Insira quantidade de números a serem contidos no vetor: ");
        }
        double[] vetor = new double[qtd];
        for (int i = 0; i < vetor.length ; i++) {
            System.out.printf("Insira o número da posição %d: ", i);
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
            media += 1;
        }
        media = soma/media;

        System.out.printf("Valores: ");
        for (int i = 0; i < vetor.length ; i++){
            System.out.printf("%.2f ", vetor[i]);
        }

        System.out.printf("%nSoma: %.2f%nMédia: %.2f", soma, media);

        sc.close();

    }
}
