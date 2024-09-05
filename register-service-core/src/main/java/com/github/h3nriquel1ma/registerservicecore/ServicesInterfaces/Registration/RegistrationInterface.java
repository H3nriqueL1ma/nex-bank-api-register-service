package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Registration;

public interface RegistrationInterface<K, V> {
    void register(K data, V session);
}
