package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session;

public interface DataSessionInterface<T> extends SessionInterface {
    void createDataSession(String sessionId, T data);
}
