package com.bank.api;

import com.bank.domain.agency.Agency;
import com.bank.domain.user.User;

import java.time.LocalDate;

public class AppBank {
    public static void main(String[] args) {
        Agency agency = new Agency("Bank", "Rua ABC, numero 123");

        User user1 = new User(agency, "Pedro", "11111111111","senha123", LocalDate.of(2007, 2, 18));
        User user2 = new User(agency, "Mauricio", "22222222222","senha321", LocalDate.of(1978, 8, 27));

        agency.addUsers(user1);
        agency.addUsers(user2);

        System.out.print(agency);
    }
}
