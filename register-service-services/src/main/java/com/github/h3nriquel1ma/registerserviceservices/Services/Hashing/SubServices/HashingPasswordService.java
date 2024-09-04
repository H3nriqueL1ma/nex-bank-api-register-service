package com.github.h3nriquel1ma.registerserviceservices.Services.Hashing.SubServices;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Hashing.HashInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

// Serviço de hashing de senha.
@Service
public class HashingPasswordService implements HashInterface {

    private final PasswordEncoder passwordEncoder;

    public HashingPasswordService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public String hash(String data) {
        return passwordEncoder.encode(data);
    }
}
