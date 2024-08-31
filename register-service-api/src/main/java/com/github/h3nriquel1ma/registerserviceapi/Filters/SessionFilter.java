package com.github.h3nriquel1ma.registerserviceapi.Filters;

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
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.logging.Logger;

@NonNullApi
@Order(1)
public class SessionFilter extends OncePerRequestFilter {

    private final HttpSessionService httpSessionService;
    @Autowired
    public SessionFilter(LoggerService loggerService, HttpSessionService httpSessionService) {
        this.httpSessionService = httpSessionService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final Logger logger = LoggerService.getLoggerUtil(SessionFilter.class.getName());

        HttpSession session = request.getSession(false);

        if (httpSessionService.isNullSession(session)) {
            logger.warning("Null session!");
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }

        filterChain.doFilter(request, response);
    }
}
