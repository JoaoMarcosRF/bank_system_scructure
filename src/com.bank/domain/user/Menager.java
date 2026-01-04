package com.bank.domain.user;

import com.bank.domain.agency.Agency;
import com.bank.domain.shared.User;
import java.time.LocalDate;

public non-sealed class  Menager extends User {

    double salary;


    public Menager(String name, String cpf, String password, LocalDate birthDate, double salary){
        super(name, cpf, password, birthDate);
        super.setAgency(null);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
