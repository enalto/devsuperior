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
    private final String[] splitData;

    public Data(String data) {
        this.splitData = data.split("/");
    }

    public Integer getDia() {
        return Integer.valueOf(splitData[0]);
//        return Integer.valueOf(this.data.split("/")[0]);
    }

    public Integer getMes() {
        return Integer.valueOf(splitData[1]);
//        return Integer.valueOf(this.data.split("/")[1]);
    }

    public Integer getAno() {
        return Integer.valueOf(splitData[2]);
//        return Integer.valueOf(this.data.split("/")[2]);
    }

}
