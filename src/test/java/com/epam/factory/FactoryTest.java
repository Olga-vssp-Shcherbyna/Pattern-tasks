package com.epam.factory;

import com.epam.figures.Figure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTest {

    Figure figure;

    @Before
    public void setUp() throws Exception {
        figure = Factory.getRandomFigure();
    }

    @Test
    public void shouldReturnTrueWhenSizeIsPositive(){
        int result = figure.getSize();
        assertTrue("size is negative", result>0);
    }

    @Test
    public void shouldReturnWrongTypeMessage(){
        Figure figure1 = Factory.getFigure("type");
        assertNull(figure1);
    }

    @Test
    public void getFigureTest(){
        String[] figures = Factory.getFigures();
        for (String f : figures) {
            Figure figure = Factory.getFigure(f);
            assertNotNull("figure was null", figure);
        }
    }
}