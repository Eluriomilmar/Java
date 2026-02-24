/*
Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar do usuário um mês e mostrar
qual foi o salário do funcionário nesse mês.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import parafernalhas.E0701.NivelTrabalhador;
import parafernalhas.E0701.ContratoHora;
import parafernalhas.E0701.Departamento;
import parafernalhas.E0701.Trabalhador;

public class Ex0701 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Entre com o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.printf("Entre com o nome do trabalhador: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.printf("Entre com o nível do trabalhador: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.printf("Entre com o salário base do trabalhador: ");
        Double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));

        System.out.printf("Insira quantos contratos o trabalhador possui: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Entre com os dados contrato de número %d.%n", i + 1);
            System.out.printf("Entre com a data (DD/MM/YYYY): ");
            Date data = sdf.parse(sc.next());
            System.out.printf("Insira o valor por hora do contrato: ");
            double valorPorHora = sc.nextDouble();
            System.out.printf("Insira a duração do contrato em horas: ");
            int horas = sc.nextInt();
            ContratoHora contrato = new ContratoHora(data, valorPorHora, horas);
            trabalhador.adicionaContrato(contrato);
        }

        System.out.printf("%nEntre com o mês e ano para calcular o salário (MM/YYYY): ");
        String anoEMes = sc.next();
        int mes = Integer.parseInt(anoEMes.substring(0,2));
        int ano = Integer.parseInt(anoEMes.substring(3));
        System.out.printf("Nome: %s%nDepartamento: %s%nReceita para %d/%d: %.2f", trabalhador.getNome(),
                trabalhador.getDepartamento().getNome(), mes, ano, trabalhador.receita(ano, mes));


        sc.close();
    }
}
