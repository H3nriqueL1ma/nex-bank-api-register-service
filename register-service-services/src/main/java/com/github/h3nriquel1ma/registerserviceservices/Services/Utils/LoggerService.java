package com.github.h3nriquel1ma.registerserviceservices.Services.Utils;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class LoggerService {

    public static Logger getLoggerUtil(String className) {
        return Logger.getLogger(className);
    };
}
