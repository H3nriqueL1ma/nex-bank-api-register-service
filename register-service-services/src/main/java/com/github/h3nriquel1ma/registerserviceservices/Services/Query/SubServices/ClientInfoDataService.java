package com.github.h3nriquel1ma.registerserviceservices.Services.Query.SubServices;

import com.github.h3nriquel1ma.registerservicecore.Models.ClientModel;
import com.github.h3nriquel1ma.registerservicecore.Repositories.ClientRepository;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.VerifyInterface;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientInfoDataService implements VerifyInterface {

    private final ClientRepository clientRepository;

    public ClientInfoDataService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Boolean verifyInfoData(RegisterClientDTO request) {
        Optional<ClientModel> optionalClientCPF = this.clientRepository.findByClientCPF(request.getCPF_cliente());
        Optional<ClientModel> optionalClientEmail = this.clientRepository.findByClientEmail(request.getEmail_cliente());
        Optional<ClientModel> optionalClientPhone = this.clientRepository.findByClientPhone(request.getCelular_cliente());

        return optionalClientCPF.isPresent() ||
                optionalClientEmail.isPresent() ||
                optionalClientPhone.isPresent();
    }
}
