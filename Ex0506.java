/*
Faça um programa para ler dois vetores A e B contendo N elementos cada. Em seguida, gere um terceiro vetor onde cada elemento
é a soma dos elementos dos vetores A e B nas posições correspondentes. Imprima o vetor C.
 */

import java.util.Scanner;

public class Ex0506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira quantidade de elementos que os vetores terão: ");
        int qtd = sc.nextInt();
        int[] A = new int[qtd];
        int[] B = new int[qtd];
        int[] C = new int[qtd];

        System.out.printf("Digite os valores do vetor A.%n");

        for (int i = 0 ; i < A.length ; i++) {
            System.out.printf("%dº valor: ", i+1);
            A[i] = sc.nextInt();
        }

        System.out.printf("Digite os valores do vetor B.%n");

        for (int i = 0 ; i < B.length ; i++) {
            System.out.printf("%dº valor: ", i+1);
            B[i] = sc.nextInt();
        }

        System.out.printf("Vetor resultante.%n");

        for (int i = 0 ; i < C.length ; i++) {
            C[i] = A[i] + B[i];
            System.out.printf("%dº valor: %d%n", i+1, C[i]);
        }

        sc.close();
    }
}
