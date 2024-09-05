package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session;

// Interface para criação de sessão de dados genericos.
public interface DataSessionInterface<T> extends SessionInterface {
    void createDataSession(String sessionId, T data);
}
