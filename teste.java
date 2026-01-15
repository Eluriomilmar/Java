import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        System.out.println("Escreva a palavra a ser reproduzida: ");
        x = sc.next();
        System.out.println("Você digitou: " + x);

        sc.close();
    }
}
