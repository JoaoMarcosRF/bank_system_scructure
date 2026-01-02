package com.bank.domain.user;

import java.time.LocalDate;

public non-sealed class Menager extends User {

    double salary;


    public Menager(Agency agency, String name, String cpf, String password, LocalDate birthDate, double salary){
        super(agency, name, cpf, password, birthDate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
