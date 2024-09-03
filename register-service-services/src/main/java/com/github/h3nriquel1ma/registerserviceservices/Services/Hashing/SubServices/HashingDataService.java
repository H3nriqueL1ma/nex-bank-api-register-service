package com.github.h3nriquel1ma.registerserviceservices.Services.Hashing.SubServices;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.HashInterface;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

// Serviço de hashing de dados genéricos String.
@Service
public class HashingDataService implements HashInterface {

    @Override
    public String hash(String data) {
        return DigestUtils.sha256Hex(data);
    }
}
