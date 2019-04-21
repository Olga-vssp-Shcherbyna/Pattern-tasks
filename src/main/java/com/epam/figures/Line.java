package com.epam.figures;

public class Line extends Figure{
    private static String name="Line";
    private String color;
    public static int size = 4;

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return this.color;
    }
    @Override
    public void setSize(){
        return;
    }

    public Line() {
        this.color = Colors.randomValue();
    }
}
