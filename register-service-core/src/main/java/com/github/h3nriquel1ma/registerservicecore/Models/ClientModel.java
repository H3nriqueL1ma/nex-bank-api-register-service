package com.github.h3nriquel1ma.registerservicecore.Models;

import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

// Entidade de modelagem do cliente.
@Entity
@Table(name = "clients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    @Column(name = "client_username")
    private String clientUserName;

    @Column(name = "client_password")
    private String clientPassword;

    public ClientModel(RegisterClientDTO data, String username, String password) {
        this.clientFullName = data.getNome_cliente();
        this.clientCPF = data.getCpf_cliente();
        this.clientEmail = data.getEmail_cliente();
        this.clientPhone = data.getCelular_cliente();
        this.clientBirthDate = data.getData_nascimento_cliente();
        this.clientUserName = username;
        this.clientPassword = password;
    }
}
