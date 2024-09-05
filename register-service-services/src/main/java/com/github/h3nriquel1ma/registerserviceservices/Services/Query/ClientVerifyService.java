package com.github.h3nriquel1ma.registerserviceservices.Services.Query;

import com.github.h3nriquel1ma.registerservicecore.Query.DualVerifyInterface;
import com.github.h3nriquel1ma.registerservicecore.Query.VerifyInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Serviço de verificação de dados das requisições, tanto requisição de registro, quanto requisição de usuário.
@Service
public class ClientVerifyService implements DualVerifyInterface<RegisterClientDTO, RegisterUserClientDTO> {

    private final VerifyInterface<RegisterClientDTO> clientInfoDataService;
    private final VerifyInterface<RegisterUserClientDTO> clientUserDataService;

    @Autowired
    public ClientVerifyService(VerifyInterface<RegisterClientDTO> clientInfoDataService,
                               VerifyInterface<RegisterUserClientDTO> clientUserDataService) {
        this.clientInfoDataService = clientInfoDataService;
        this.clientUserDataService = clientUserDataService;
    }

    @Override
    public Boolean isExisting(RegisterClientDTO request) {
        if (request == null) {
            return false;
        }

        return clientInfoDataService.isExisting(request);
    }

    @Override
    public Boolean isExisting_(RegisterUserClientDTO request) {
        if (request == null) {
            return false;
        }

        return clientUserDataService.isExisting(request);
    }
}
