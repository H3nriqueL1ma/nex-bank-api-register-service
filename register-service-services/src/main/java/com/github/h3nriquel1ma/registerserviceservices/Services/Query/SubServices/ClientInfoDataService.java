package com.github.h3nriquel1ma.registerserviceservices.Services.Query.SubServices;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Hashing.DualHashInterface;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Validation.CheckInterface;
import com.github.h3nriquel1ma.registerservicecore.Query.VerifyInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Serviço de verificação de clientes criptografando os dados.
@Service
public class ClientInfoDataService implements VerifyInterface<RegisterClientDTO> {

    private final CheckInterface<String> checkClientExistenceService;
    private final DualHashInterface hashingService;

    @Autowired
    public ClientInfoDataService(CheckInterface<String> checkClientExistenceService,
                                 DualHashInterface hashingService) {
        this.checkClientExistenceService = checkClientExistenceService;
        this.hashingService = hashingService;
    }

    @Override
    public Boolean isExisting(RegisterClientDTO request) {
        return checkClientExistenceService.check(
                hashingService.hash(request.getCpf_cliente()),
                hashingService.hash(request.getEmail_cliente()),
                hashingService.hash(request.getCelular_cliente())
        );
    }
}
