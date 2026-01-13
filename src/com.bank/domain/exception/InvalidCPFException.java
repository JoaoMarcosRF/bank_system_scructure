package com.bank.domain.exception;

public class InvalidCPFException extends DomainException {
    public InvalidCPFException(String cpf) {
        super("CPF inválido: "  + cpf);
    }

}
