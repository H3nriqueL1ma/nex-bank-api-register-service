package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session;

public interface AttributeSessionInterface<T> extends SessionInterface {
    void createAttributeSession(String attributeId, T data);
}
