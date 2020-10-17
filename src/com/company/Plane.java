package com.company;

public class Plane extends Transport {
    private String model;
    private Color color;
    private int hour;


    public Plane(String name, int year) {
        super(name, year);
    }

    public Plane(String name, int year, String model, Color color, int hour) {
        super(name, year);
        this.model = model;
        this.color = color;
        this.hour = hour;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public int getHour() {
        return hour;
    }

    public void time (int hour) {
        System.out.println("Самолет прибудет через " +hour+ "ч.") ;
    }

    public final void time (int hour, String model) {
        System.out.println("Модель самолета " +model+ "прибудет через " +hour+ "ч.");
    }
}
