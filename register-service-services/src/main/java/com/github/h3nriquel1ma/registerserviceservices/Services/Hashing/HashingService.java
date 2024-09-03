package com.github.h3nriquel1ma.registerserviceservices.Services.Hashing;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.HashInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Serviço geral de hashing.
@Service
public class HashingService {

    private final HashInterface hashingDataService;
    private final HashInterface hashingPasswordService;

    @Autowired
    public HashingService(HashInterface hashingDataService, HashInterface hashingPasswordService) {
        this.hashingDataService = hashingDataService;
        this.hashingPasswordService = hashingPasswordService;
    }

    public String hashData(String data) {
        return hashingDataService.hash(data);
    }

    public String hashPassword(String password) {
        return hashingPasswordService.hash(password);
    }
}
