package com.example.Vanguard.API.Service;

import com.example.Vanguard.API.DAO.ClientDAO;
import com.example.Vanguard.API.DAO.ClientDAOImpl;
import com.example.Vanguard.API.Entity.Client;
import com.example.Vanguard.API.Repository.Repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetirementDecisionImpl implements RetirementDecision {


    @Autowired
   private ClientDAO clientDao;


    @Override
    public String retirement(Long id) {

      Client c = new Client();
      c = getClientData(id);
        return retirementDecision(c.getAge(),c.getIncome());
    }

    public String retirementDecision(Double clientAge, double sal) {

        final double age = 59.5;
        Long penalty = 15000L;
        Long investment = 150000L;
        String statement = null;

        if(clientAge >= age && investment >= (sal * 25) ){
            statement = "You can retire";
        }else if(clientAge <= age && (investment - penalty) >= (sal * 25) ){
            statement = "You can retire with penalty";
        }else if(clientAge >= age && investment < (sal * 25)){
            statement = "You can retire without comfort";
        }else{
            statement = "You can not retire";
        }

        return statement;
    }

    public Client getClientData(Long id) {



        return clientDao.getClient(id);
    }

}
