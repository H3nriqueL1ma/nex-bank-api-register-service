package com.github.h3nriquel1ma.registerserviceservices.Services.Validation.SubServices;

import com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.ValidatorInterface;
import org.springframework.stereotype.Service;

import java.util.Objects;

// Serviço de validação de número de Telefone em formato brasileiro.
@Service
public class PhoneNumberValidatorService implements ValidatorInterface<String> {

    public Boolean isValid(String phone) {
        if (phone == null || phone.isEmpty()) {
            return false;
        }

        String cleanedPhone = phone.replaceAll("\\D", "");

        if (cleanedPhone.length() != 11) {
            return false;
        }

        String[] parts = cleanedPhone.split("");

        return Objects.equals(parts[2], "9");
    }
}
