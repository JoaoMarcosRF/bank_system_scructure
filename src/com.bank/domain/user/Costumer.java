package com.bank.domain.user;

import java.time.LocalDate;

public non-sealed class Costumer extends User {

    private double totalBalance;
    private AccountType accountType;

    public Costumer(Agency agency, String name, String cpf, String password, LocalDate birthDate, double totalBalance, AccountType accountType) {
        super(agency, name, cpf, password, birthDate);
        this.totalBalance = totalBalance;
        this.accountType = accountType;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
