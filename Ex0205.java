/*  Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
Código      Especificação       Preço
1           Cachorro Quente     R$4.00
2           X-Salada            R$4.50
3           X-Bacon             R$5.00
4           Torrada simples     R$2.00
5           Refrigerante        R$1.50
*/

import java.util.Scanner;

public class Ex0205 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int item, quantidade;
        double resultado;
        System.out.print("Insira o número do item: ");
        item = sc.nextInt();
        System.out.print("Insira a quantidade do item: ");
        quantidade = sc.nextInt();
        sc.close();
        resultado = switch (item) {
            case 1 -> quantidade * 4.00;
            case 2 -> quantidade * 4.50;
            case 3 -> quantidade * 5.00;
            case 4 -> quantidade * 2.00;
            case 5 -> quantidade * 1.50;
            default -> {
                System.out.println("Valor inválido");
                yield 0;
            }
        };
        System.out.printf("O total é de: R$%.2f", resultado);


    }
}
