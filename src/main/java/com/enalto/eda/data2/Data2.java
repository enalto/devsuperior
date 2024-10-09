package com.enalto.eda.data2;

public class Data2 {
    public static void main(String[] args) {
        FormatDate formatDate = new FormatDate(21,07,2010);
        System.out.println(formatDate.format());

    }
}

class FormatDate{
    private final int day;
    private final int month;
    private final int year;

    FormatDate(int day, int month, int year){
        if(day < 1 || day > 31)
            throw new IllegalArgumentException("Dia invalido");
        if(month < 1 || month > 12)
            throw new IllegalArgumentException("Mes invalido");
        if(year < 1)
            throw new IllegalArgumentException("Ano invalido");

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String format(){
        return String.format("%02d/%02d/%04d", this.day, this.month, this.year);
    }
}