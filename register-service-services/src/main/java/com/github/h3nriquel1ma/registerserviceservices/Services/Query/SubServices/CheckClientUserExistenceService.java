package com.github.h3nriquel1ma.registerserviceservices.Services.Query.SubServices;

import com.github.h3nriquel1ma.registerservicecore.Repositories.ClientRepository;
import com.github.h3nriquel1ma.registerservicecore.Repositories.ClientUserRepository;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.CheckClientUserInterface;
import org.springframework.stereotype.Service;

@Service
public class CheckClientUserExistenceService implements CheckClientUserInterface {

    private final ClientUserRepository clientUserRepository;

    public CheckClientUserExistenceService(ClientUserRepository clientUserRepository) {
        this.clientUserRepository = clientUserRepository;
    }

    @Override
    public Boolean check(String hashedUser, String hashedPassword) {
        return this.clientUserRepository.findByClientUserName(hashedUser).isPresent() ||
                hashedUser.isEmpty() ||
                hashedPassword.isEmpty();
    }
}
