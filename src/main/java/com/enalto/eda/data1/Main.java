package com.enalto.eda.data1;

public class Main {
    public static void main(String[] args) {

        Data data = new Data("21/07/2010");

        System.out.println(data.getDia());
        System.out.println(data.getMes());
        System.out.println(data.getAno());

    }
}

class Data {
    private final String data;

    public Data(String data) {
        this.data = data;
    }

    public Integer getDia() {
        return Integer.valueOf(this.data.split("/")[0]);
    }

    public Integer getMes() {
        return Integer.valueOf(this.data.split("/")[1]);
    }

    public Integer getAno() {
        return Integer.valueOf(this.data.split("/")[2]);
    }

}
