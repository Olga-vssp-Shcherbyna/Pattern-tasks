package com.Fay.Subs;

public class EnglishSub extends Sub {
    @Override
    public String getLang() {
        return "English subs file";
    }

    public EnglishSub() {
        System.out.println(getLang());
    }
}
