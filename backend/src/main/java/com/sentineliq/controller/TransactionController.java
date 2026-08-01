package com.sentineliq.controller;

import com.sentineliq.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/analyze")
    public String analyze() {
        return transactionService.analyzeTransaction();
    }
}
