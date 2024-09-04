package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session;

public interface SessionInterface {
    Object getSession(String id);
    void invalidateSession();
}
