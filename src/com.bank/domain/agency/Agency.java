package com.bank.domain.agency;

import com.bank.domain.user.Costumer;
import com.bank.domain.user.Employee;
import com.bank.domain.user.Menager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class Agency implements IAgency {
    private static int genId = 0;

    private final int id;
    private String agencyName;
    private String address;
    private LocalDateTime creatAt;
    private String creatAtFormated;

    private Menager unitMenager;


    private Set<Employee> employees = new HashSet<>();

    private Set<Costumer> costumers = new HashSet<>();

    private double totalBalance;

    public Agency(String agencyName, String address) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        genId++;
        this.id = genId;

        this.unitMenager = null;

        this.creatAt = LocalDateTime.now();
        creatAtFormated =  dtf.format(LocalDateTime.now());

        this.agencyName = agencyName;
        this.address = address;
    }

    @Override
    public void addCostumer(Costumer costumer){costumers.add(costumer);}

    @Override
    public void removeCostumer(Costumer costumer) {costumers.remove(costumer);}

    @Override
    public void addEmployee(Employee employee){employees.add(employee);}

    @Override
    public void removeEmployee(Employee employee) {employees.remove(employee);}

    @Override
    public void setUnitMenager(Menager menager) {unitMenager = menager;}

    @Override
    public void removeUnitMenager() {unitMenager = null;}

    @Override
    public String toString() {
        return "id: " + id + ",\nagencyName: " + agencyName + ",\naddress: " + address + "\ncreatAtFormated: " + creatAtFormated + "\nList of costumers: " + costumers;
    }


}
