package com.bank.domain.agency;

import com.bank.domain.user.Costumer;
import com.bank.domain.user.Employee;
import com.bank.domain.user.Menager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Agency {
    private static int genId = 0;

    private final int id;
    private String agencyName;
    private String address;
    private LocalDateTime creatAt;
    private String creatAtFormated;

    private Menager unitManeger;


    private ArrayList<Employee> Employees = new ArrayList<>();

    private ArrayList<Costumer> costumers = new ArrayList<>();
    private double totalBalance;

    public Agency(Menager unitManager, String agencyName, String address) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        genId++;
        this.id = genId;

        this.unitManeger = unitManager;

        this.creatAt = LocalDateTime.now();
        creatAtFormated =  dtf.format(LocalDateTime.now());

        this.agencyName = agencyName;
        this.address = address;
    }

    public void addCostumers(Costumer costumer){
        users.add(costumer);
    }

    public void addEmployees(Employee employee){
        Employees.add(employee);
    }

    @Override
    public String toString() {
        return "id: " + id + ",\nagencyName: " + agencyName + ",\naddress: " + address + "\ncreatAtFormated: " + creatAtFormated + "\nList of costumers: " + costumers;
    }
}
