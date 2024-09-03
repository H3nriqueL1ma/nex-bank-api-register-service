package com.github.h3nriquel1ma.registerserviceservices.Services.Query;

import com.github.h3nriquel1ma.registerservicecore.Query.VerifyInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientVerifyService {

    private final VerifyInterface<RegisterClientDTO> clientInfoDataService;
    private final VerifyInterface<RegisterUserClientDTO> clientUserDataService;

    @Autowired
    public ClientVerifyService(VerifyInterface<RegisterClientDTO> clientInfoDataService,
                               VerifyInterface<RegisterUserClientDTO> clientUserDataService) {
        this.clientInfoDataService = clientInfoDataService;
        this.clientUserDataService = clientUserDataService;
    }

    public Boolean isExistingClient(RegisterClientDTO request) {
        if (request == null) {
            return false;
        }

        return clientInfoDataService.verifyData(request);
    }

    public Boolean isExistingClient(RegisterUserClientDTO request) {
        if (request == null) {
            return false;
        }

        return clientUserDataService.verifyData(request);
    }
}
