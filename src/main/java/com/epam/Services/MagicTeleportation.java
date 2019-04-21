package com.epam.Services;

import com.epam.Characters.Unicorn;
import com.epam.Characters.mlpChar;

public class MagicTeleportation implements MoveStrategy {

    private int position;

    public void setPosition(int position) {
        this.position = position;
    }


    public int move(int distance, mlpChar c){
        if (c instanceof Unicorn) {
            setPosition(c.getPosition());
            System.out.print(c.getType()+": ");
            setPosition(getPosition()+distance);
            System.out.println("Apparate!");
            c.setPosition(getPosition());}
        else System.out.println(c.getType()+" can not teleport");
        return c.getPosition();
    }

    public int getPosition() {
        return position;
    }
}
