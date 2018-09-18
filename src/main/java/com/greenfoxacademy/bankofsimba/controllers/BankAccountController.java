package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.models.BankAccountFormattedDTO;
import com.greenfoxacademy.bankofsimba.models.OwnerInclination;
import com.greenfoxacademy.bankofsimba.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class BankAccountController {

    private BankAccountService bankAccountService;

    public BankAccountController() {
    }

    @Autowired
    public BankAccountController(BankAccountService bankAccountService) {
        this();
        this.bankAccountService = bankAccountService;
    }

    @GetMapping("/show")
    public String showBankAccount(Model model) {
        BankAccount bankAccount = new BankAccount(
                "Simba",
                BigDecimal.valueOf(2000.),
                "Zebra",
                "lion",
                OwnerInclination.GOOD_ONE,
                false);
        model.addAttribute("bankAccount",
                BankAccountFormattedDTO.fromBankAccount(bankAccount));
        return "bank-account";
    }

    @GetMapping("/show-list")
    public String showBankAccounts(Model model) {
        List<BankAccount> rawBankAccounts = bankAccountService.getAllBankAccounts();
        List<BankAccountFormattedDTO> bankAccounts = BankAccountFormattedDTO.fromBankAccounts(rawBankAccounts);
        model.addAttribute("bankAccounts", bankAccounts);
        return "bank-accounts";
    }

    @PostMapping("/show-list/{index}/raise")
    public String raiseBalanceDefault(@PathVariable(value = "index") int index,
                                      Model model) {
        bankAccountService.raiseBalanceDefault(index);
        return "redirect:/show-list";
    }
}
