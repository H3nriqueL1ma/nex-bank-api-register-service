package com.github.h3nriquel1ma.registerserviceservices.Services.Validation;

import com.github.h3nriquel1ma.registerserviceapi.DTO.RegisterClientDTO;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.RequestValidatorInterface;
import org.springframework.stereotype.Service;

@Service
public class EmptyAttributesValidatorService implements RequestValidatorInterface {

    @Override
    public Boolean isValid(RegisterClientDTO request) {
        return request.getCPF_cliente().isEmpty() ||
                request.getEmail_cliente().isEmpty() ||
                request.getCelular_cliente().isEmpty() ||
                request.getNome_cliente().isEmpty() ||
                request.getData_nascimento_cliente().isEmpty();
    }
}
