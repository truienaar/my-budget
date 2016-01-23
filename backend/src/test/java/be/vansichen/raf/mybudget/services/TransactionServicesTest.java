package be.vansichen.raf.mybudget.services;


public class TransactionServicesTest {

    @org.junit.Test
    public void testReportRunningBalance() throws Exception {

        TransactionServices transactionServices = new TransactionServices();

        transactionServices.addMonthlyPlannedIncome(2016, DayOfMonth.LAST, "Maandloon", 2800);
        transactionServices.addPlannedIncome("31/05/2016", "Bonus & vakantiegeld", 7500);
        transactionServices.addPlannedIncome("30/11/2016", "Eindejaarspremie", 2100);
        transactionServices.addPlannedIncome("31/12/2016", "Terugbetaling belastingen", 2000);

        transactionServices.addMonthlyPlannedExpense(2016, DayOfMonth.FIRST, "Maandelijkse familiale kosten", 1200);
        transactionServices.addMonthlyPlannedExpense(2016, DayOfMonth.FIRST, "Maandelijkse persoonlijke kosten (horeca, kleding, fietsonderhoud, geschenken, zakgeld)", 425);
//      transactionServices.addMonthlyPlannedExpense(2016, DayOfMonth.FIRST, "Langetermijn sparen", 100);
        transactionServices.addMonthlyPlannedExpense(2016, DayOfMonth.D20, "Aflossing woningkrediet 726-8759372-61", 354.40);
        transactionServices.addMonthlyPlannedExpense(2016, DayOfMonth.LAST, "Aflossing woningkrediet 726-2407533-73", 333.16);
        transactionServices.addPlannedExpense("01/01/2016", "Interieur - Salon meubelen (saldo)", 1400);
        transactionServices.addPlannedExpense("01/03/2016", "Wintersportvakantie (saldo)", 2700);
        transactionServices.addPlannedExpense("01/06/2016", "Renovatie platte daken", 7500);
        transactionServices.addPlannedExpense("01/08/2016", "Zomervakantie", 1000);
        transactionServices.addPlannedExpense("01/09/2016", "Onroerende voorheffing", 950);
        transactionServices.addPlannedExpense("30/11/2016", "Pensioensparen", 1250);
        transactionServices.addPlannedExpense("31/11/2016", "Schuldsaldoverzekering", 384.54);
        transactionServices.addPlannedExpense("01/12/2016", "Interieur - Eetkamer meubelen", 1500);
        transactionServices.addPlannedExpense("15/12/2016", "Verzekering Woning + Familiale", 550);
        transactionServices.addPlannedExpense("31/12/2016", "Schuldsaldoverzekering", 161.44);
//      transactionServices.addPlannedExpense("31/12/2016", "Laptop computer", 1500);
//      transactionServices.addPlannedExpense("31/12/2016", "Racefiets", 4000);


        String runningBalanceReport = transactionServices.reportRunningBalance(5000);

        System.out.println(runningBalanceReport);

    }

 }