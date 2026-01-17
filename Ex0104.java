import java.util.Scanner;

public class Ex0104 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int func, horas;
        float valor;
        func = sc.nextInt();
        horas = sc.nextInt();
        valor = sc.nextFloat();

        sc.close();

        System.out.printf("Número do funcionário: %d%nHoras trabalhadas: %d%n" +
                "Valor da hora trabalhada: %.2f%nSalário: %.2f", func, horas, valor, horas*valor);
    }
}
