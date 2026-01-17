/*  Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo

Renda                           Imposto de Renda
de 0.00 a R$2000.00             Isento
de R$2000.01 a R$3000.00        8%
de R$3000.01 a R$4500.00        18%
acima de 4500.00                28% */

import java.util.Scanner;

public class Ex0208 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double renda, resultado;
        renda = sc.nextDouble();
        if (renda > 4500.00){
            resultado = (renda - 4500) * 0.28 + (4500.00 - 3000.01) * 0.18 + (3000.00 - 2000.01) * 0.08;
            System.out.printf("R$%.2f", resultado);
        }else if (renda > 3000){
            resultado = (renda - 3000) * 0.18 + (3000.00 - 2000.01) * 0.08;
            System.out.printf("R$%.2f", resultado);
        }else if (renda > 2000){
            resultado = (renda - 2000) * 0.08;
            System.out.printf("R$%.2f", resultado);
        }else{
            System.out.println("Isento");
        }
    }
}
