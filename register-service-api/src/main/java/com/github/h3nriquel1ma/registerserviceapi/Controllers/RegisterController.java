package com.github.h3nriquel1ma.registerserviceapi.Controllers;

import com.github.h3nriquel1ma.registerserviceapi.DTO.RegisterClientDTO;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    public ResponseEntity<Void> registerSession(HttpSession session, @RequestBody @Valid RegisterClientDTO request) {

    }

    public ResponseEntity<Void> registerClient(@RequestBody RegisterClientDTO request) {

    }
}
