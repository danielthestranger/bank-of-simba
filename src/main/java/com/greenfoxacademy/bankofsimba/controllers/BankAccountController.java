package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.models.BankAccountFormattedDTO;
import com.greenfoxacademy.bankofsimba.models.OwnerInclination;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {

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

        List<BankAccountFormattedDTO> bankAccounts = Arrays.asList(
                BankAccountFormattedDTO.fromBankAccount(simba),
                BankAccountFormattedDTO.fromBankAccount(nala),
                BankAccountFormattedDTO.fromBankAccount(mufasa),
                BankAccountFormattedDTO.fromBankAccount(scar)
        );
        model.addAttribute("bankAccounts", bankAccounts);
        return "bank-accounts";
    }

}
