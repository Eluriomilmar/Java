/*
Faça um programa que leia um número inteiro positivo(máximo = 10) e depois N números inteiros e armazene-os em um vetor.
Em seguida, mostre na tela todos os números negativos lidos.
 */

import java.util.Scanner;
import java.util.Vector;

public class Ex0501 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos números você vai digitar? ");
        int qtd = sc.nextInt();
        while (qtd < 1 || qtd > 10){
            System.out.printf("São aceitas somente quantidades de 1 a 10.%n" +
                    "Insira quantidade de números a serem registrados: ");
            qtd = sc.nextInt();
        }
        double[] vetor = new double[qtd];
        for (int i = 0 ; i < vetor.length ; i++){
            System.out.printf("Insira número: ");
            vetor[i] = sc.nextFloat();
        }

        System.out.printf("Números ímpares: ");
        boolean nenhum = true;
        for (int i = 0; i < vetor.length ; i++){
            if (vetor[i] < 0){
                System.out.printf("%.2f ", vetor[i]);
                nenhum = false;
            }
        }

        if (nenhum == true){
            System.out.print("Nenhum.");
        }

    }
}
