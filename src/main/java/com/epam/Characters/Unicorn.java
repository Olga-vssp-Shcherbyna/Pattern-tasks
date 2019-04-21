package com.epam.Characters;

public class Unicorn extends mlpChar{
    private int position;

    @Override
    public String getType(){
        return "Unicorn";
    }

    public Unicorn(int position) {
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
