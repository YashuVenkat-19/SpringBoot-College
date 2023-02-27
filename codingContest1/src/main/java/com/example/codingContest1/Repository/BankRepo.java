package com.example.codingContest1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.codingContest1.Entity.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer> {

}
