package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;

@Controller
public class BankAccountController {

    @GetMapping("/show")
    public String showBankAccount(Model model) {
        model.addAttribute("bankAccount", new BankAccount("Simba", BigDecimal.valueOf(2000.),"lion"));
        return "bank-account";
    }
}
