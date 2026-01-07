package com.bank.domain.user;

import java.math.BigDecimal;
import java.time.LocalDate;

public non-sealed class Costumer extends User {

    private BigDecimal totalBalance;
    private AccountType accountType;

    public Costumer(String name, String cpf, String password, LocalDate birthDate, BigDecimal totalBalance, AccountType accountType) {
        super(name, cpf, password, birthDate);
        super.setAgency(null);
        this.totalBalance = totalBalance;
        this.accountType = accountType;
    }

    public BigDecimal getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(BigDecimal totalBalance) {
        this.totalBalance = totalBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
