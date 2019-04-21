package com.epam.figures;

public class SuperFigure extends Figure{
    private static String name="Super";
    private String color;
    public static int size = 4;

    @Override
    public void setSize() {
        this.size += 1 + Math.random()*10;
    }

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
    public SuperFigure() {
        this.color = Colors.randomValue();
        this.setSize();
    }
}
