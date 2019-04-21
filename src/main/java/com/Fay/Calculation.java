package com.Fay;


public abstract class Calculation implements Operation {
    private Operation leftLeaf;
    private Operation rightLeaf;

    public Calculation(Operation leftLeaf, Operation rightLeaf) {
        this.leftLeaf = leftLeaf;
        this.rightLeaf = rightLeaf;
    }

    public Operation getLeftLeaf() {
        return leftLeaf;
    }

    public Operation getRightLeaf() {
        return rightLeaf;
    }

    public abstract int calculate();
}
