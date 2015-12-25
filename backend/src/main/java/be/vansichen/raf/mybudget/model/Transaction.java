package be.vansichen.raf.mybudget.model;

import java.time.LocalDate;
import java.util.Date;

abstract class Transaction {

    private LocalDate date;
    private String description;
    private double amount;

    Transaction(LocalDate date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    LocalDate getDate() {
        return date;
    }

    String getDescription() {
        return description;
    }

    double getAmount() {
        return amount;
    }
}
