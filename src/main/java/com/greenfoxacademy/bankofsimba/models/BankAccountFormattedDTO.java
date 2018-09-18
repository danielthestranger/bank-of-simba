package com.greenfoxacademy.bankofsimba.models;

import java.text.DecimalFormat;
import java.util.HashMap;

public class BankAccountFormattedDTO {
    private String name;
    private String balance;
    private String currency;
    private String animalType;
    private String ownerInclination;
    private boolean isKing;
    private String styleClasses;

    private DecimalFormat decimalFormat;
    private HashMap<OwnerInclination, String> ownerInclinationMap;

    public static BankAccountFormattedDTO fromBankAccount(BankAccount bankAccount) {
        return new BankAccountFormattedDTO(bankAccount);
    }

    public BankAccountFormattedDTO() {
        this.decimalFormat = new DecimalFormat("0.00");

        ownerInclinationMap = new HashMap<>();
        this.ownerInclinationMap.put(OwnerInclination.GOOD_ONE, "Good One");
        this.ownerInclinationMap.put(OwnerInclination.BAD_GUY, "Bad Guy");
    }

    private BankAccountFormattedDTO(BankAccount bankAccount) {
        this();
        this.name = bankAccount.getName();
        this.balance = decimalFormat.format(bankAccount.getBalance());
        this.currency = bankAccount.getCurrency();
        this.animalType = bankAccount.getAnimalType();
        this.ownerInclination = ownerInclinationMap.getOrDefault(bankAccount.getOwnerInclination(), "");
        this.isKing = bankAccount.isKing();

        this.setStyleClasses();
    }


    private void setStyleClasses() {
        if (this.isKing)
            styleClasses = "king ";
        else
            styleClasses = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getOwnerInclination() {
        return ownerInclination;
    }

    public void setOwnerInclination(String ownerInclination) {
        this.ownerInclination = ownerInclination;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public String getStyleClasses() {
        return styleClasses;
    }

    public void setStyleClasses(String styleClasses) {
        this.styleClasses = styleClasses;
    }
}
