package com.github.h3nriquel1ma.registerserviceservices.Services.Session;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session.DataSessionInterface;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

// Serviços de sessões para dados em objeto.
@Service
public class DataSessionService implements DataSessionInterface<Object> {

    private final HttpSession session;

    public DataSessionService(HttpSession session) {
        this.session = session;
    }

    @Override
    public void createDataSession(String sessionId, Object data) {
        session.setAttribute(sessionId, data);
    }

    @Override
    public Object getSession(String sessionId) {
        return session.getAttribute(sessionId);
    }

    @Override
    public void invalidateSession(String id) {
        session.removeAttribute(id);
    }

    @Override
    public Boolean verify(Object data) {
        return data == null;
    }
}
