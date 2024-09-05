package com.github.h3nriquel1ma.registerserviceservices.Services.Session;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session.HttpSessionVerifyInterface;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

// Serviço de verificação de nulo de sessão.
@Service
public class HttpSessionVerifyService implements HttpSessionVerifyInterface {

    @Override
    public Boolean isNullSession(HttpSession session) {
        return session == null;
    }
}
