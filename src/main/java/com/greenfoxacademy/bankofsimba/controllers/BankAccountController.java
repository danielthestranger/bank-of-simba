package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;

@Controller
public class BankAccountController {

    @GetMapping("/show")
    public String showBankAccount(Model model) {
        BankAccount bankAccount = new BankAccount(
                "Simba",
                BigDecimal.valueOf(2000.),
                "Zebra",
                "lion");
        model.addAttribute("bankAccount", bankAccount);
        return "bank-account";
    }

    @GetMapping("/show-list")
    public String showBankAccounts(Model model) {
        BankAccount simba = new BankAccount(
                "Simba",
                BigDecimal.valueOf(2000.),
                "Zebra",
                "lion");
        BankAccount nala = new BankAccount(
                "Nala",
                BigDecimal.valueOf(500.),
                "Antelope",
                "lion");
        BankAccount mufasa = new BankAccount(
                "Mufasa",
                BigDecimal.valueOf(5000.),
                "Alopex",
                "lion");
        BankAccount scar = new BankAccount(
                "Scar",
                BigDecimal.valueOf(20.),
                "Rat",
                "vakarcs");

        List<BankAccount> bankAccounts = Arrays.asList(simba, nala, mufasa, scar);
        model.addAttribute("bankAccounts", bankAccounts);
        return "bank-accounts";
    }

}
