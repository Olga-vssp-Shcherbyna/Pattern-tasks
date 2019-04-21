package com.Fay;


public class Main {
    public static void main(String[] args) {
        BacteryCup cup = new BacteryCup();
        for (int i = 0; i<1304*Math.random(); i++){
            cup.newBacteria((int)(60*i*Math.random()),(int)(80*i*Math.random()),"Alien Type");
        }
        for (int i = 0; i<3404*Math.random(); i++) {
            cup.newBacteria((int) (20 * i * Math.random()), (int) (40 * i * Math.random()), "Unknown Type");
        }
        cup.countBacteria();
        cup.countType("Unknown Type");
        cup.countType("Alien Type");
    }
}
