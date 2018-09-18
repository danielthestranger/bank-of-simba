package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.Currency;

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
}
