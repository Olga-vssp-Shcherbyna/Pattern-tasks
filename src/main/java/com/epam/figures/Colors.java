package com.epam.figures;


public enum Colors {
    RED, GREEN, BLUE, YELLOW, PINK;

    public static String randomValue(){
        String arr[] = new String[5];
        for (int i = 0; i<5; i++)
            arr[i]=Colors.values()[i].toString();
        return arr[(int)(5*Math.random())];
    }
}
