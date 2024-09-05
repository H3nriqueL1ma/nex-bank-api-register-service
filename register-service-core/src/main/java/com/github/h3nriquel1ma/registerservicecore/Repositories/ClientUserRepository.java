package com.github.h3nriquel1ma.registerservicecore.Repositories;

import com.github.h3nriquel1ma.registerservicecore.Models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

// Repositório para buscar clientes com base em nome de usuário.
public interface ClientUserRepository extends JpaRepository<ClientModel, UUID> {
    Optional<ClientModel> findByClientUserName(String username);
}
