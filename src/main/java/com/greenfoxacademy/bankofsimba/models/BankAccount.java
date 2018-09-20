package com.greenfoxacademy.bankofsimba.models;

import java.math.BigDecimal;

public class BankAccount {
    private String name;
    private BigDecimal balance;
    private String currency;
    private String animalType;
    private OwnerInclination ownerInclination;
    private Boolean king;
    private Boolean willBeKing;

    public BankAccount() {
    }

    public BankAccount(String name, BigDecimal balance, String currency, String animalType, OwnerInclination ownerInclination, Boolean king, Boolean willBeKing) {
        this.name = name;
        this.balance = balance;
        this.currency = currency;
        this.animalType = animalType;
        this.ownerInclination = ownerInclination;
        this.king = king;
        this.willBeKing = willBeKing;
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

    public Boolean getKing() {
        return king;
    }

    public void setKing(Boolean king) {
        this.king = king;
    }

    public Boolean getWillBeKing() {
        return willBeKing;
    }

    public void setWillBeKing(Boolean willBeKing) {
        this.willBeKing = willBeKing;
    }
}
