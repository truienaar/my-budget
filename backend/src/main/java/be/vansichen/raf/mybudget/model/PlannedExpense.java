package be.vansichen.raf.mybudget.model;

import java.time.LocalDate;

public class PlannedExpense extends Expense {

    public PlannedExpense(LocalDate date, String description, double amount) {
        super(date, description, amount);
    }
}
