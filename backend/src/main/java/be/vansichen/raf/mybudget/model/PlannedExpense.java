package be.vansichen.raf.mybudget.model;

import java.time.LocalDate;

class PlannedExpense extends Expense {

    PlannedExpense(LocalDate date, String description, double amount) {
        super(date, description, amount);
    }
}
