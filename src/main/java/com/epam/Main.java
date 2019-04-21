package com.epam;

import com.epam.Characters.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<mlpChar> characters = new ArrayList<mlpChar>();
        Gryphon gilda = new Gryphon(3);
        characters.add(gilda);
        EarthPony appleBloom = new EarthPony(2);
        characters.add(appleBloom);
        Pegasus scootalo = new Pegasus(7);
        characters.add(scootalo);
        Unicorn sweetieBell = new Unicorn(4);
        characters.add(sweetieBell);
        for (mlpChar c:characters) {
            c.port(3);
            c.walk(4);
            c.fly(5);
        }
    }

}
