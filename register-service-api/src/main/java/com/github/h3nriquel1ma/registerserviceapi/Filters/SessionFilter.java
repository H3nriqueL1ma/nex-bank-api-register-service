package com.github.h3nriquel1ma.registerserviceapi.Filters;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.LogInterface;
import com.github.h3nriquel1ma.registerserviceservices.Services.Session.HttpSessionService;
import com.github.h3nriquel1ma.registerserviceservices.Services.Utils.LoggerService;
import io.micrometer.common.lang.NonNullApi;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.logging.Logger;


// Filtro de Sessão para verificar se a sessão é nula antes de prosseguir para a rota de registro.
@Component
@NonNullApi
@Order(1)
public class SessionFilter extends OncePerRequestFilter {

    private final HttpSessionService httpSessionService;
    private final LogInterface loggerService;

    @Autowired
    public SessionFilter(HttpSessionService httpSessionService,
                         LogInterface loggerService) {
        this.httpSessionService = httpSessionService;
        this.loggerService = loggerService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final Logger logger = loggerService.getLogger(SessionFilter.class.getName());

        HttpSession session = request.getSession(false);

        if (httpSessionService.isNullSession(session)) {
            logger.warning("Null session!");
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }

        filterChain.doFilter(request, response);
    }
}
