package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces;

import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;

// Interface para verificação de dados gerais do cliente no banco.
public interface VerifyInterface {
    Boolean verifyInfoData(RegisterClientDTO request);
}
