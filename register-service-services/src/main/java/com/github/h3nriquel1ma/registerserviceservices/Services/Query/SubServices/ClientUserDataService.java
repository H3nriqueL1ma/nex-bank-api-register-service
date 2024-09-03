package com.github.h3nriquel1ma.registerserviceservices.Services.Query.SubServices;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.CheckClientUserInterface;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.VerifyUserInterface;
import com.github.h3nriquel1ma.registerserviceservices.Services.Hashing.HashingService;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;
import org.springframework.stereotype.Service;

// Serviço de verificação de dados de Usuário.
@Service
public class ClientUserDataService implements VerifyUserInterface {

    private final CheckClientUserInterface checkClientUserExistenceService;
    private final HashingService hashingService;

    public ClientUserDataService(CheckClientUserInterface checkClientUserExistenceService, HashingService hashingService) {
        this.checkClientUserExistenceService = checkClientUserExistenceService;
        this.hashingService = hashingService;
    }

    @Override
    public Boolean verifyUserData(RegisterUserClientDTO request) {
        return checkClientUserExistenceService.check(
                hashingService.hashData(request.getNome_usuario()),
                hashingService.hashPassword(request.getSenha_usuario())
        );
    }
}
