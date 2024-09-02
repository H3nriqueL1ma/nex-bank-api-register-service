package com.github.h3nriquel1ma.registerserviceservices.Services.Query.SubServices;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.VerifyUserInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;
import org.springframework.stereotype.Service;

@Service
public class ClientUserDataService implements VerifyUserInterface {

    @Override
    public Boolean verifyUserData(RegisterUserClientDTO request) {
        return null;
    }
}
