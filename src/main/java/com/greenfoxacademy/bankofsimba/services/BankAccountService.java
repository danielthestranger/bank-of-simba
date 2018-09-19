package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BankAccountService {
    BankAccount raiseBalanceDefault(int id);
    List<BankAccount> getAllBankAccounts();
    BankAccount add(BankAccount bankAccount);
}
