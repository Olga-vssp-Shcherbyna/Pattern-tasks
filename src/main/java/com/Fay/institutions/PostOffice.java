package com.Fay.institutions;

import com.Fay.production.Magazine;
import com.Fay.production.Newspaper;

import java.util.ArrayList;

import static com.Fay.services.SubscriberServices.alert;

public class PostOffice {

    private static ArrayList<Newspaper> newspapers;
    private static ArrayList<Magazine> magazines;
    private static ArrayList<Subscriber> subscribers = new ArrayList<>();

    public static void getNewspapersFromPublisher(Publisher publisher){
        newspapers = publisher.getNewspapers();
    }

    public static void getMagazinesFromPublisher(Publisher publisher){
        magazines = publisher.getMagazines();
    }

    public static void subscribe(Subscriber s){
        subscribers.add(s);
    }

    public static void unsubscribe(Subscriber s){
        subscribers.remove(s);
    }

    public static void sendPapers(){
        ArrayList<Subscriber> subs = new ArrayList<>();
        for (Subscriber s : subscribers)
            for (Magazine m : magazines)
                for (Newspaper p : newspapers) {
                    if (s.getMagazineSubscription().contains(m) || s.getNewspaperSubscription().contains(p))
                        if (!subs.contains(s)) subs.add(s);
                }
        for (Subscriber s : subs) alert(s);
    }
}
