package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session;

import jakarta.servlet.http.HttpSession;

// Interface para verificação de nulo da sessão.
public interface HttpSessionVerifyInterface {
    Boolean isNullSession(HttpSession session);
}
