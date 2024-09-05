package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session;

// Interface para retorno da sessão e invalidação da sessão.
public interface SessionInterface {
    Object getSession(String id);
    void invalidateSession(String id);
}
