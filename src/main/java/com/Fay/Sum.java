package com.Fay;

public class Sum extends Calculation {
    public Sum(Operation leftLeaf, Operation rightLeaf) {
        super(leftLeaf, rightLeaf);
    }

    @Override
    public int calculate() {
        return super.getLeftLeaf().calculate() + super.getRightLeaf().calculate();
    }
}
