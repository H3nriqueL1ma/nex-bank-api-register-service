package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces;

import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;

public interface UserValidatorInterface {
    Boolean isValid(RegisterUserClientDTO request);
}
