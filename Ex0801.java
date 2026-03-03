/*
Uma empresa posui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas
trabalhadas e valor por hora. Funcionários terceirizados possuem aina uma despesa adicional.

O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os
funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.

Faça um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois de
ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import parafernalhas.E0801.Employee;
import parafernalhas.E0801.OutsourcedEmployee;

public class Ex0801 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> lista = new ArrayList<Employee>();

        System.out.printf("Enter the number of employees: ");
        int numEmp = sc.nextInt();

        for (int i = 0; i < numEmp; i++) {
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.printf("Outsourced (Y/N): ");
            sc.nextLine();
            String outS = sc.nextLine();
            System.out.printf("Name: ");
            String name = sc.nextLine();
            System.out.printf("Hours: ");
            int hours = sc.nextInt();
            System.out.printf("Value per hour: ");
            double valPerHour = sc.nextDouble();
            if (outS.equalsIgnoreCase("Y")) {
                System.out.printf("Additional charge: ");
                double addCharge = sc.nextDouble();
                lista.add(new OutsourcedEmployee(name, hours, valPerHour, addCharge));
            } else {
                lista.add(new Employee(name, hours, valPerHour));
            }
        }
        System.out.println("");
        System.out.println("PAYMENTS: ");
        for (Employee emp : lista) {
            System.out.println(emp.getName() + " -  $" + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }

}
