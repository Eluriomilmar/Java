/*
Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros. Em seguida, mostrar
a diagonal principal e a quantidade de valores negativos da matriz.
 */

import java.util.Scanner;

public class Ex0514 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira o tamanho da matriz: ");
        int tam = sc.nextInt();
        int[][] matriz = new int[tam][tam];
        for (int i = 0 ; i < matriz.length ; i++) {
            for (int j = 0 ; j < matriz[i].length ; j++) {
                System.out.printf("Insira o vetor de posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        int negativos = 0;
        System.out.printf("Diagonal principal: ");
        for (int i = 0 ; i < tam ; i++) {
            for (int j = 0 ; j < tam ; j++) {
                if (matriz[i][j] < 0) {
                    negativos += 1;
                }
                if (i == j) {
                    System.out.printf("%d ", matriz[i][j]);
                }
            }
        }
        System.out.printf("%nQuantidade de números negativos: %d", negativos);
    }
}
