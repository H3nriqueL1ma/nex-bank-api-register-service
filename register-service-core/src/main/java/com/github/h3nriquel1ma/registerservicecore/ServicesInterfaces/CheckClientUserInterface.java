package com.github.h3nriquel1ma.registerservicecore.ServicesInterfaces;

public interface CheckClientUserInterface {
    Boolean check(String hashedUser, String hashedPassword);
}
