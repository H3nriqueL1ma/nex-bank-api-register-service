package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Validation;

// Interface para checar a existência de um cliente, checando por CPF, Email e Telefone que já estão criptografados no banco (Por isso o 'hashed').
public interface CheckInterface<T> {
    Boolean check(T... parameters);
}
