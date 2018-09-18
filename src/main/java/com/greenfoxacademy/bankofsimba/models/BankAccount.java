package com.greenfoxacademy.bankofsimba.models;

import java.math.BigDecimal;

public class BankAccount {
    private String name;
    private BigDecimal balance;
    private String animalType;

    public BankAccount() {
    }

    public BankAccount(String name, BigDecimal balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
