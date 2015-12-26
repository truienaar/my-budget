package be.vansichen.raf.mybudget.model;


import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TransactionRepositoryTest {

    @org.junit.Test
    public void testReportRunningBalance() throws Exception {

        TransactionRepository transactionRepository = new TransactionRepository();

        transactionRepository.addMonthlyPlannedIncome(2016, "Maandloon", 2750);
        transactionRepository.addPlannedIncome("31/05/2016", "Bonus & vakantiegeld", 7500);
        transactionRepository.addPlannedIncome("30/11/2016", "Eindejaarspremie", 2100);
        transactionRepository.addPlannedIncome("31/12/2016", "Terugbetaling belastingen", 2000);

        String runningBalanceReport = transactionRepository.reportRunningBalance();

        System.out.println(runningBalanceReport);

    }

 }