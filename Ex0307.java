/*  Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel" */

import java.util.Scanner;

public class Ex0307 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int quantidade;
        System.out.printf("Insira quantidade de divisões: ");
        quantidade = sc.nextInt();
        while (quantidade > 0){
            double a, b;
            System.out.printf("Insira o numerador: ");
            a = sc.nextDouble();
            System.out.printf("Insira o denominador: ");
            b = sc.nextDouble();
            if (b != 0){
                System.out.printf("Resultado: %.2f%n", (a/b));
            }else{
                System.out.println("Divisão impossível");
            }
            quantidade -= 1;
        }
        sc.close();
    }
}
