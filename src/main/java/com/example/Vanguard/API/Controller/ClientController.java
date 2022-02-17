package com.example.Vanguard.API.Controller;


import com.example.Vanguard.API.Entity.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {



    @RequestMapping(method = RequestMethod.GET, value = "introduction")
    public ResponseEntity<Client> get(){
        return new ResponseEntity("I am from India", HttpStatus.OK);
    }



}
