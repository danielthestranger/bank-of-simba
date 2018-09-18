package com.greenfoxacademy.bankofsimba.models;

import java.math.BigDecimal;

public class BankAccount {
    private String name;
    private BigDecimal balance;
    private String currency;
    private String animalType;
    private OwnerInclination ownerInclination;
    private boolean isKing;

    public BankAccount() {
    }

    public BankAccount(String name, BigDecimal balance, String currency, String animalType, OwnerInclination ownerInclination, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.currency = currency;
        this.animalType = animalType;
        this.ownerInclination = ownerInclination;
        this.isKing = isKing;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public OwnerInclination getOwnerInclination() {
        return ownerInclination;
    }

    public void setOwnerInclination(OwnerInclination ownerInclination) {
        this.ownerInclination = ownerInclination;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }
}
