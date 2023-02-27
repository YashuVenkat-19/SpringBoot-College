package com.example.codingContest1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.codingContest1.Entity.Bank;
import com.example.codingContest1.Service.BankService;

@RestController
public class BankController {
    @Autowired
    private BankService bank;

    @GetMapping("/getAllBank")
    public List<Bank> getDetails() {
        return bank.getAllDetails();
    }

    @GetMapping("/getBank/{id}")
    public Optional<Bank> getOneDetail(@PathVariable int id) {
        return bank.getOneBank(id);
    }

    @PostMapping("/addBank")
    public Bank addDetails(@RequestBody Bank s) {
        return bank.addDetails(s);
    }

    @DeleteMapping("/delBank/{id}")
    public void delDetails(@PathVariable("id") int s) {
        bank.deleteDepartmentId(s);
    }

    @PutMapping("/deposit/{id}/{amt}")
    public Bank depositAmt(@PathVariable int id, @PathVariable int amt) {
        return bank.deposit(id, amt);
    }

    @PutMapping("/withdraw/{id}/{amt}")
    public Bank withdrawAmt(@PathVariable int id, @PathVariable int amt) {
        return bank.withdraw(id, amt);
    }

}
