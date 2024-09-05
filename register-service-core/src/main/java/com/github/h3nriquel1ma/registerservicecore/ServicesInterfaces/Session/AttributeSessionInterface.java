package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session;

// Interface para criação de sessão de atributos genericos.
public interface AttributeSessionInterface<T> extends SessionInterface, VerifyInterface<T> {
    void createAttributeSession(String attributeId, T data);
}
