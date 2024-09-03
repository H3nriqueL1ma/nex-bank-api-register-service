package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces;

import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;

// Interface para validar a requisição de registro de dados gerais do cliente.
public interface RequestValidatorInterface {
    Boolean isValid(RegisterClientDTO request);
}
