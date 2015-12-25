package be.vansichen.raf.mybudget.model;

import java.time.LocalDate;

class ActualIncome extends Income {

    ActualIncome(LocalDate date, String description, double amount) {
        super(date, description, amount);
    }

}
