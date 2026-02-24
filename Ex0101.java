import java.util.Scanner;

public class Ex0101 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float x, y;
        x = sc.nextFloat();
        y = sc.nextFloat();

        System.out.println("SOMA = " + (x + y));

        sc.close();
    }
}
