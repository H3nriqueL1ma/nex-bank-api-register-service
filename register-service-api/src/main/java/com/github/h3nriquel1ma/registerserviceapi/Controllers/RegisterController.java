package com.github.h3nriquel1ma.registerserviceapi.Controllers;

import com.github.h3nriquel1ma.registerserviceapi.DTO.RegisterClientDTO;
import com.github.h3nriquel1ma.registerserviceservices.Services.Session.HttpSessionService;
import com.github.h3nriquel1ma.registerserviceservices.Services.Validation.ClientValidatorService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RegisterController {

    private final HttpSessionService httpSessionService;
    private final ClientValidatorService clientValidatorService;

    @Autowired
    public RegisterController(HttpSessionService httpSessionService,
                              ClientValidatorService clientValidatorService) {
        this.httpSessionService = httpSessionService;
        this.clientValidatorService = clientValidatorService;
    }

    public ResponseEntity<Object> registerSession(HttpSession session,
                                                  @RequestBody @Valid RegisterClientDTO request) {
        if (!clientValidatorService.isValidRequestData(request)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "Invalid Data!", "code", 400));
        }

        try {
            if (isExistingClient(request)) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "Client already exists!", "code", 400));
            }

            httpSessionService.createSession("user_" + request.getCPF_cliente(), request);
            httpSessionService.createAttributeSession("user_cpf", request.getCPF_cliente());

            return ResponseEntity.status(HttpStatus.OK).body(Map.of("message", "Session created sucessfully!", "code", 201));
        } catch (DataAccessException error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "An error occurred connecting to the database!", "code", 500));

        } catch (RuntimeException error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "An unexpected error occurred!", "code", 500));
        }
    }

    public void registerClient(@RequestBody RegisterClientDTO request) {

    }
}
