package com.epam;

import com.epam.Characters.EarthPony;
import com.epam.Characters.Gryphon;
import com.epam.Characters.Pegasus;
import com.epam.Characters.Unicorn;
import com.epam.Services.Flying;
import com.epam.Services.MagicTeleportation;
import com.epam.Services.Walking;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MainTest {

    Walking w = new Walking();
    Flying f = new Flying();
    MagicTeleportation t = new MagicTeleportation();

    @Test
    public void earthPonyDoesntFly(){
        assertEquals(f.move(10,new EarthPony(2)), 2);
    }

    @Test
    public void earthPonyDoesntPort(){
        assertEquals(t.move(2, new EarthPony(3)),3);
    }

    @Test
    public void unicornDoesntFly(){
        assertEquals(f.move(3, new Unicorn(3)),3);
    }

    @Test
    public void pegasusDoesntPort(){
        assertEquals(t.move(3, new Pegasus(4)),4);
    }

    @Test
    public void gryphonDoesntPort(){
        assertEquals(t.move(3, new Gryphon(5)),5);
    }
}