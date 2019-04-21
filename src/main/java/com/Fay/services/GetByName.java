package com.Fay.services;

import com.Fay.institutions.Publisher;
import com.Fay.production.Magazine;
import com.Fay.production.Newspaper;

public class GetByName {

    public static Newspaper getNewspaperByName(String name, Publisher p){
        Newspaper n = null;
        for (Newspaper n1 : p.getNewspapers())
            if (n1.getName().equalsIgnoreCase(name))
                n=n1;
        return n;
    }

    public static Magazine getMagazineByName(String name, Publisher p){
        Magazine m = null;
        for (Magazine m1 : p.getMagazines())
            if (m1.getName().equalsIgnoreCase(name))
                m=m1;
        return m;
    }
}
