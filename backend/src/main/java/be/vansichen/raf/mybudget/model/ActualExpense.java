package be.vansichen.raf.mybudget.model;

import java.time.LocalDate;

class ActualExpense extends Expense {

    ActualExpense(LocalDate date, String description, double amount) {
        super(date, description, amount);
    }

}
