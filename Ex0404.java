/*
Em um banco, para cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta,
e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto,
é opcional, ou seja: se o titular não tiver dinheiro a ddepositar no momento de abrir sua conta, o depósito inicial
não será feito e o saldo inicial da conta será, naturalmente, zero.

Importante: Uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular
pode ser alterado(pois uma pessoa pode mudar de nome por ocasião de um casamento, por exemplo).

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só
aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de
R$ 5,00. Nota: A conta pode ficar com sado negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.

Você deve faer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de
depósito inicial. Em seguida, realizar um depósto e depois um saque, sempre mostrando os dados da conta após cada operação.
 */

import java.util.Scanner;
import parafernalhas.antes07.ContaBanco;

public class Ex0404 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String titular = sc.nextLine();
        int conta = sc.nextInt();
        float saldo = sc.nextFloat();
        ContaBanco cliente = new ContaBanco(conta, titular, saldo);
        cliente.deposito(1234.56);
        cliente.saque(1234.56);
        System.out.println(cliente.toString());
        sc.close();
    }
}
