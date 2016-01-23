package be.vansichen.raf.mybudget.services;

import be.vansichen.raf.mybudget.model.*;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionServices {

    private TransactionRepository transactionRepository = new TransactionRepository();

    private void addPlannedIncome(LocalDate date, String description, double amount) {
        transactionRepository.addTransaction(new PlannedIncome(date, description, amount));
    }

    private void addPlannedExpense(LocalDate date, String description, double amount) {
        transactionRepository.addTransaction(new PlannedExpense(date, description, amount));
    }

    public void addPlannedIncome(String date, String description, double amount) {
        addPlannedIncome(parseDate(date), description, amount);
    }

    public void addMonthlyPlannedIncome(int year, DayOfMonth dayOfMonth, String description, double amount) {
        for (Month month: Month.values()){
            addPlannedIncome(dayOfMonth.date(year, month), description, amount);
        }
    }

    public void addPlannedExpense(String date, String description, double amount) {
        addPlannedExpense(parseDate(date), description, amount);
    }

    public void addMonthlyPlannedExpense(int year, DayOfMonth dayOfMonth, String description, double amount) {
        for (Month month: Month.values()){
            addPlannedExpense(dayOfMonth.date(year, month), description, amount);
        }
    }

    public void addQuarterlyPlannedExpense(int year, String description, double amount) {
        for (Month month: new Month[]{Month.JANUARY, Month.APRIL, Month.JULY, Month.OCTOBER}){
            LocalDate date = LocalDate.of(year, month, 1);
            addPlannedExpense(date, description, amount);
        }
    }

    public String reportRunningBalance(double initialBalance){
        final String INITIAL_AND_FINAL_BALANCE_FORMAT = "%1$-68.68s %2$10.2f \n";
        final String RUNNING_BALANCE_FORMAT = "%1$td/%1$tm/%1$tY : %2$-40.40s : %3$10.2f : %4$10.2f \n";
        final StringBuilder report = new StringBuilder();
        final List<Transaction> sortedTransactions = transactionRepository.getTransactions()
                .stream()
                .sorted(Comparator.comparing(Transaction::getDate))
                .collect(Collectors.toList());
        double balance = initialBalance;
        report.append(String.format(INITIAL_AND_FINAL_BALANCE_FORMAT, ">> INITIAL BALANCE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>", balance));
        for (Transaction t : sortedTransactions){
            balance += t.getSignedAmount();
            report.append(String.format(RUNNING_BALANCE_FORMAT, t.getDate(), t.getDescription(), t.getSignedAmount(), balance));
        }
        report.append(String.format(INITIAL_AND_FINAL_BALANCE_FORMAT, ">> FINAL BALANCE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>", balance));

        return report.toString();
    }

    private LocalDate parseDate(String date){
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }


}
