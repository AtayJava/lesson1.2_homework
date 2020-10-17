package com.company;

public final class Airline extends Plane {
    private int flyTime;

    public Airline(String name, int year, int flyTime) {
        super(name, year);
        this.flyTime = flyTime;
    }

    public Airline(String name, int year, String model, Color color, int hour, int flyTime) {
        super(name, year, model, color, hour);
        this.flyTime = flyTime;
    }

    public int getFlyTime() {
        return flyTime;
    }

    @Override
    public void time(int hour) {
        super.time(hour);
    }

    public String getInfoAirline() {
        return "Время полета : " + flyTime + " ч." + getInfo() + getColor() + getModel() + getHour();
    }


}
