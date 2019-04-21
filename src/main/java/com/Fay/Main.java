package com.Fay;

import com.Fay.institutions.Publisher;
import com.Fay.institutions.Subscriber;

import java.util.ArrayList;

import static com.Fay.institutions.PostOffice.*;
import static com.Fay.services.GetByName.getMagazineByName;
import static com.Fay.services.GetByName.getNewspaperByName;
import static com.Fay.services.SubscriberServices.subscribe;

public class Main {
    public static void main(String[] args) {
        Publisher p = new Publisher();
        p.createMagazine("Witch Weekly");
        p.createMagazine("Nature");
        p.createMagazine("Springer");
        p.createNewspaper("Times");
        p.createNewspaper("Daily Prophet");
        p.createNewspaper("Washington post");
        Subscriber s = new Subscriber(new ArrayList<>(), new ArrayList<>(), "Mr. Alice Cooper");
        subscribe(getMagazineByName("Witch Weekly",p),s);
        subscribe(getNewspaperByName("Times",p),s);
        subscribe(getNewspaperByName("Daily Prophet",p),s);
        getMagazinesFromPublisher(p);
        getNewspapersFromPublisher(p);
        sendPapers();
    }
}
