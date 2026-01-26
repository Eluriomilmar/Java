/*
Fazer um programa para ler o nome, idade e altura de N pessoas. Depois, mostrar na tela a altura média das pessoas
e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como o nome dessas pessoas, caso houver.
 */
import java.util.Scanner;

public class Ex0503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira quantidade de pessoas: ");
        int qtd = sc.nextInt();
        int j = 0;

        while (qtd < 1) {
            System.out.printf("Insira quantidade maior que zero. %n");
            System.out.printf("");
            System.out.printf("Insira quantidade de pessoas: ");
            qtd = sc.nextInt();
        }

        String[] nomes = new String[qtd];
        int[] idades = new int[qtd];
        double[] alturas = new double[qtd];
        int total = 0;
        double altura_total = 0;
        int sub_16 = 0;

        for (int i = 0 ; i < idades.length ; i++) {
            System.out.printf("Insira os dados da %dª pessoa.%n", i+1);
            System.out.printf("Nome: ");
            nomes[i] = sc.next();
            System.out.printf("Idade: ");
            idades[i] = sc.nextInt();
            System.out.printf("Altura: ");
            alturas[i] = sc.nextDouble();

            if (idades[i] < 16) {
                sub_16 += 1;
            }

            altura_total += alturas[i];
            total += 1;
        }

        String[] sub_16_nomes = new String[sub_16];


        for (int i = 0 ; i < nomes.length ; i++) {
            if (idades[i] < 16) {
                sub_16_nomes[j] = nomes[i];
                j += 1;
            }
        }

        System.out.printf("Altura média: %.2f%n", altura_total/total);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (double)sub_16/total*100);
        System.out.print("Nomes das pessoas com menos de 16 anos: ");
        for (int i = 0; i < sub_16_nomes.length ; i++) {
            if (i == sub_16_nomes.length - 1) {
                System.out.printf("%s.", sub_16_nomes[i]);
            } else {
                System.out.printf("%s, ", sub_16_nomes[i]);
            }

        }

        sc.close();
    }
}
