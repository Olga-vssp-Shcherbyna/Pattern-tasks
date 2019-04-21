package com.Fay;

import com.Fay.institutions.Publisher;
import com.Fay.institutions.Subscriber;
import org.junit.Test;

import java.util.ArrayList;

import static com.Fay.services.GetByName.getMagazineByName;
import static com.Fay.services.GetByName.getNewspaperByName;
import static com.Fay.services.SubscriberServices.publications;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void nullCheckForSubscriptionList() {
        Subscriber s = new Subscriber(new ArrayList<>(),new ArrayList<>(), "user");
        assertFalse(publications(s).contains("anything"));
    }
    @Test
    public void getByNameCheck(){
        Publisher p = new Publisher();
        p.createNewspaper("check");
        p.createMagazine("mCheck");
        assertNotNull(getMagazineByName("mCheck",p));
        assertNotNull(getNewspaperByName("check",p));
    }
}