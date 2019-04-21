package com.Fay.services;

import com.Fay.institutions.PostOffice;
import com.Fay.institutions.Subscriber;
import com.Fay.production.Magazine;
import com.Fay.production.Newspaper;

public class SubscriberServices {

    public static void subscribe(Object o, Subscriber s){
        if (o instanceof Newspaper)
            s.getNewspaperSubscription().add((Newspaper)o);
        else if (o instanceof Magazine)
            s.getMagazineSubscription().add((Magazine)o);
        PostOffice.subscribe(s);
    }

    public static void unsubscribe(Object o, Subscriber s){
        if (o instanceof Newspaper)
            s.getNewspaperSubscription().remove(o);
        else if (o instanceof Magazine)
            s.getMagazineSubscription().remove(o);
        if (s.getMagazineSubscription().isEmpty()&&s.getNewspaperSubscription().isEmpty())
            PostOffice.unsubscribe(s);
    }
    public static void alert(Subscriber s){
        System.out.println("Dear "+ s.getName() +", your publications"+publications(s)+"delivered, wait for them for a few hours");
    }

    public static String publications(Subscriber s){
        String names = " ";
        for (Magazine m : s.getMagazineSubscription()){
            names=names.concat("\""+m.getName()+"\", ");
        }
        for (Newspaper n : s.getNewspaperSubscription()){
            if (s.getNewspaperSubscription().get(s.getNewspaperSubscription().size()-1)!=n)
                names=names.concat("\""+n.getName()+"\", ");
            else names=names.concat("\""+n.getName()+"\" ");
        }
        return names;
    }
}
