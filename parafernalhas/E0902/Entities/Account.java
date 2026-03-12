package parafernalhas.E0902.Entities;

import parafernalhas.E0902.Exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) throws DomainException {
        if (amount > getWithdrawLimit()) {
            throw new DomainException("Insufficient withdraw limit");
        }
        if (this.balance - amount < 0) {
            throw new DomainException("Insufficient balance");
        }
        this.balance -= amount;
        System.out.printf("Withdrew R$%.2f, new balance: R$%.2f", amount, this.balance);
    }

}
