package com.github.h3nriquel1ma.registerserviceservices.Services.Utils;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.LogInterface;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

// Serviço de retorno do serviço de Logger.
@Service
public class LoggerService implements LogInterface {

    @Override
    public Logger getLogger(String className) {
        return Logger.getLogger(className);
    }
}
