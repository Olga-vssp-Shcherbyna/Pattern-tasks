package com.Fay.institutions;

import com.Fay.production.Magazine;
import com.Fay.production.Newspaper;

import java.util.ArrayList;

public class Subscriber {

    private ArrayList<Magazine> magazineSubscription;
    private ArrayList<Newspaper> newspaperSubscription;
    private String name;

    public Subscriber(ArrayList<Magazine> magazineSubscription, ArrayList<Newspaper> newspaperSubscription, String name) {
        this.magazineSubscription = magazineSubscription;
        this.newspaperSubscription = newspaperSubscription;
        this.name = name;
    }

    public ArrayList<Magazine> getMagazineSubscription() {
        return magazineSubscription;
    }

    public ArrayList<Newspaper> getNewspaperSubscription() {
        return newspaperSubscription;
    }

    public String getName() {
        return name;
    }
}
