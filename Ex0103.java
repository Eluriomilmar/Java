import java.util.Scanner;

public class Ex0103 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        System.out.printf("Diferença = %d", A*B - C*D);

        sc.close();


    }
}
