/*
Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo
números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada
ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.
 */

import java.util.Scanner;

public class Ex0515 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira número de linhas: ");
        int linhas = sc.nextInt();
        System.out.printf("Insira número de colunas: ");
        int colunas = sc.nextInt();
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0 ; i < linhas ; i++) {
            for (int j = 0 ; j < colunas ; j++) {
                System.out.printf("Insira valor da posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.printf("Insira número para exibir aqueles em seu entorno: ");
        int entorno = sc.nextInt();

        for (int i = 0 ; i < matriz.length ; i++) {
            for (int j = 0 ; j < matriz[i].length ; j++) {
                System.out.printf("%d  ", matriz[i][j]);
            }
            System.out.printf("%n");
        }

        for (int i = 0 ; i < matriz.length ; i++) {
            for (int j = 0 ; j < matriz[i].length ; j++) {
                if (matriz[i][j] == entorno) {
                    if (i-1 >= 0) {
                        System.out.printf("Acima: %d ", matriz[i-1][j]);
                    }
                    if (j-1 >= 0) {
                        System.out.printf("Esquerda: %d ", matriz[i][j-1]);
                    }
                    if (j+1 < matriz[i].length) {
                        System.out.printf("Direita: %d ", matriz[i][j+1]);
                    }
                    if (i+1 < matriz.length) {
                        System.out.printf("Abaixo: %d %n", matriz[i+1][j]);
                    }
                }
            }
        }
    }
}
