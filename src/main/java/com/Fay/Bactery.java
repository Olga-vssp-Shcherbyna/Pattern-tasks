package com.Fay;

public class Bactery {
    private int x;
    private int y;
    private int id;
    private BacteryType type;
    private static int count = 0;

    public Bactery(int x, int y, BacteryType type) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.id=++count;
    }

    public String getType() {
        return type.getType();
    }
}
