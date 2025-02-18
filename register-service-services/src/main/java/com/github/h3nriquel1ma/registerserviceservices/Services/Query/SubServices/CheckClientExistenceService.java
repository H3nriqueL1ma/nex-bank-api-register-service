package com.github.h3nriquel1ma.registerserviceservices.Services.Query.SubServices;

import com.github.h3nriquel1ma.registerservicecore.Repositories.ClientRepository;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Validation.CheckInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

// Serviço de verificação de clientes com base em dados de registro.
@Service
public class CheckClientExistenceService implements CheckInterface<String> {

    private final ClientRepository clientRepository;

    @Autowired
    public CheckClientExistenceService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Boolean check(String... parameters) {
        return clientRepository.findByClientCPF(parameters[0]).isPresent() ||
                clientRepository.findByClientEmail(parameters[1]).isPresent() ||
                clientRepository.findByClientPhone(parameters[2]).isPresent();
    }
}
