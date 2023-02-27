package com.example.codingContest1.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.codingContest1.Entity.Bank;
import com.example.codingContest1.Repository.BankRepo;

@Service
public class BankService {
    @Autowired
    private BankRepo bank;

    public Bank addDetails(Bank s) {
        return bank.save(s);
    }

    public List<Bank> getAllDetails() {
        List<Bank> arr = new ArrayList<>();
        arr = bank.findAll();
        return arr;
    }

    public void deleteDepartmentId(int id) {
        bank.deleteById(id);
    }

    public Bank deposit(int id, int dep) {
        Bank bk = bank.findById(id).get();
        if (Objects.nonNull(bk) && (!(Objects.isNull(bk.getAccname())))) {
            bk.setAccname(bk.getAccname());
        }
        if (Objects.nonNull(bk) && (bk.getBalance() != 0)) {
            bk.setBalance(dep + bk.getBalance());
        }
        return bank.saveAndFlush(bk);
    }

    public Bank withdraw(int id, int wtd) {
        Bank bk = bank.findById(id).get();
        if (Objects.nonNull(bk) && (!(Objects.isNull(bk.getAccname())))) {
            bk.setAccname(bk.getAccname());
        }
        if (Objects.nonNull(bk) && (bk.getBalance() != 0)) {
            bk.setBalance((bk.getBalance()) - wtd);
        }
        return bank.saveAndFlush(bk);
    }

    public Optional<Bank> getOneBank(int id) {
        return bank.findById(id);
    }

}
