package com.example.Vanguard.API.Entity;


import org.springframework.stereotype.Component;

@Component
    public class Client {



        Long id;
        String firstName;
        String lastName;
        double age;
        double income;
        double investment;

        public Client() {
        }

        public Client(Long id, String firstName, String lastName, int age, double income, double investment) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.income = income;
            this.investment = investment;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getAge() {
            return age;
        }

        public void setAge(double age) {
            this.age = age;
        }

        public double getIncome() {
            return income;
        }

        public void setIncome(double income) {
            this.income = income;
        }

        public double getInvestment() {
            return investment;
        }

        public void setInvestment(double investment) {
            this.investment = investment;
        }

    }
