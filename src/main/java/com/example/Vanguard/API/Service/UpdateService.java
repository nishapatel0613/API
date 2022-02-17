package com.example.Vanguard.API.Service;


import com.example.Vanguard.API.DAO.UpdateDAO;
import com.example.Vanguard.API.Entity.Client;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {

    public Client getClientData(Client c) {
        return UpdateDAO.getClient(c);
    }
}
