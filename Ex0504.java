/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os números
pares e a quantidade de números pares.
 */

import java.util.Scanner;

public class Ex0504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantidade de números a serem digitados: ");
        int qtd = sc.nextInt();
        int cont_pares = 0;
        int[] inteiros = new int[qtd];
        for (int i = 0 ; i < inteiros.length ; i++) {
            System.out.printf("Digite o %dº número: ", i);
            inteiros[i] = sc.nextInt();
            if (inteiros[i]%2 == 0) {
                cont_pares += 1;
            }
        }

        int[] pares = new int[cont_pares];
        int j = 0;

        for (int i = 0 ; i < inteiros.length ; i++) {
            if (inteiros[i] % 2 == 0) {
                pares[j] = inteiros[i];
                j += 1;
            }
        }

        System.out.printf("%nNúmeros pares: ");

        for (int i = 0 ; i < pares.length ; i++) {
            if (i != pares.length - 1) {
                System.out.printf("%d, ", pares[i]);
            } else {
                System.out.printf("%d.%n", pares[i]);
            }
        }

        System.out.printf("%nQuantidade de pares: %d", pares.length);
        sc.close();
    }
}
