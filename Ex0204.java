/*  Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas  */
import java.util.Scanner;

public class Ex0204 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inicio, fim, total;
        System.out.printf("Insira a hora de início: ");
        inicio = sc.nextInt();
        System.out.printf("%nInsira a hora do fim: ");
        fim = sc.nextInt();
        sc.close();
        if (inicio < fim){
            total = fim - inicio;
        }else if (inicio > fim){
            total = 24 - inicio + fim;
        }else{
            total = 24;
        }

        if (total > 1) {
            System.out.printf("%nO jogo durou %d horas", total);
        }else{
            System.out.println("%nO jogo durou 1 hora");
        }
    }
}
