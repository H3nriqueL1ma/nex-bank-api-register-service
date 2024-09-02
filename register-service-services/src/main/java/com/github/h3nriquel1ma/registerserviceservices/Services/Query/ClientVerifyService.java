package com.github.h3nriquel1ma.registerserviceservices.Services.Query;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.VerifyInterface;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.VerifyUserInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;
import org.springframework.stereotype.Service;

@Service
public class ClientVerifyService {

    private final VerifyInterface clientInfoDataService;
    private final VerifyUserInterface clientUserDataService;

    public ClientVerifyService(VerifyInterface clientInfoDataService,
                               VerifyUserInterface clientUserDataService) {
        this.clientInfoDataService = clientInfoDataService;
        this.clientUserDataService = clientUserDataService;
    }

    public Boolean isExistingClient(RegisterClientDTO request) {
        if (request == null) {
            return false;
        }

        return clientInfoDataService.verifyInfoData(request);
    }

    public Boolean isExistingClient(RegisterUserClientDTO request) {
        if (request == null) {
            return false;
        }

        return clientUserDataService.verifyUserData(request);
    }
}
