/*  Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.   */

import java.util.Scanner;

public class Ex0206 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         float entrada;
         entrada = sc.nextFloat();
         sc.close();
         if (entrada >= 0 && entrada <= 100){
             if (entrada <= 25){
                 System.out.println("Intervalo [0,25]");
             }else if (entrada <= 50){
                 System.out.println("Intervalo (25,50]");
             }else if (entrada <= 75){
                 System.out.println("Intervalo (50,75]");
             }else{
                 System.out.println("Intervalo (75,100]");
             }
         }else{
             System.out.println("Fora do intervalo");
         }
     }
}
