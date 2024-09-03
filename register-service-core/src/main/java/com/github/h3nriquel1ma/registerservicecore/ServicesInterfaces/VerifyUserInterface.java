package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces;

import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;

// Interface para verificação de dados de Usuario do cliente no banco.
public interface VerifyUserInterface {
    Boolean verifyUserData(RegisterUserClientDTO request);
}
