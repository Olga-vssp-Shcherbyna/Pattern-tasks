package com.Fay.Subs;

public class MermaidSub extends Sub {
    @Override
    public String getLang() {
        return "Mermaid subs file";
    }

    public MermaidSub() {
        System.out.println(getLang());
    }
}