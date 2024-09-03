package com.github.h3nriquel1ma.registerserviceservices.Services.Validation.SubServices;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.UserValidatorInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;
import org.springframework.stereotype.Service;

@Service
public class EmptyAttributesUserValidatorService implements UserValidatorInterface {

    @Override
    public Boolean isValid(RegisterUserClientDTO request) {
        return !request.getNome_usuario().isEmpty() || !request.getSenha_usuario().isEmpty();
    }
}
