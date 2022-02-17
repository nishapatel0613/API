package com.example.Vanguard.API.DAO;

import com.example.Vanguard.API.Config.DatabaseConfig;
import com.example.Vanguard.API.Entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Repository
public class ClientDAOImpl implements ClientDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

  //  private Client client;

    @Override
    public Client getClient(Long id) {

            Double Age;
            Double Income;

            Age = jdbcTemplate.queryForObject("SELECT AGE FROM client WHERE ID = ?;", new Object[]{id},Double.class);
            Income = jdbcTemplate.queryForObject("SELECT INCOME FROM client WHERE ID = ?;", new Object[]{id},Double.class);

            Client c = new Client();
            c.setAge(Age);
            c.setIncome(Income);
            return c;

    }

}