package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces;

import com.github.h3nriquel1ma.registerserviceapi.DTO.RegisterClientDTO;

public interface RequestValidatorInterface {
    Boolean isValid(RegisterClientDTO request);
}
