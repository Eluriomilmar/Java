/*  Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.   */

import java.util.Scanner;

public class Ex0304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        while (numero < 1 || numero > 1000){
            System.out.printf("Insira número de 1 a 1000: ");
            numero = sc.nextInt();
        }
        for(int i = 1; i <= numero; i++){
            if (i%2 != 0){
                System.out.printf("%d%n", i);
            }
        }
        sc.close();
    }
}
