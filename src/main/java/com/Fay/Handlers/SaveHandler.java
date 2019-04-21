package com.Fay.Handlers;

import com.Fay.Pay;

public class SaveHandler extends BasicHandler {
    public SaveHandler(int order) {
        this.order=order;
    }

    @Override
    void printHandler() {
        System.out.println("Saving stuff");
    }

    @Override
    void filter(Pay pay) {
        System.out.printf("All stuff for payment %s done %n",pay.getName());
    }
}
