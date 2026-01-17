/*  Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação    */

import java.util.Scanner;

public class Ex0207 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x, y;
        x = sc.nextFloat();
        y = sc.nextFloat();
        sc.close();
        if (x == 0 && y == 0){
            System.out.printf("Origem");
        }else if(y == 0){
            System.out.printf("Eixo X");
        }else if(x == 0){
            System.out.printf("Eixo Y");
        }else{
            if (x > 0 && y > 0){
                System.out.printf("Q1");
            }else if (x < 0 && y > 0){
                System.out.printf("Q2");
            }else if (x < 0 && y < 0){
                System.out.printf("Q3");
            }else{
                System.out.printf("Q4");
            }
        }
    }
}
