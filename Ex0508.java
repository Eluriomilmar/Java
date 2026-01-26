/*
Leia um vetor de N números inteiros. Em seguida, mostre na tela a média aritmética somente dos números pares lidos,
com uma casa decimal. Se nenhum número par for digitado, mostrar mensagem: "Nenhum número par inserido".
*/

import java.util.Scanner;

public class Ex0508 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira quantidade de elementos do vetor: ");
        int qtd = sc.nextInt();
        double pares = 0;
        double total = 0;

        while (qtd < 0) {
            System.out.println("Insira quantidade maior ou igual a 0: ");
            qtd = sc.nextInt();
        }

        int[] vetor = new int[qtd];

        for (int i = 0 ; i < vetor.length ; i++) {
            System.out.printf("Insira o elemento da posição %d: ", i);
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                pares += vetor[i];
                total += 1;
            }
        }

        if (total > 0) {
            System.out.printf("Média dos pares: %.2f", pares/total);
        } else {
            System.out.printf("Nenhum número par inserido");
        }
        sc.close();
    }
}
