package be.vansichen.raf.mybudget.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TransactionRepository {

    private Collection<Transaction> transactions = new ArrayList<>();

    public void addPlannedIncome(LocalDate date, String description, double amount) {
        transactions.add(new PlannedIncome(date, description, amount));
    }

    public void addPlannedExpense(LocalDate date, String description, double amount) {
        transactions.add(new PlannedExpense(date, description, amount));
    }

    public void addActualIncome(LocalDate date, String description, double amount) {
        transactions.add(new ActualIncome(date, description, amount));
    }

    public void addActualExpense(LocalDate date, String description, double amount) {
        transactions.add(new ActualExpense(date, description, amount));
    }

    public String reportRunningBalance(){

        String REPORT_LINE_FORMAT = "%tD : %2$s : %3$f\n";
        StringBuilder report = new StringBuilder();

        transactions.stream()
                .sorted((t1, t2) -> t1.getDate().compareTo(t2.getDate()))
                .forEachOrdered(t->report.append(String.format(REPORT_LINE_FORMAT, t.getDate(), t.getDescription(), t.getAmount())));

        return report.toString();

    }

}
