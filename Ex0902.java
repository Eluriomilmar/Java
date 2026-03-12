import parafernalhas.E0902.Entities.Account;
import parafernalhas.E0902.Exceptions.DomainException;

import java.util.Scanner;

public class Ex0902 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer num = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double with_lim = sc.nextDouble();

            Account acc = new Account(num, holder, balance, with_lim);

            System.out.print("Enter amount for withdraw: ");
            Double amt = sc.nextDouble();

            acc.withdraw(amt);
        } catch (DomainException e) {
            System.out.printf(e.getMessage());
        }
    }
}
