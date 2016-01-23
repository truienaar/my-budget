package be.vansichen.raf.mybudget.model;

import java.time.LocalDate;

public class PlannedIncome extends Income {

    public PlannedIncome(LocalDate date, String description, double amount) {
        super(date, description, amount);
    }

}
