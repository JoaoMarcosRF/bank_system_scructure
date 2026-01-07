package com.bank.domain.user;

import com.bank.domain.agency.Agency;

import java.time.LocalDate;

public non-sealed class Admin extends User {

    Admin(String name, String cpf, String password, LocalDate birthDate){
        super(name, cpf, password, birthDate);
    }
}
