package com.epam.Characters;

public class EarthPony extends mlpChar {

    private int position;

    @Override
    public String getType(){
        return "Earth pony";
    }

    public EarthPony(int position) {
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
