package com.example.Vanguard.API.DAO;

import com.example.Vanguard.API.Entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UpdateDAO {
    @Autowired
    static JdbcTemplate jdbcTemplate;


    public static Client getClient(Client c) {


        System.out.println(c.getId() + c.getAge() + c.getIncome() + c.getInvestment() + c.getFirstName() +c.getLastName());

        String query = "UPDATE client SET FIRSTNAME = ? WHERE id = ?";
        jdbcTemplate.update(query,c.getFirstName(),c.getId());


        return c;

    }
}
