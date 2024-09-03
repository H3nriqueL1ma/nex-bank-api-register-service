package com.github.h3nriquel1ma.registerserviceshared.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

// Objeto de transferência de dados para dados de Usuário do cliente.
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegisterUserClientDTO {

    @NotNull(message = "Client User Name cannot be null!")
    private String nome_usuario;

    @NotNull(message = "Client Password cannot be null!")
    private String senha_usuario;
}
