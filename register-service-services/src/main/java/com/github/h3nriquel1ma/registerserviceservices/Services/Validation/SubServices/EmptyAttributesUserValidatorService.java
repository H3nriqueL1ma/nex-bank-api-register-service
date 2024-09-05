package com.github.h3nriquel1ma.registerserviceservices.Services.Validation.SubServices;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Validation.ValidatorInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;
import org.springframework.stereotype.Service;

// Serviço de validação para verificar atributos vazios de usuário na requisição.
@Service
public class EmptyAttributesUserValidatorService implements ValidatorInterface<RegisterUserClientDTO> {

    @Override
    public Boolean isValid(RegisterUserClientDTO request) {
        return !request.getNome_usuario().isEmpty() || !request.getSenha_usuario().isEmpty();
    }
}
