package com.bank.domain.user;

import com.bank.domain.agency.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public sealed abstract class User
        implements IUser
        permits Costumer, Employee, Menager, Admin {

    private static int generateId = 0;

    private Agency agency;
    private final int id;
    private String name;
    private CPF cpf;
    private String password;
    private LocalDate birthDate;
    private String birthDateFormated;

    public User(String name, String cpf, String password, LocalDate birthDate) {
        generateId++;

        this.id = generateId;
        this.agency = null;

        this.name = name;
        this.cpf = new CPF(cpf);
        this.password = password;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birthDate = birthDate;

        birthDateFormated = dtf.format(birthDate);
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CPF getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "userId: " + id + " userName: " + name + " cpf: " + cpf + " birthDate: " + birthDateFormated;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof User other) &&  this.id == other.id;
    }
}
