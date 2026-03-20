/*
Uma locadora brasileira de carros cobra um valor por hora para locações de até 12 horas. Porém, se a duração da locação
ultrapassar 12 horas, a locação será cobrada com base em um valor diário. Além do valor da locação, é acrescido no preço
o valor do imposto conforme regras do país que, no caso do Brasil, é 20% para valores até 100.00, ou 15% para valores
acima de 100.00. Fazer um programa que lê os dados da locação(modelo do carro, instante inicial e final da locação), bem
como o valor por hora e o valor diário de locação. O programa deve então gerar a nota de pagamento (contendo valor da
locação, valor do imposto e valor total do pgamento) e informar os dados na tela.
 */


import parafernalhas.E1301.BrazilTaxService;
import parafernalhas.E1301.CarRental;
import parafernalhas.E1301.RentalService;
import parafernalhas.E1301.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex1301 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        try {
            System.out.println("Entre com os dados do aluguel");
            System.out.print("Modelo do carro: ");
            String carModel = sc.nextLine();
            System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
            LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
            System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
            LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

            CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

            System.out.print("Entre com o preço por hora: ");
            double pricePerHour = sc.nextDouble();
            System.out.print("Entre com o preço por dia: ");
            double pricePerDay = sc.nextDouble();

            RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

            rentalService.processInvoice(cr);

            System.out.println("FATURA:");
            System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
            System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
            System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        }
        catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
