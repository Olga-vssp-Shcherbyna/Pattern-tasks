package com.epam.Characters;

import com.epam.Services.Flying;
import com.epam.Services.MagicTeleportation;
import com.epam.Services.Walking;

public class mlpChar {

    private int position;

    public String getType(){
        return "Type";
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int walk(int distance){
        Walking w = new Walking();
        return w.move(distance, this);
    }

    public int fly(int distance){
        Flying f = new Flying();
        return f.move(distance, this);
    }
    public int port(int distance){
        MagicTeleportation p = new MagicTeleportation();
        return p.move(distance, this);
    }
}
