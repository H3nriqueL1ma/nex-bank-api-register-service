package com.github.h3nriquel1ma.registerserviceservices.Services.Session;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session.AttributeSessionInterface;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session.DataSessionInterface;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session.HttpSessionInterface;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HttpSessionService implements HttpSessionInterface, DataSessionInterface<Object>, AttributeSessionInterface<String, Object> {
    private final HttpSession session;

    @Autowired
    public HttpSessionService(HttpSession session) {
        this.session = session;
    }

    public Boolean isNullSession(HttpSession session) {
        return session == null;
    }

    @Override
    public void createSession(String sessionId, Object data) {
        session.setAttribute(sessionId, data);
    }

    @Override
    public Object getDataSession(String sessionId) {
        return null;
    }

    @Override
    public void invalidateSession(String sessionId) {

    }

    @Override
    public void createAttributeSession(String attributeId, String data) {
        session.setAttribute(attributeId, data);
    }

    @Override
    public Object getAttributeSession(String attributeId) {
        return session.getAttribute(attributeId);
    }

    @Override
    public void invalidateAttributeSession(String attributeId) {

    }

    @Override
    public HttpSession getSession(Boolean state, HttpServletRequest request) {
        return null;
    }
}
