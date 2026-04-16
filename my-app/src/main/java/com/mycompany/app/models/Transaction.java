package com.mycompany.app.models;

import java.time.LocalDateTime;

public class Transaction {

    private static int count = 0;

    private final int id;
    private double value;
    private final LocalDateTime date;

    public Transaction() {
        this(0);
    }

    public Transaction(double value) {

        this.id = ++count;
        this.value = value;
        this.date = LocalDateTime.now();
    }

    public int getId() {
        return this.id;
    }

    public double getValue() {
        return value;
    }

    public LocalDateTime getDate() {
        return date;
    }


    public void setValue(double value) {
        this.value = value;
    }
}
