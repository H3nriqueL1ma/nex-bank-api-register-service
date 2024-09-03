package com.github.h3nriquel1ma.registerserviceservices.Services.Validation;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.RequestValidatorInterface;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.ValidatorInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Serviço geral de validação de cliente.
@Service
public class ClientValidatorRequestService {

    private final ValidatorInterface<String> emailValidatorService;
    private final ValidatorInterface<String> phoneNumberValidatorService;
    private final RequestValidatorInterface emptyAttributesValidatorService;
    private final RequestValidatorInterface checkValueValidatorService;

    @Autowired
    public ClientValidatorRequestService(ValidatorInterface<String> emailValidatorService,
                                         ValidatorInterface<String> phoneNumberValidatorService,
                                         RequestValidatorInterface emptyAttributesValidatorService,
                                         RequestValidatorInterface checkValueValidatorService) {
        this.emailValidatorService = emailValidatorService;
        this.phoneNumberValidatorService = phoneNumberValidatorService;
        this.emptyAttributesValidatorService = emptyAttributesValidatorService;
        this.checkValueValidatorService = checkValueValidatorService;
    }

    public Boolean isValidRequestData(RegisterClientDTO request) {
        if (request == null) {
            return false;
        }

        if (!checkValueValidatorService.isValid(request)) {
            return false;
        }

        if (!emptyAttributesValidatorService.isValid(request)) {
            return false;
        }

        if (!emailValidatorService.isValid(request.getEmail_cliente())) {
            return false;
        }

        if (!phoneNumberValidatorService.isValid(request.getCelular_cliente())) {
            return false;
        }

        return true;
    }
}
