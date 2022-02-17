package com.example.Vanguard.API.Service;

import com.example.Vanguard.API.DAO.RegistrationDAO;
import com.example.Vanguard.API.Entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RegistrationService {

    @Autowired
    private RegistrationDAO registrationDAO;

    public Client getClientData(Client c) {
        return registrationDAO.getClient(c);
    }
}
