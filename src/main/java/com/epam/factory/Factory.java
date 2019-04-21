package com.epam.factory;

import com.epam.figures.Figure;

import com.epam.figures.*;

import static java.lang.Math.*;

public class Factory {

    private static String[] figures = {"Line","Square","T","Z","rFigure","SuperFigure"};

    public static String[] getFigures(){
        return figures;
    }

    public static Figure getFigure(String type){
        if (type.equalsIgnoreCase("Line")) return new Line();
        else if (type.equalsIgnoreCase("T")) return new T();
        else if (type.equalsIgnoreCase("rFigure")) return new rFigure();
        else if (type.equalsIgnoreCase("Z")) return new Z();
        else if (type.equalsIgnoreCase("Square")) return new Square();
        else if (type.equalsIgnoreCase("SuperFigure")) return new SuperFigure();
        else {System.out.println("Wrong type"); return null;}
    }

    public static Figure getRandomFigure(){
        int i = (int)(6* random());
        String s = figures[i];
        Figure randomFigure = Factory.getFigure(s);
        return randomFigure;
    }
}
