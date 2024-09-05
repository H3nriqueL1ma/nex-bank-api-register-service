package com.github.h3nriquel1ma.registerserviceservices.Services.Session;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session.HttpSessionInterface;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

// Serviço de provedor de sessão com base em Servlet Request.
@Service
public class HttpSessionProviderService implements HttpSessionInterface {

    @Override
    public HttpSession getSession(Boolean state, HttpServletRequest request) {
        return request.getSession(state);
    }
}
