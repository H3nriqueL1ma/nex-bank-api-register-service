package com.github.h3nriquel1ma.registerserviceservices.Services.Validation;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Validation.ValidatorInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Serviço geral de validação de cliente.
@Service
public class ClientValidatorRequestService {

    private final ValidatorInterface<String> emailValidatorService;
    private final ValidatorInterface<String> phoneNumberValidatorService;
    private final ValidatorInterface<RegisterClientDTO> emptyAttributesValidatorService;
    private final ValidatorInterface<RegisterClientDTO> checkValueValidatorService;

    @Autowired
    public ClientValidatorRequestService(ValidatorInterface<String> emailValidatorService,
                                         ValidatorInterface<String> phoneNumberValidatorService,
                                         ValidatorInterface<RegisterClientDTO> emptyAttributesValidatorService,
                                         ValidatorInterface<RegisterClientDTO> checkValueValidatorService) {
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
