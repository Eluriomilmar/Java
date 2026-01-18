/*  Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002    */

import java.util.Scanner;

public class Ex0301 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int senha;
        System.out.printf("Insira senha: ");
        senha = sc.nextInt();
        while(senha != 2002){
            System.out.printf("Senha inválida, insira senha correta: ");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta inserida, finalizando programa.");
        sc.close();
    }
}
