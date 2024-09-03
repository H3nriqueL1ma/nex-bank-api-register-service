package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Session;

public interface AttributeSessionInterface<K, V> {
    void createAttributeSession(String attributeId, K data);
    V getAttributeSession(String attributeId);
    void invalidateAttributeSession(String attributeId);
}
