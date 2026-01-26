/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor.
Mostrar também a posição do maior elemento, considerando a primeiraposição como zero.
 */

import java.util.Scanner;

public class Ex0505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maior = 0;
        int pos_maior = 0;
        System.out.printf("Quantidade de números que serão inseridos: ");
        int qtd = sc.nextInt();
        while (qtd < 1) {
            System.out.printf("Insira número maior que 0: ");
        }

        double[] numeros = new double[qtd];

        for (int i = 0 ; i < numeros.length ; i++) {
            System.out.printf("Digite o número da posição %d: ", i);
            numeros[i] = sc.nextDouble();
            if (i == 0) {
                maior = numeros[i];
                pos_maior = i;
            } else {
                if (maior < numeros[i]) {
                    maior = numeros[i];
                    pos_maior = i;
                }
            }
        }
        System.out.printf("%nMaior valor: %.2f\nPosição do maior valor: %d", maior, pos_maior);
    }
}
