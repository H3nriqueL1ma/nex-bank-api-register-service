package com.github.h3nriquel1ma.registerserviceservices.Services.Query.SubServices;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Hashing.DualHashInterface;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Validation.CheckInterface;
import com.github.h3nriquel1ma.registerservicecore.Query.VerifyInterface;
import com.github.h3nriquel1ma.registerserviceservices.Services.Hashing.HashingService;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Serviço de verificação de dados de Usuário.
@Service
public class ClientUserDataService implements VerifyInterface<RegisterUserClientDTO> {

    private final CheckInterface<String> checkClientUserExistenceService;
    private final DualHashInterface hashingService;

    @Autowired
    public ClientUserDataService(CheckInterface<String> checkClientUserExistenceService,
                                 DualHashInterface hashingService) {
        this.checkClientUserExistenceService = checkClientUserExistenceService;
        this.hashingService = hashingService;
    }

    @Override
    public Boolean isExisting(RegisterUserClientDTO request) {
        return checkClientUserExistenceService.check(
                hashingService.hash(request.getNome_usuario()),
                hashingService.hash_(request.getSenha_usuario())
        );
    }
}
