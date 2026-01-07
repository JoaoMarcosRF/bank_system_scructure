package com.bank.domain.user;

import com.bank.domain.shared.Shift;

import java.time.LocalDate;

public non-sealed class Employee extends User {

    private double salary;
    private Role role;
    private Shift shift;

    public Employee(String name, String cpf, String password, LocalDate birthDate, double salary, Shift shift, Role role) {
        super(name, cpf, password, birthDate);
        super.setAgency(null);
        this.salary = salary;
        this.shift = shift;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
