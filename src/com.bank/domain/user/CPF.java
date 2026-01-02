package com.bank.domain.user;

import com.bank.infrastructure.CPFValidator;

public final class CPF {

    private String value;

    public CPF(String value){
        if (!CPFValidator.isValid(value)){
            throw new IllegalArgumentException("com.bank.domain.user.CPF invalido");
        }
        this.value = value;
    }

    @Override
    public String toString(){
        //111.111.111-1 1
        //012 345 678 910
        return (String)value.substring(0, 3) + "." + (String)value.substring(3, 6) + "." + (String)value.substring(6, 9) +  "-" + (String)value.substring(9, 11);
    }

    @Override
    public boolean equals(Object o){
        return(o instanceof CPF other)
                && value.equals(other.value);
    }

    //lembra de fazer nessa bomba aq.
    /*
    @Override
    public int hashCode() {

    }
     */
}
