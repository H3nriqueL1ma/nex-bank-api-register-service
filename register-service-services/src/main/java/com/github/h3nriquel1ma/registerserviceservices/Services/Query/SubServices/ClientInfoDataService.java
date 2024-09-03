package com.github.h3nriquel1ma.registerserviceservices.Services.Query.SubServices;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Validation.CheckInterface;
import com.github.h3nriquel1ma.registerservicecore.Query.VerifyInterface;
import com.github.h3nriquel1ma.registerserviceservices.Services.Hashing.HashingService;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Serviço de verificação de clientes criptografando os dados.
@Service
public class ClientInfoDataService implements VerifyInterface<RegisterClientDTO> {

    private final CheckInterface<String> checkClientExistenceService;
    private final HashingService hashingService;

    @Autowired
    public ClientInfoDataService(CheckInterface<String> checkClientExistenceService,
                                 HashingService hashingService) {
        this.checkClientExistenceService = checkClientExistenceService;
        this.hashingService = hashingService;
    }

    @Override
    public Boolean verifyData(RegisterClientDTO request) {
        return checkClientExistenceService.check(
                hashingService.hashData(request.getCPF_cliente()),
                hashingService.hashData(request.getEmail_cliente()),
                hashingService.hashData(request.getCelular_cliente())
        );
    }
}
