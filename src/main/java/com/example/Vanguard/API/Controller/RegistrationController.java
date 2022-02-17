package com.example.Vanguard.API.Controller;

import com.example.Vanguard.API.Entity.Client;
import com.example.Vanguard.API.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {


    @Autowired
    private RegistrationService registrationService;


    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public ResponseEntity create(@RequestBody Client c){
        return new ResponseEntity(registrationService.getClientData(c), HttpStatus.CREATED);
    }
}
