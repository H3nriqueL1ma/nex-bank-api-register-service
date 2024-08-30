package com.github.h3nriquel1ma.registerservicecore.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "client_id")
    private UUID clientID;

    @Column(name = "client_full_name")
    private String clientFullName;

    @Column(name = "client_cpf")
    private String clientCPF;

    @Column(name = "client_email")
    private String clientEmail;

    @Column(name = "client_phone")
    private String clientPhone;

    @Column(name = "client_birth_date")
    private String clientBirthDate;
}
