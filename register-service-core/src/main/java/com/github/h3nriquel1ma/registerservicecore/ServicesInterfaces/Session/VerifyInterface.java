package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session;

// Interface genérica para verificação de dados.
public interface VerifyInterface<T> {
    Boolean verify(T data);
}
