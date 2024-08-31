package com.github.h3nriquel1ma.registerserviceservices.Services.Session;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

@Service
public class HttpSessionService {
    public Boolean isNullSession(HttpSession session) {
        return session == null;
    }
}
