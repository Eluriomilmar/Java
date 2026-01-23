import java.util.Scanner;

public class teste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();
        float total = 0;
        double[] vetor = new double[qtd];
        for(int i = 0; i < qtd ; i++){
            vetor[i] = sc.nextFloat();
            total += vetor[i];
        }

        System.out.printf("A média é igual a: %.2f", total/qtd);

        sc.close();
    }
}
