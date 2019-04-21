package com.epam.Characters;

public class Gryphon extends mlpChar {

    private int position;

    @Override
    public String getType(){
        return "Gryphon";
    }

    public Gryphon(int position) {
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
