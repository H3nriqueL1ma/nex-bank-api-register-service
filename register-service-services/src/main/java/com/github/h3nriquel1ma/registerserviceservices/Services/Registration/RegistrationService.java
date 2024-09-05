package com.github.h3nriquel1ma.registerserviceservices.Services.Registration;

import com.github.h3nriquel1ma.registerservicecore.Models.ClientModel;
import com.github.h3nriquel1ma.registerservicecore.Repositories.ClientRepository;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Hashing.DualHashInterface;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Registration.RegistrationInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService implements RegistrationInterface<RegisterUserClientDTO, RegisterClientDTO> {

    private final DualHashInterface hashingService;
    private final ClientRepository clientRepository;

    @Autowired
    public RegistrationService(DualHashInterface hashingService, ClientRepository clientRepository) {
        this.hashingService = hashingService;
        this.clientRepository = clientRepository;
    }

    @Override
    public void register(RegisterUserClientDTO request, RegisterClientDTO session) {
        ClientModel client = new ClientModel(session, request.getNome_usuario(), request.getSenha_usuario());

        client.setClientFullName(hashingService.hash(client.getClientFullName()));
        client.setClientCPF(hashingService.hash(client.getClientCPF()));
        client.setClientEmail(hashingService.hash(client.getClientEmail()));
        client.setClientPhone(hashingService.hash(client.getClientPhone()));
        client.setClientBirthDate(hashingService.hash(client.getClientBirthDate()));
        client.setClientUserName(hashingService.hash(client.getClientUserName()));
        client.setClientPassword(hashingService.hash_(client.getClientPassword()));

        this.clientRepository.save(client);
    }
}
