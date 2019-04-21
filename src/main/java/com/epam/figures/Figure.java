package com.epam.figures;

public abstract class Figure {
    public abstract void setSize();
    public abstract int getSize();
    public abstract String getName();
    public abstract String getColor();

    @Override
    public String toString() {
        return "Size = "+this.getSize()+", name = "+this.getName()+", color = "+this.getColor();
    }
}
