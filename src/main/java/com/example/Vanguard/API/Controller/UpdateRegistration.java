package com.example.Vanguard.API.Controller;


import com.example.Vanguard.API.Entity.Client;
import com.example.Vanguard.API.Service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UpdateRegistration {

    @Autowired
    private UpdateService updateService;

    @RequestMapping(method = RequestMethod.PUT, value = "/UpdateRegistration")
    public ResponseEntity create(@RequestBody Client c) {
        return new ResponseEntity(updateService.getClientData(c), HttpStatus.CREATED);
    }
}
