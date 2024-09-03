package com.github.h3nriquel1ma.registerserviceservices.Services.Validation;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.UserValidatorInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientValidatorUserService {

    private final UserValidatorInterface emptyAttributesUserValidatorService;

    @Autowired
    public ClientValidatorUserService(UserValidatorInterface emptyAttributesUserValidatorService) {
        this.emptyAttributesUserValidatorService = emptyAttributesUserValidatorService;
    }

    public Boolean isValidUserData(RegisterUserClientDTO request) {
        if (request == null) {
            return false;
        }

        return emptyAttributesUserValidatorService.isValid(request);
    }
}
