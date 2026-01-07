package com.bank.api;


import com.bank.domain.agency.Agency;
import com.bank.domain.shared.Shift;
import com.bank.domain.user.*;


import java.time.LocalDate;

public class AppBank {
    public static void main(String[] args) {


        Agency agency = new Agency("Bank", "Rua ABC, numero 123");

        Employee employee = new Employee("Pedro", "11111111111","senha123", LocalDate.of(2007, 2, 18), 10.00, Shift.MORNING, Role.PREMENAGER);
        Costumer costumer = new Costumer("Mauricio", "22222222222","senha321", LocalDate.of(1978, 8, 27), 100.00, AccountType.CHECKING);
        Menager menager = new Menager("Rodoufo", "33333333333", "senha231", LocalDate.of(1999, 11, 23), 3000.50);

        agency.addEmployee(employee);
        agency.addCostumer(costumer);

        System.out.println(agency);
        System.out.println(employee);
        System.out.println(costumer);
        System.out.println(menager);
    }
}
