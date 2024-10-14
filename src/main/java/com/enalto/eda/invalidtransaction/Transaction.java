package com.enalto.eda.invalidtransaction;

import java.util.Objects;

public class Transaction {
    private String name;
    private int instant;
    private int amount;
    private String city;

    public Transaction(String csv) {
        String[] parts = csv.split(",");

        this.name = parts[0];
        this.instant = Integer.parseInt(parts[1]);
        this.amount = Integer.parseInt(parts[2]);
        this.city = parts[3];
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInstant() {
        return instant;
    }

    public void setInstant(int instant) {
        this.instant = instant;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getElapsedTime(Transaction other) {
        return Math.abs(this.instant - other.getInstant());
    }

    public boolean isTheSameCity(Transaction other) {
        return this.city.equals(other.getCity());
    }

    public boolean isTheSameName(Transaction other) {
        return this.name.equals(other.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return instant == that.instant && amount == that.amount && Objects.equals(name, that.name) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, instant, amount, city);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "name='" + name + '\'' +
                ", instant=" + instant +
                ", amount=" + amount +
                ", city='" + city + '\'' +
                '}';
    }
}
