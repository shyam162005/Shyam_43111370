package com.example.financetracker.service;

import com.example.financetracker.entity.Transaction;
import com.example.financetracker.entity.TransactionType;
import com.example.financetracker.entity.User;
import com.example.financetracker.repository.TransactionRepository;
import com.example.financetracker.repository.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final UserRepository userRepository;

    public TransactionService(TransactionRepository transactionRepository,
                              UserRepository userRepository) {
        this.transactionRepository = transactionRepository;
        this.userRepository = userRepository;
    }

    // ✅ POST: Add transaction
    public Transaction addTransaction(Double amount,
                                      TransactionType type,
                                      String category,
                                      String description) {

        String username = SecurityContextHolder.getContext()
                .getAuthentication()
                .getName();

        User user;

        // Beginner-friendly fallback user
        if (username.equals("anonymousUser")) {
            user = userRepository.findById(1L)
                    .orElseThrow(() -> new RuntimeException("Test user not found"));
        } else {
            user = userRepository.findByUsername(username)
                    .orElseThrow(() -> new RuntimeException("User not found"));
        }

        Transaction transaction = new Transaction(
                amount,
                type,
                category,
                description,
                user
        );

        return transactionRepository.save(transaction);
    }

    // ✅ GET: Get all transactions
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    // ✅ DELETE: Delete transaction
    public void deleteTransaction(Long id) {
        if (!transactionRepository.existsById(id)) {
            throw new RuntimeException("Transaction not found");
        }
        transactionRepository.deleteById(id);
    }
}

