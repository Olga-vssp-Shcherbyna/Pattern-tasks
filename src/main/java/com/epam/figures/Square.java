package com.epam.figures;

public class Square extends Figure{
    private static String name="Square";
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

    public Square() {
        this.color = Colors.randomValue();
    }
}
