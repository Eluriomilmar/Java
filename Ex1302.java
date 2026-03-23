/*
Uma empresa deseja automatizar o processamento de seus contratos. O processamento de um contrato consiste em gerar as
parcelas a serem pagas para aquele contrato, com base no número de meses desejado.

A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas. Os serviços de pagamento online
tipicamente cobram um juro mensal, bem cc omo uma taxa por pagamento. Por enquanto, o serviço contratado pela empresa é
o PayPal, que aplica juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.

Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato e valor total do contrato). Em
seguida, o programa deve ler o número de meses para parcelamento do contrato, e daí gerar os registros de parcelas a
serem pagas(data e valor), sendo a primeira parcela a ser paga um mês após a data do contrato, a seguda parcela dois
meses após o contrato e por aí em diante. Mostrar os dados das parcelas na tela.
 */

import parafernalhas.E1302.Contract;
import parafernalhas.E1302.ContractService;
import parafernalhas.E1302.Installment;
import parafernalhas.E1302.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex1302 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int installments = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, installments);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }


        sc.close();
    }
}
