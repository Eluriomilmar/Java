//Fazer um programa para ler um número inteiro e dizer se este número é pr ou ímpar.

import java.util.Scanner;

public class Ex0202 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int entrada;
        entrada = sc.nextInt();
        sc.close();
        if (entrada % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
