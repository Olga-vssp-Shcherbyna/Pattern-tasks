package com.Fay.Subs;

public class GermanSub extends Sub {
    @Override
    public String getLang() {
        return "German subs file";
    }

    public GermanSub() {
        System.out.println(getLang());
    }
}