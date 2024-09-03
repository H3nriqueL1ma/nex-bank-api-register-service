package com.github.h3nriquel1ma.registerserviceservices.Services.Validation.SubServices;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.RequestValidatorInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;
import org.springframework.stereotype.Service;

// Serviço de validação do Check Value de políticas de privacidade.
@Service
public class CheckValueValidatorService implements RequestValidatorInterface {

    @Override
    public Boolean isValid(RegisterClientDTO request) {
        return request.getCheck_value();
    }
}
