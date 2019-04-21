package com.Fay.Subs;

public class FrenchSub extends Sub {
    @Override
    public String getLang() {
        return "French subs file";
    }

    public FrenchSub() {
        System.out.println(getLang());
    }
}