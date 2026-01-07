package com.bank.domain.agency;

import com.bank.domain.user.Costumer;
import com.bank.domain.user.Employee;
import com.bank.domain.user.Menager;

public interface IAgency {
    public void addCostumer(Costumer costumer);
    public void removeCostumer(Costumer costumer);

    public void addEmployee(Employee employee);
    public void removeEmployee(Employee employee);

    public void setUnitMenager(Menager menager);
    public void removeUnitMenager();
}
