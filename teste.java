import java.util.Scanner;
import parafernalhas.Produtos;

public class teste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();
        float total = 0;
        Produtos[] vetor = new Produtos[qtd];
        for (int i = 0; i < vetor.length ; i++) {
            sc.nextLine();
            System.out.printf("Nome: ");
            String nome = sc.nextLine();
            System.out.printf("Valor: ");
            double valor = sc.nextDouble();
            vetor[i] = new Produtos(nome, valor);
        }
        for(int i = 0 ; i < vetor.length ; i++) {
            System.out.printf("Produto: %s  Preço: %.2f%n", vetor[i].getNome(), vetor[i].getPreco());
            total += vetor[i].getPreco();
        }

        System.out.printf("Média dos preços: %.2f", total/qtd);




        sc.close();
    }

}
