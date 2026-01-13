package com.bank.infrastructure;

public class CPFValidator {
    public static boolean isValid(String cpf){
        if(cpf.length() != 11) return false;

        if(cpf == null) return false;

        if(cpf.chars().distinct().count() == 1) return false;

        int[] nums =  new int[11];

        for(int i=0; i<11; i++){
            nums[i] = Character.getNumericValue(cpf.charAt(i));
        }

        int soma1 = 0;
        for (int i = 0; i < 9; i++) {
            soma1 += nums[i] * (10 - i);
        }

        int resto1 = (soma1 * 10) % 11;
        if (resto1 == 10) resto1 = 0;

        if (resto1 != nums[9]) return false;

        int soma2 = 0;
        for (int i = 0; i < 10; i++) {
            soma2 += nums[i] * (11 - i);
        }

        int resto2 = (soma2 * 10) % 11;
        if (resto2 == 10) resto2 = 0;

        return resto2 == nums[10];
    }
}
