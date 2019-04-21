package com.epam.Services;

import com.epam.Characters.Gryphon;
import com.epam.Characters.Pegasus;
import com.epam.Characters.mlpChar;

public class Flying implements MoveStrategy {

    private int position;

    public void setPosition(int position) {
        this.position = position;
    }


    public int move(int distance, mlpChar c){
        if (c instanceof Gryphon||c instanceof Pegasus) {
            setPosition(c.getPosition());
            System.out.print(c.getType()+": ");
            setPosition(getPosition()+distance);
            System.out.println("Wsss!");
            c.setPosition(getPosition());
        }
        else System.out.println(c.getType()+" can not fly");
        return c.getPosition();
    }

    public int getPosition() {
        return position;
    }
}
