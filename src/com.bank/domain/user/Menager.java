package com.bank.domain.user;

import java.math.BigDecimal;
import java.time.LocalDate;

public non-sealed class  Menager extends User {

    BigDecimal salary;


    public Menager(String name, String cpf, String password, LocalDate birthDate, BigDecimal salary){
        super(name, cpf, password, birthDate);
        super.setAgency(null);
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
