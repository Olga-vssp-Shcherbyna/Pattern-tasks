package com.Fay;

import java.util.ArrayList;
import java.util.List;

public class BacteryCup {
    private static List<Bactery> bacteria = new ArrayList<>();

    public void newBacteria(int x, int y, String type) {
        BacteryType Type = BacteryFactory.getBacteryType(type);
        Bactery bactery = new Bactery(x, y, Type);
        bacteria.add(bactery);
    }

    public void countBacteria(){
        System.out.println("Number of bacteria: "+bacteria.size());
    }

    public void countType(String type){
        int count = 0;
        for (Bactery bactery : bacteria){
            if (bactery.getType().equalsIgnoreCase(type)){
                count++;
            }
        }
        System.out.printf("Number of bacteria type %s: %d %n",type, count);
    }
}
