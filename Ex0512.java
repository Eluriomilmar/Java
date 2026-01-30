/*
A dona de um pensioanto possui dez quartos para alugar para estudantes, sendo esses quartos identificados por números(0-9).

Faça um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de
estudantes que vão alugar quartos(N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada
registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu(de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato,
por ordem de quarto.
 */

import java.util.Scanner;
import parafernalhas.E0512;

public class Ex0512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira quantidade de quartos que serão alugados: ");
        int qtd = sc.nextInt();
        E0512[] quartos = new E0512[10];
        for (int i = 0 ; i < qtd ; i++ ) {
            sc.nextLine();
            System.out.printf("%dº aluguel:%nNome:", i + 1);
            String nome = sc.nextLine();
            System.out.printf("Email: ");
            String email = sc.nextLine();
            System.out.printf("Número do quarto: ");
            int quarto = sc.nextInt();
            quartos[quarto] = new E0512(nome, email);
        }

        for (int i = 0; i < quartos.length ; i++) {
            if (quartos[i] != null) {
                System.out.printf("Quarto %d: %s%n", i, quartos[i].toString());
            }
        }
    }
}
