package com.Fay;

public class IntegerLeaf implements Operation {
    private int num;

    public IntegerLeaf(int num) {
        this.num = num;
    }

    public int calculate() {
        return num;
    }
}
