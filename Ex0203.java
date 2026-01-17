/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente */

import java.util.Scanner;

public class Ex0203 {
    public static void main(String[] args){
        int A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();
        if (B%A == 0 || A%B == 0){
            System.out.println("São múltiplos");
        }else{
            System.out.println("Não são múltiplos");
        }
    }
}
