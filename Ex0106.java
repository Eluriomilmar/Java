import java.util.Scanner;

public class Ex0106 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float A, B, C;
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();

        System.out.printf("Triângulo: %.2f%n" +
                "Círculo: %.2f%n" +
                "Trapézio: %.2f%n" +
                "Quadrado: %.2f%n" +
                "Retângulo: %.2f%n", (A*C/2), (3.14159*C*C), (A+B)/2*C, (B*B), (A*B));

        sc.close();

    }
}
