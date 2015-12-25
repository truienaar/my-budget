package be.vansichen.raf.mybudget.model;

import java.time.LocalDate;

abstract class Expense extends Transaction {

    Expense(LocalDate date, String description, double amount) {
        super(date, description, amount);
    }

}
