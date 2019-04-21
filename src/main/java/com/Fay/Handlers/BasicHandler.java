package com.Fay.Handlers;

import com.Fay.Pay;

public abstract class BasicHandler {
    private BasicHandler next;
    public static final int VALID = 0;
    public static final int FIX = 1;
    public static final int BANK = 2;
    public static final int END = 3;
    int order;

    public BasicHandler link(BasicHandler next){
        this.next=next;
        printHandler();
        return next;
    }

    public void check(Pay pay, int order){
        if (this.order<=order)
            filter(pay);
        else if (this.next!=null)
            next.filter(pay);
    }

    abstract void filter(Pay pay);
    abstract void printHandler();

}
