package com.epam;

public class Article implements Cloneable{
    private String name;

    public String getName(){
        return this.name;
    }

    public Article(String name){
        this.name = name;
    }

    @Override
    public Article clone() throws CloneNotSupportedException{
        Article copy = (Article) super.clone();
        return copy;
    }
}
