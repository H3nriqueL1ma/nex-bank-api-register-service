package com.github.h3nriquel1ma.registerserviceservices.Services.Validation.SubServices;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Validation.ValidatorInterface;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

// Serviço de validação de Email.
@Service
public class EmailValidatorService implements ValidatorInterface<String> {

    public Boolean isValid(String email) {
        String[] parts = email.split("@");

        if (parts.length != 2) {
            return false;
        }

        String domain = parts[1];

        try {
            InetAddress address = InetAddress.getByName(domain);
            return true;
        } catch (UnknownHostException error) {
            return false;
        }
    }
}
