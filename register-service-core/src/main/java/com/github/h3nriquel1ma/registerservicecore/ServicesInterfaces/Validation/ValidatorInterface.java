package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Validation;

// Interface de validação genérica.
public interface ValidatorInterface<T> {
    Boolean isValid(T value);
}
