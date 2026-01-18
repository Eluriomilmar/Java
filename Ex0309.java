/*  Ler um número inteiro N e calcular todos os seus divisores. */

import java.util.Scanner;

public class Ex0309 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira número inteiro para calcular seus divisores: ");
        int numerador = sc.nextInt();
        if (numerador >= 1){
            System.out.printf("O número possui os seguintes divisores: ");
            for(int i = 1; i <= numerador ; i++) {
                if (numerador % i == 0 && numerador != i) {
                    System.out.printf("%d, ", i);
                } else if (numerador % i == 0 && numerador == i) {
                    System.out.printf("%d.", i);
                }
            }
        }else{
            System.out.printf("O número precisa ser maior que 0.%nFinalizando programa.");
        }
        sc.close();
    }
}
