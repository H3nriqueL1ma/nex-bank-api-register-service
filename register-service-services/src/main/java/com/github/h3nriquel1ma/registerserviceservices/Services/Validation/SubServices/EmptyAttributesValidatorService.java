package com.github.h3nriquel1ma.registerserviceservices.Services.Validation.SubServices;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Validation.ValidatorInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;
import org.springframework.stereotype.Service;

// Serviço de validação para verificar atributos vazios na requisição.
@Service
public class EmptyAttributesValidatorService implements ValidatorInterface<RegisterClientDTO> {

    @Override
    public Boolean isValid(RegisterClientDTO request) {
        return request.getCPF_cliente().isEmpty() ||
                request.getEmail_cliente().isEmpty() ||
                request.getCelular_cliente().isEmpty() ||
                request.getNome_cliente().isEmpty() ||
                request.getData_nascimento_cliente().isEmpty();
    }
}
