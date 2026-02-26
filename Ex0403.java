/*
Programa para ler o nome de um aluno e três notas, o primeiro trimestre vale 30 e os outros dois 35 cada.
Mostrar qual a nota final do aluno no ano. Mostrar também se o aluno está aprovado ou não e, em caso negativo,
quantos pontos faltam para o aluno obter o mínimo para ser aprovado(60%).
 */

import java.util.Scanner;
import parafernalhas.antes07.Estudante;

public class Ex0403 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Estudante es = new Estudante();
        System.out.printf("Insira o nome do estudante: ");
        es.nome = sc.nextLine();
        System.out.printf("Insira a nota do primeiro trimestre: ");
        es.nota1 = sc.nextFloat();
        System.out.printf("Insira a nota do segundo trimestre: ");
        es.nota2 = sc.nextFloat();
        System.out.printf("Insira a nota do terceiro trimestre: ");
        es.nota3 = sc.nextFloat();
        System.out.printf("A nota final foi igual a: %.2f%n", es.total());
        if (es.total() < 60){
            System.out.printf("O estudante falhou%n");
            System.out.printf("Faltaram %.2f pontos para a aprovação.", (60 - es.total()));
        }else{
            System.out.printf("O estudante foi aprovado%n");
        }
    }
}
