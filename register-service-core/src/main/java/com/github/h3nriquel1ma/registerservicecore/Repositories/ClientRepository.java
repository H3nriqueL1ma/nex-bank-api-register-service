package com.github.h3nriquel1ma.registerservicecore.Repositories;

import com.github.h3nriquel1ma.registerservicecore.Models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

// Repositório para buscar clientes com base em CPF, Email ou Telefone.
public interface ClientRepository extends JpaRepository<ClientModel, UUID> {
    Optional<ClientModel> findByClientCPF(String cpf);
    Optional<ClientModel> findByClientEmail(String email);
    Optional<ClientModel> findByClientPhone(String phone);
}
