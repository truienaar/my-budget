package be.vansichen.raf.mybudget.model;

import java.io.File;
import java.util.*;

public class TransactionRepository {

    private Collection<Transaction> transactions = new ArrayList<>();

    public TransactionRepository(){
        load();
    }

    private static void load(){
        File file = new File("/home/raf/it-projects/my-budget/backend/src/database/mybudget-raf-2016.xml");
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public Collection<Transaction> getTransactions() {
        return Collections.unmodifiableCollection(transactions);
    }
}
