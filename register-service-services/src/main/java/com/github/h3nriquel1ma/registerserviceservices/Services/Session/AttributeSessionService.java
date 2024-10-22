package com.github.h3nriquel1ma.registerserviceservices.Services.Session;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session.AttributeSessionInterface;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

// Serviço de sessões para atributos.
@Service
public class AttributeSessionService implements AttributeSessionInterface<String> {

    private final HttpSession session;

    public AttributeSessionService(HttpSession session) {
        this.session = session;
    }

    @Override
    public void createAttributeSession(String attributeId, String data) {
        session.setAttribute(attributeId, data);
    }

    @Override
    public Object getSession(String attributeId) {
        return session.getAttribute(attributeId);
    }

    @Override
    public void invalidateSession(String id) {
        session.removeAttribute(id);
    }

    @Override
    public Boolean verify(String data) {
        return data == null;
    }
}
