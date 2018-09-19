package com.greenfoxacademy.bankofsimba.models;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class BankAccountFormattedDTO {
    private String name;
    private String balance;
    private String currency;
    private String animalType;
    private String ownerInclination;
    private boolean isKing;
    private String styleClasses;

    private DecimalFormat decimalFormat;

    public static BankAccountFormattedDTO fromBankAccount(BankAccount bankAccount) {
        return new BankAccountFormattedDTO(bankAccount);
    }

    public static List<BankAccountFormattedDTO> fromBankAccounts(List<BankAccount> bankAccounts) {
        List<BankAccountFormattedDTO> bankAccountFormattedDTOs = new ArrayList<>();
        for (BankAccount bankAccount : bankAccounts) {
            bankAccountFormattedDTOs.add(BankAccountFormattedDTO.fromBankAccount(bankAccount));
        }
        return bankAccountFormattedDTOs;
    }


    public BankAccountFormattedDTO() {
        this.decimalFormat = new DecimalFormat("0.00");
    }

    private BankAccountFormattedDTO(BankAccount bankAccount) {
        this();
        this.name = bankAccount.getName();
        this.balance = decimalFormat.format(bankAccount.getBalance());
        this.currency = bankAccount.getCurrency();
        this.animalType = bankAccount.getAnimalType();
        this.ownerInclination = bankAccount.getOwnerInclination().toString();
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
