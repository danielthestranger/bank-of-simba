package com.greenfoxacademy.bankofsimba.repositories;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.models.OwnerInclination;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BankAccountMemoryRepositoryTest {

    @Test
    public void BankAccountMemoryRepository_ReplacesByID() {
        BankAccountMemoryRepository repo = new BankAccountMemoryRepository();

        BankAccount bankAccount = new BankAccount(
                "Bamba",
                BigDecimal.valueOf(666.),
                "Turnip",
                "mouse",
                OwnerInclination.GOOD_ONE,
                false);

        repo.replaceById(0, bankAccount);
    }

    @Test
    public void BankAccountMemoryRepository_AddsNext() {
        BankAccountMemoryRepository repo = new BankAccountMemoryRepository();

        BankAccount bankAccount = new BankAccount(
                "Bamba",
                BigDecimal.valueOf(666.),
                "Turnip",
                "mouse",
                OwnerInclination.GOOD_ONE,
                false);

        repo.add(bankAccount);
    }
}