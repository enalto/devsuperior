package com.enalto.eda.invalidtransaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionValidator {

    private static final int AMOUNT_LIMIT = 1000;
    private static final int MIN_INTERVAL = 60;

    private final String[] arr;
    private final List<Transaction> list = new ArrayList<>();

    public TransactionValidator(String[] transactions) {
        this.arr = transactions;
        strToTransaction(arr);
    }

    private void strToTransaction(String[] strTransaction) {
        for (int i = 0; i < strTransaction.length; i++) {
            list.add(new Transaction(strTransaction[i]));
        }
    }

    public List<Transaction> transactionCheck() {

        boolean[] markedTransaction = new boolean[list.size()];
        Transaction firstTransaction;

        for (int i = 0; i < list.size(); i++) {
            firstTransaction = list.get(i);
            if (firstTransaction.getAmount() >= AMOUNT_LIMIT) {
                markedTransaction[i] = true;
            }
            for (int j = i + 1; j < list.size(); j++) {
                var nextTransaction = list.get(j);

                if (nextTransaction.isTheSameName(firstTransaction)
                        && !(nextTransaction.isTheSameCity(firstTransaction))
                        && nextTransaction.getElapsedTime(firstTransaction) <= MIN_INTERVAL) {
                    markedTransaction[i] = true;
                    markedTransaction[j] = true;
                }
            }
        }

        return getTransactions(markedTransaction);
    }

    private ArrayList<Transaction> getTransactions(boolean[] markedTransaction) {
        int length = markedTransaction.length;
        ArrayList<Transaction> invalidTransactions = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (markedTransaction[i]) {
                invalidTransactions.add(list.get(i));

            }
        }
        return invalidTransactions;
    }

}