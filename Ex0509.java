/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem ser armazenados
em um vetor e as idades em outro vetor. Depois, mostrar na tela o nome da pessoa mais velha.
 */

import java.util.Scanner;

public class Ex0509 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira quantidade de pessoas a serem registradas: ");
        int qtd = sc.nextInt();
        String[] nomes = new String[qtd];
        int[] idades = new int[qtd];
        int indice_mais_velha = 0;


        for (int i = 0 ; i < qtd ; i++) {
            System.out.printf("Insira os dados da %dª pessoa%n", i + 1);
            System.out.printf("Nome: ");
            nomes[i] = sc.next();
            System.out.printf("Idade: ");
            idades[i] = sc.nextInt();
            if (i == 0) {
                indice_mais_velha = 0;
            } else {
                if (idades[i] > idades[indice_mais_velha]) {
                    indice_mais_velha = i;
                }
            }
        }

        System.out.printf("A pessoa mais velha é: %s, que possui %d anos.", nomes[indice_mais_velha], idades[indice_mais_velha]);

        sc.close();
    }
}
