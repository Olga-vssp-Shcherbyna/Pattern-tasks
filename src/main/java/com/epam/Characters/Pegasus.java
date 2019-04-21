package com.epam.Characters;

public class Pegasus extends mlpChar{
    private int position;

    @Override
    public String getType(){
        return "Pegasus";
    }

    public Pegasus(int position) {
        setPosition(position);
    }

    @Override
    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public int getPosition() {
        return position;
    }

}
