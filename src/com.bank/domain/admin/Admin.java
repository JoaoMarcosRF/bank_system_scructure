package com.bank.domain.admin;

import com.bank.domain.agency.Agency;
import com.bank.domain.shared.User;

import java.time.LocalDate;

public non-sealed class Admin extends User {

    Admin(Agency agency, String name, String cpf, String password, LocalDate birthDate){
        super(agency, name, cpf, password, birthDate);
    }
}
