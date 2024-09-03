package com.github.h3nriquel1ma.registerserviceapi.Controllers;

import com.github.h3nriquel1ma.registerserviceservices.Services.Query.ClientVerifyService;
import com.github.h3nriquel1ma.registerserviceservices.Services.Session.HttpSessionService;
import com.github.h3nriquel1ma.registerserviceservices.Services.Validation.ClientValidatorRequestService;
import com.github.h3nriquel1ma.registerserviceservices.Services.Validation.ClientValidatorUserService;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterClientDTO;
import com.github.h3nriquel1ma.registerserviceshared.DTO.RegisterUserClientDTO;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

// Controller de Registro do Usuário.
@RestController
@RequestMapping("/register")
public class RegisterController {

    private final HttpSessionService httpSessionService;
    private final ClientValidatorRequestService clientValidatorRequestService;
    private final ClientVerifyService clientVerifyService;
    private final ClientValidatorUserService clientValidatorUserService;

    @Autowired
    public RegisterController(HttpSessionService httpSessionService,
                              ClientValidatorRequestService clientValidatorRequestService, ClientVerifyService clientVerifyService, ClientValidatorUserService clientValidatorUserService) {
        this.httpSessionService = httpSessionService;
        this.clientValidatorRequestService = clientValidatorRequestService;
        this.clientVerifyService = clientVerifyService;
        this.clientValidatorUserService = clientValidatorUserService;
    }

    // Rota de registro dos dados gerais do usuário em uma nova Sessão.
    @PostMapping("/session")
    public ResponseEntity<Object> registerSession(HttpSession session,
                                                  @RequestBody @Valid RegisterClientDTO request) {
        if (!clientValidatorRequestService.isValidRequestData(request)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "Invalid Data!", "code", 400));
        }

        try {
            if (clientVerifyService.isExistingClient(request)) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "Client already exists!", "code", 400));
            }

            // Guardando os dados inteiros da requisição em uma sessão especificada pelo CPF do cliente.
            httpSessionService.createSession("user_" + request.getCPF_cliente(), request);

            // Guardando o CPF do cliente.
            httpSessionService.createAttributeSession("user_cpf", request.getCPF_cliente());

            return ResponseEntity.status(HttpStatus.OK).body(Map.of("message", "Session created sucessfully!", "code", 201));
        } catch (DataAccessException error) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("message", "An error occurred connecting to the database!", "code", 500));

        } catch (RuntimeException error) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("message", "An unexpected error occurred!", "code", 500));
        }
    }

    @PostMapping("/client")
    public ResponseEntity<Object> registerClient(HttpSession session, @RequestBody RegisterUserClientDTO request) {
        if (!clientValidatorUserService.isValidUserData(request)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "Invalid Data!", "code", 400));
        }

        try {
            if (clientVerifyService.isExistingClient(request)) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "Client User already exists!", "code", 400));
            }


        } catch (DataAccessException error) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("message", "An error occurred connecting to the database!", "code", 500));
        } catch (RuntimeException error) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("message", "An unexpected error occurred!", "code", 500));
        }
    }
}
