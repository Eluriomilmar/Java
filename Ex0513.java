/*
Fazer um programa para ler um número inteiro N e depois os dados(id, nome e salário) de N funcionários. Não deve haver
repetição de id.

Em seguida, efetuar o aumento de X porcento no salário de um determinado funcionário. Para isso, o programa deve ler um
id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem
atualizada dos funcionários.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import parafernalhas.E0513;

public class Ex0513 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira a quantidade de funcionários a serem inseridos: ");
        int qtd = sc.nextInt();
        List<E0513> lista = new ArrayList<>();


        for (int i = 0 ; i < qtd ; i++) {
            System.out.printf("Insira o nome e salário do funcionário, seu id será %d.%n", i);
            sc.nextLine();
            System.out.printf("Nome: ");
            String nome = sc.nextLine();
            System.out.printf("Salário: ");
            double salario = sc.nextDouble();
            E0513 funcionario = new E0513(i, nome, salario);
            lista.add(funcionario);
        }

        System.out.printf("Insira id do usuário a receber aumento: ");
        int id_aumento = sc.nextInt();
        System.out.printf("Insira o percentual do aumento do usuário: ");
        double aumento = sc.nextDouble();


        for (E0513 emp : lista) {
            System.out.println(emp);
            if (emp.getId() == id_aumento) {
                emp.aumentaSalarioPorcentagem(aumento);
            }
        }
        for (E0513 emp : lista) {
            System.out.println(emp.toString());
        }


    }
}
