package com.github.h3nriquel1ma.registerservicecore.Query;

// Interface para verificação de dados de usuário e registro do cliente no banco.
public interface DualVerifyInterface<T, U> extends VerifyInterface<T> {
    Boolean isExisting_(U request);
}
