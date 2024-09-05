package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces.Hashing;

// Interface para hashing de senha e dados.
public interface DualHashInterface extends HashInterface {
    String hash_(String password);
}
