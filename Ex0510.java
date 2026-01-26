/*
Fazer um programa para ler um conjunto N de nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres.
Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando
aprovados aqueles cuja média das notas for igual ou maior a 6.
 */

import java.util.Scanner;

public class Ex0510 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira quantidade de alunos: ");
        int qtd = sc.nextInt();
        double[] nota1 = new double[qtd];
        double[] nota2 = new double[qtd];
        String[] nome = new String[qtd];

        for (int i = 0 ; i < qtd ; i++) {
            System.out.printf("Digite o nome, primeira e segunda notas do %dº aluno%n", i + 1);
            System.out.printf("Nome: ");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.printf("Primeira nota: ");
            nota1[i] = sc.nextDouble();
            System.out.printf("Segunda nota: ");
            nota2[i] = sc.nextDouble();
            System.out.println();
        }

        System.out.printf("Alunos aprovados.%n ");
        for (int i = 0 ; i < qtd ; i++) {
            if ((nota1[i] + nota2[i])/2 >= 6) {
                System.out.printf("%s%n", nome[i]);
            }
        }

        sc. close();
    }
}
