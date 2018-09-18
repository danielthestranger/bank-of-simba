package com.greenfoxacademy.bankofsimba.repositories;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankAccountRepository {

    List<BankAccount> findAll();
    BankAccount getById(int id);
    BankAccount replaceById(int id, BankAccount bankAccount);
}
