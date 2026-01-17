import java.util.Scanner;


public class Ex0102 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float raio, resultado, pi;
        pi = 3.14159F;
        raio = sc.nextFloat();
        resultado = raio * raio * pi;

        System.out.printf("A área do círculo é igual a: %.4f%n", resultado);
        sc.close();

    }
}
