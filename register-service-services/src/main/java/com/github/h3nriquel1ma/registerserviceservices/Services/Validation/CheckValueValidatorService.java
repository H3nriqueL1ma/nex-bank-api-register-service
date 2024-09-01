package com.github.h3nriquel1ma.registerserviceservices.Services.Validation;

import com.github.h3nriquel1ma.registerserviceapi.DTO.RegisterClientDTO;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.RequestValidatorInterface;
import org.springframework.stereotype.Service;

@Service
public class CheckValueValidatorService implements RequestValidatorInterface {

    @Override
    public Boolean isValid(RegisterClientDTO request) {
        return request.getCheck_value();
    }
}
