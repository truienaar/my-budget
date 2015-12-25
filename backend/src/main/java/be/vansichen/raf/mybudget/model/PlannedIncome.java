package be.vansichen.raf.mybudget.model;

import java.time.LocalDate;
import java.util.Date;

class PlannedIncome extends Income {

    PlannedIncome(LocalDate date, String description, double amount) {
        super(date, description, amount);
    }

}
