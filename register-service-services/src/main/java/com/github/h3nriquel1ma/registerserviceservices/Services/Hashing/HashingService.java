package com.github.h3nriquel1ma.registerserviceservices.Services.Hashing;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Hashing.DualHashInterface;
import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Hashing.HashInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Serviço geral de hashing.
@Service
public class HashingService implements DualHashInterface {

    private final HashInterface hashingDataService;
    private final HashInterface hashingPasswordService;

    @Autowired
    public HashingService(HashInterface hashingDataService, HashInterface hashingPasswordService) {
        this.hashingDataService = hashingDataService;
        this.hashingPasswordService = hashingPasswordService;
    }

    @Override
    public String hash(String data) {
        return hashingDataService.hash(data);
    }

    @Override
    public String hash_(String password) {
        return hashingPasswordService.hash(password);
    }
}
