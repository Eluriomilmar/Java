/*
Fazer um programa para ler os dados de um funcionário(nome, salário bruto e imposto).
Em seguida, mostrar os dados do funcionário(nome e salário líquido).
Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada(somente o salário bruto é afetado).
Mostrar novamente os dados do funcionário.
 */

import parafernalhas.Empregado;
import java.util.Scanner;

public class Ex0402 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Empregado emp01 = new Empregado();
        System.out.printf("Nome: ");
        emp01.nome = sc.nextLine();
        System.out.printf("Salário bruto: ");
        emp01.SalarioBruto = sc.nextDouble();
        System.out.printf("Impostos: ");
        emp01.imposto = sc.nextDouble();
        System.out.printf("Empregado: %s, Salário líquido: %.2f%n", emp01.nome, emp01.SalarioLiquido());
        System.out.printf("Aumentar o salário em quantos porcento: ");
        double porcento = sc.nextDouble();
        emp01.AumentaSalario(porcento);


    }
}
