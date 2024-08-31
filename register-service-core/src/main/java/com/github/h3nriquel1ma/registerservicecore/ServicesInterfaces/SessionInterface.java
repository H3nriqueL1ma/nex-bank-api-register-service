package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public interface SessionInterface {
    void createSession(String sessionId, Object data);
    Object getDataSession(String sessionId);
    void invalidateSession(String sessionId);
    void createAttributeSession(String attributeId, Object data);
    Object getAttributeSession(String attributeId);
    HttpSession getSession(Boolean state, HttpServletRequest request);
}
