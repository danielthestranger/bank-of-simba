package com.greenfoxacademy.bankofsimba.repositories;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BankAccountRepository {

    List<BankAccount> findAll();
    BankAccount getById(int id);
    BankAccount replaceById(int idToReplace, BankAccount replacementBankAccount);
    BankAccount add(BankAccount bankAccount);
}
