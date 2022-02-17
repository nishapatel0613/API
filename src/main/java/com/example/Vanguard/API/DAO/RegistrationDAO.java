package com.example.Vanguard.API.DAO;

import com.example.Vanguard.API.Entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;


@Service
public class RegistrationDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public Client getClient(Client c) {


        System.out.println(c.getId() + c.getAge() + c.getIncome() + c.getInvestment() + c.getFirstName() +c.getLastName());

        String query = "INSERT INTO client (id, AGE, INCOME, INVESTMENT, FIRSTNAME, LASTNAME) VALUES(?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(query,c.getId(),c.getAge(),c.getIncome(),c.getInvestment(),c.getFirstName(),c.getLastName());


        return c;

    }
}
