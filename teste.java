import java.util.Scanner;
import parafernalhas.parateste;

public class teste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();

        System.out.printf("Circunferência: %.2f%n" +
                "Volume: %.2f%n" +
                "Pi: %.2f", parateste.circumference(raio), parateste.volume(raio), parateste.PI);

        sc.close();
    }
}
