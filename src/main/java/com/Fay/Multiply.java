package com.Fay;

public class Multiply extends Calculation {
    public Multiply(Operation leftLeaf, Operation rightLeaf) {
        super(leftLeaf, rightLeaf);
    }

    @Override
    public int calculate() {
        return super.getLeftLeaf().calculate() * super.getRightLeaf().calculate();
    }
}
