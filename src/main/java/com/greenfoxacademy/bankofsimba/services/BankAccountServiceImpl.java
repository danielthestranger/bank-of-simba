package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BankAccountServiceImpl implements BankAccountService {
    private BankAccountRepository bankAccountRepository;

    public BankAccountServiceImpl() {
    }

    @Autowired
    public BankAccountServiceImpl(BankAccountRepository bankAccountRepository) {
        this();
        this.bankAccountRepository = bankAccountRepository;
    }

    @Override
    public BankAccount raiseBalanceDefault(int id) {
        BankAccount bankAccount = bankAccountRepository.getById(id);
        if (bankAccount.isKing())
            bankAccount.setBalance(bankAccount.getBalance().add(BigDecimal.valueOf(100.)));
        else
            bankAccount.setBalance(bankAccount.getBalance().add(BigDecimal.valueOf(10.)));
        return bankAccountRepository.replaceById(id, bankAccount);
    }

    @Override
    public List<BankAccount> getAllBankAccounts() {
        return bankAccountRepository.findAll();
    }
}
