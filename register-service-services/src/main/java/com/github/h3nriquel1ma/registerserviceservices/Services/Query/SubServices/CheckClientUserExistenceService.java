package com.github.h3nriquel1ma.registerserviceservices.Services.Query.SubServices;

import com.github.h3nriquel1ma.registerservicecore.Repositories.ClientUserRepository;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Validation.CheckInterface;
import org.springframework.stereotype.Service;

@Service
public class CheckClientUserExistenceService implements CheckInterface<String> {

    private final ClientUserRepository clientUserRepository;

    public CheckClientUserExistenceService(ClientUserRepository clientUserRepository) {
        this.clientUserRepository = clientUserRepository;
    }

    @Override
    public Boolean check(String... parameters) {
        return this.clientUserRepository.findByClientUserName(parameters[0]).isPresent() ||
                parameters[0].isEmpty() ||
                parameters[1].isEmpty();
    }
}
