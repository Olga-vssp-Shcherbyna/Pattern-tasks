package com.Fay;

public class Composite {
    public static int Composite(int v1, int v2, int v3, int v4, int v5, int v6) {
        Calculation calculation = new Sum(
                new Multiply
                        (new Sum(new IntegerLeaf(v1), new IntegerLeaf(v2)),
                                new IntegerLeaf(v3)),
                new Multiply(
                        new IntegerLeaf(v4),
                        new Sum(new IntegerLeaf(v5), new IntegerLeaf(v6))));
        return calculation.calculate();
    }
}
