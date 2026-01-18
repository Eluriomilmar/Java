/*  Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.    */

import java.util.Scanner;

public class Ex0308 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira o fatorial de qual número deseja calcular: ");
        int N = sc.nextInt();
        for (int i = N-1 ; i >= 0 ; i--){
            if (i == 0){
                N *= 1;
            }else{
                N *= i;
            }
        }sc.close();
        System.out.printf("O resultado é: %d", N);

    }
}
