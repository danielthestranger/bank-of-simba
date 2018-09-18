package com.greenfoxacademy.bankofsimba.repositories;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.models.OwnerInclination;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Repository
public class BankAccountMemoryRepository implements BankAccountRepository {

    private List<BankAccount> bankAccounts;

    public BankAccountMemoryRepository() {
        BankAccount simba = new BankAccount(
                "Simba",
                BigDecimal.valueOf(2000.),
                "Zebra",
                "lion",
                OwnerInclination.GOOD_ONE,
                false);
        BankAccount nala = new BankAccount(
                "Nala",
                BigDecimal.valueOf(500.),
                "Antelope",
                "lion",
                OwnerInclination.GOOD_ONE,
                false);
        BankAccount mufasa = new BankAccount(
                "Mufasa",
                BigDecimal.valueOf(5000.),
                "Alopex",
                "lion",
                OwnerInclination.GOOD_ONE,
                true);
        BankAccount scar = new BankAccount(
                "Scar",
                BigDecimal.valueOf(20.),
                "Rat",
                "vakarcs",
                OwnerInclination.BAD_GUY,
                false);

        this.bankAccounts = Arrays.asList(simba,nala,mufasa,scar);
    }

    @Override
    public List<BankAccount> findAll() {
        return getBankAccounts();
    }

    @Override
    public BankAccount getById(int id) {
        return bankAccounts.get(id);
    }

    @Override
    public BankAccount replaceById(int id, BankAccount bankAccount) {
        bankAccounts.set(id, bankAccount);
        return bankAccounts.get(id);
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
