package com.Fay.institutions;

import com.Fay.production.Magazine;
import com.Fay.production.Newspaper;

import java.util.ArrayList;

public class Publisher {

    private ArrayList<Newspaper> newspapers = new ArrayList<Newspaper>();
    private ArrayList<Magazine> magazines = new ArrayList<Magazine>();

    public void createNewspaper(String name){newspapers.add(new Newspaper(name));}
    public void createMagazine(String name){magazines.add(new Magazine(name));}

    public ArrayList<Newspaper> getNewspapers() {
        return newspapers;
    }

    public ArrayList<Magazine> getMagazines() {
        return magazines;
    }


}
