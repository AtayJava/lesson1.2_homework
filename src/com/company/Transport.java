package com.company;

public class Transport {

    private String name;
    private int year;

    public Transport(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getInfo () {
        return "Transport : " +
                "\nname = " +name+
                "\nyear = " +year+
                " ";
    }
}
