package com.github.h3nriquel1ma.registerserviceapi.Filters;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session.HttpSessionInterface;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session.HttpSessionVerifyInterface;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Utils.LogInterface;
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

    private final HttpSessionVerifyInterface httpSessionVerifyService;
    private final LogInterface loggerService;

    @Autowired
    public SessionFilter(HttpSessionVerifyInterface httpSessionVerifyService,
                         LogInterface loggerService) {
        this.httpSessionVerifyService = httpSessionVerifyService;
        this.loggerService = loggerService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final Logger logger = loggerService.getLogger(SessionFilter.class.getName());

        HttpSession session = request.getSession(false);

        if (httpSessionVerifyService.isNullSession(session)) {
            logger.warning("Null session!");
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }

        filterChain.doFilter(request, response);
    }
}
