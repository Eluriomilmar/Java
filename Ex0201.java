import java.util.Scanner;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class Ex0201 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        String resultado;
        numero = sc.nextInt();
        resultado = (numero < 0) ? "Negativo" : "Não negativo";
        System.out.printf(resultado);
        sc.close();
    }
}
