package com.github.h3nriquel1ma.registerserviceservices.Services.Validation;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Validation.ValidatorInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Serviço de validação de dados de usuário do cliente.
@Service
public class ClientValidatorUserService implements ValidatorInterface<RegisterUserClientDTO> {

    private final ValidatorInterface<RegisterUserClientDTO> emptyAttributesUserValidatorService;

    @Autowired
    public ClientValidatorUserService(ValidatorInterface<RegisterUserClientDTO> emptyAttributesUserValidatorService) {
        this.emptyAttributesUserValidatorService = emptyAttributesUserValidatorService;
    }

    @Override
    public Boolean isValid(RegisterUserClientDTO request) {
        if (request == null) {
            return false;
        }

        return emptyAttributesUserValidatorService.isValid(request);
    }
}
