package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

// Interface para retorno de sessão baseado na requisição Servlet.
public interface HttpSessionInterface {
    HttpSession getSession(Boolean state, HttpServletRequest request);
}
