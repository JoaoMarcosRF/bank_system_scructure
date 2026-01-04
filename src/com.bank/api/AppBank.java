package com.bank.api;


import com.bank.domain.agency.Agency;
import com.bank.domain.user.Costumer;
import com.bank.domain.user.Employee;
import com.bank.domain.user.Menager;


import java.time.LocalDate;

public class AppBank {
    public static void main(String[] args) {


        Agency agency = new Agency( new Menager() ,"Bank", "Rua ABC, numero 123");

        Employee employee = new Employee("Pedro", "11111111111","senha123", LocalDate.of(2007, 2, 18));
        Costumer costumer = new Costumer("Mauricio", "22222222222","senha321", LocalDate.of(1978, 8, 27));

        agency.addEmployee(employee);
        agency.addCostumer(costumer);

        System.out.print(agency);
    }
}
