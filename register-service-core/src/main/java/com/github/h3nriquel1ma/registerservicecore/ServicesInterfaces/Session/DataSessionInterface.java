package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session;

public interface DataSessionInterface<T> {
    void createSession(String sessionId, T data);
    T getDataSession(String sessionId);
    void invalidateSession(String sessionId);
}
