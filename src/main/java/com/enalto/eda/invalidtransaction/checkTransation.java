package com.enalto.eda.invalidtransaction;

import java.util.List;

public class checkTransation {

    private static final int AMOUNT_LIMIT = 1000;
    private static final int MIN_INTERVAL = 60;

    public static void main(String[] args) {
       // String[] transactions1 = {"alice,50,100,beijing", "alice,20,800,mtv"};
        String[] transactions1 = {"alice,50,100,beijing", "alice,20,800,mtv", "bob,60,300,sp", "ana,70,1100,sp"};
        String[] transactions2 = {"alice,20,800,mtv", "alice,50,1200,mtv"};
        String[] transactions3 = {"alice,20,800,mtv", "bob,50,1200,mtv"};

        TransactionValidator validator1 = new TransactionValidator(transactions1);
        TransactionValidator validator2 = new TransactionValidator(transactions2);
        TransactionValidator validator3 = new TransactionValidator(transactions3);

        List<Transaction> list1 = validator1.transactionCheck();
        System.out.println("Validator1");
        list1.forEach(System.out::println);

        List<Transaction> list2 = validator2.transactionCheck();
        System.out.println("Validator2");
        list2.forEach(System.out::println);

        List<Transaction> list3 = validator3.transactionCheck();
        System.out.println("Validator3");
        list3.forEach(System.out::println);

    }

}
