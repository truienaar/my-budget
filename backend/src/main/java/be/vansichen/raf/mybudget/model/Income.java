package be.vansichen.raf.mybudget.model;

import java.time.LocalDate;

abstract class Income extends Transaction {

    Income(LocalDate date, String description, double amount) {
        super(date, description, amount);
    }

}
