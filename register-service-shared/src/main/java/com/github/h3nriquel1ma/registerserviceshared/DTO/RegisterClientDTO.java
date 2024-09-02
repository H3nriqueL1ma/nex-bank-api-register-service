package com.github.h3nriquel1ma.registerserviceshared.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegisterClientDTO {

    @NotNull(message = "Client Name cannot be null!")
    private String nome_cliente;

    @NotNull(message = "Client CPF cannot be null!")
    private String CPF_cliente;

    @NotNull(message = "Client Email cannot be null!")
    private String email_cliente;

    @NotNull(message = "Client Phone cannot be null!")
    private String celular_cliente;

    @NotNull(message = "Client Birth Date cannot be null!")
    private String data_nascimento_cliente;

    @NotNull(message = "Check Value cannot be null!")
    private Boolean check_value;
}
