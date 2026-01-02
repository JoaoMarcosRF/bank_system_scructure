package com.bank.infrastructure;

public class CPFValidator {
    public static boolean isValid(String cpf){
        return cpf.length() == 11;
    }
}
