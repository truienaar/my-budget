package be.vansichen.raf.mybudget.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import static org.junit.Assert.*;

public class TransactionRepositoryTest {

    @org.junit.Test
    public void testReportRunningBalance() throws Exception {

        TransactionRepository transactionRepository = new TransactionRepository();

        transactionRepository.addPlannedIncome(LocalDate.of(2016, Month.JANUARY, 1), "Planned Income 1", 101);
        transactionRepository.addPlannedIncome(LocalDate.of(2016, Month.FEBRUARY, 1), "Planned Income 2", 102);
        transactionRepository.addPlannedExpense(LocalDate.of(2016, Month.JANUARY, 2), "Planned Expense 1", 11);
        transactionRepository.addPlannedExpense(LocalDate.of(2016, Month.FEBRUARY, 2), "Planned Expense 2", 12);

        String runningBalanceReport = transactionRepository.reportRunningBalance();

        System.out.println(runningBalanceReport);

    }
}