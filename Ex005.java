import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int codigo, codigo2, quantidade, quantidade2;
        float valor, valor2;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();
        valor = sc.nextFloat();
        codigo2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor2 = sc.nextFloat();

        System.out.printf("Valor a pagar: %.2f", (quantidade * valor + quantidade2 * valor2));
        sc.close();
    }
}
