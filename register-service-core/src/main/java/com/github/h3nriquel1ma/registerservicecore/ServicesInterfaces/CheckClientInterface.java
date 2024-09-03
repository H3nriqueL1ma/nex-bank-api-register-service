package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces;

// Interface para checar a existência de um cliente, checando por CPF, Email e Telefone que já estão criptografados no banco (Por isso o 'hashed').
public interface CheckClientInterface {
    Boolean check(String hashedCPF, String hashedEmail, String hashedPhone);
}
