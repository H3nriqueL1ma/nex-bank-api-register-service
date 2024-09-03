package com.github.h3nriquel1ma.registerserviceservices.Services.Query.SubServices;

import com.github.h3nriquel1ma.registerservicecore.Repositories.ClientRepository;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.CheckClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Serviço de verificação de clientes com base em dados criptografados (CPF, Email ou Telefone).
@Service
public class CheckClientExistenceService implements CheckClientInterface {

    private final ClientRepository clientRepository;

    @Autowired
    public CheckClientExistenceService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Boolean check(String hashedCPF, String hashedEmail, String hashedPhone) {
        return this.clientRepository.findByClientCPF(hashedCPF).isPresent() ||
                this.clientRepository.findByClientEmail(hashedEmail).isPresent() ||
                this.clientRepository.findByClientPhone(hashedPhone).isPresent();
    }
}
