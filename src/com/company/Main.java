package com.company;

public class Main {

    public static void main(String[] args) {
        Transport transport = new Transport("Boing",2020);

        Airline airline = new Airline(transport.getName(), 2020, "Lux",Color.BLACK, 5,7);

        System.out.println(airline.getInfoAirline());


    }
}
