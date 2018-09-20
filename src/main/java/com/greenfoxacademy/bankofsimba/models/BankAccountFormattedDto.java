package com.greenfoxacademy.bankofsimba.models;

import java.security.acl.Owner;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class BankAccountFormattedDto {
    private String name;
    private String balance;
    private String currency;
    private String animalType;
    private OwnerInclination ownerInclination;
    private Boolean king;
    private Boolean willBeKing;
    private String styleClasses;

    private DecimalFormat decimalFormat;

    public static BankAccountFormattedDto fromBankAccount(BankAccount bankAccount) {
        return new BankAccountFormattedDto(bankAccount);
    }

    public static List<BankAccountFormattedDto> fromBankAccounts(List<BankAccount> bankAccounts) {
        List<BankAccountFormattedDto> bankAccountFormattedDtos = new ArrayList<>();
        for (BankAccount bankAccount : bankAccounts) {
            bankAccountFormattedDtos.add(BankAccountFormattedDto.fromBankAccount(bankAccount));
        }
        return bankAccountFormattedDtos;
    }


    public BankAccountFormattedDto() {
        this.decimalFormat = new DecimalFormat("0.00");
    }

    private BankAccountFormattedDto(BankAccount bankAccount) {
        this();
        this.name = bankAccount.getName();
        this.balance = decimalFormat.format(bankAccount.getBalance());
        this.currency = bankAccount.getCurrency();
        this.animalType = bankAccount.getAnimalType();
        this.ownerInclination = bankAccount.getOwnerInclination();
        this.king = bankAccount.getKing();
        this.willBeKing = bankAccount.getWillBeKing();

        this.styleClasses = generateStyleClasses();
    }


    private String generateStyleClasses() {
        if (this.king)
            return "king ";
        else
            return "";
    }

    public String getName() {
        return name;
    }

    public String getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAnimalType() {
        return animalType;
    }

    public OwnerInclination getOwnerInclination() {
        return ownerInclination;
    }

    public Boolean getKing() {
        return king;
    }

    public Boolean getWillBeKing() {
        return willBeKing;
    }

    public String getStyleClasses() {
        return styleClasses;
    }
}
