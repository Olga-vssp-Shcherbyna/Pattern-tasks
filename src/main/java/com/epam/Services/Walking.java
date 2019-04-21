package com.epam.Services;

import com.epam.Characters.mlpChar;

public class Walking implements MoveStrategy{

    private int position;

    public void setPosition(int position) {
        this.position = position;
    }

    public int move(int distance, mlpChar c){
        setPosition(c.getPosition());
        System.out.print(c.getType()+": ");
        setPosition(getPosition()+distance);
        System.out.println("Knock-knock-knock!");
        c.setPosition(getPosition());
        return c.getPosition();
    }

    public int getPosition() {
        return position;
    }
}
