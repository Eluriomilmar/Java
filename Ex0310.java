/*  Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo     */

import java.util.Scanner;

public class Ex0310 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira número inteiro maior que 0: ");
        int N = sc.nextInt();
        if (N > 0){
            for (int i = 1; i <= N; i++){
                System.out.printf("Número: %d, Quadrado: %d, Cubo: %d%n", i, i*i, i*i*i);
            }
        }else{
            System.out.printf("Número invalido inserido.%nEncerrando programa.");
        }
        sc.close();
    }
}
