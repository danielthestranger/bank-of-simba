package com.greenfoxacademy.bankofsimba.repositories;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.models.OwnerInclination;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BankAccountMemoryRepository implements BankAccountRepository {

    private List<BankAccount> bankAccounts = new ArrayList<>();

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

        //Arrays.toList is not used as it creates a fixed-size collection, which cannot be added to
        bankAccounts.add(simba);
        bankAccounts.add(nala);
        bankAccounts.add(mufasa);
        bankAccounts.add(scar);
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
    public BankAccount replaceById(int idToReplace, BankAccount replacementBankAccount) {
        bankAccounts.set(idToReplace, replacementBankAccount);
        return bankAccounts.get(idToReplace);
    }

    @Override
    public BankAccount add(BankAccount bankAccount) {
        return addNext(bankAccount);
    }

    private BankAccount addNext(BankAccount bankAccount) {
        int nextIndex = bankAccounts.size();
        bankAccounts.add(nextIndex, bankAccount);
        return getById(nextIndex);
    }


    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
