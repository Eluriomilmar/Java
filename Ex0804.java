import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import parafernalhas.E0804.PessoaFisica;
import parafernalhas.E0804.PessoaJuridica;
import parafernalhas.E0804.Contribuinte;

public class Ex0804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Contribuinte> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (I/C): ");
            char ch = sc.next().toUpperCase().charAt(0);
            if (ch == 'I') {
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Annual income: ");
                double annualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new PessoaFisica(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Annual income: ");
                double annualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new PessoaJuridica(name, annualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (Contribuinte cont : list) {
            System.out.println(cont.getNome() + ": $" + String.format("%.2f", cont.imposto()));
        }

        sc.close();
    }
}
