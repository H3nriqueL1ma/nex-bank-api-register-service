package com.github.h3nriquel1ma.registerservicecore.Query;

// Interface para verificação de dados gerais do cliente no banco.
public interface VerifyInterface<T> {
    Boolean isExisting(T request);
}
