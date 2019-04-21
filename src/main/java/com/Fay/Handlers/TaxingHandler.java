package com.Fay.Handlers;

import com.Fay.Pay;

public class TaxingHandler extends BasicHandler {
    public TaxingHandler(int order) {
        this.order=order;
    }

    @Override
    void printHandler() {
        System.out.println("Doing tax stuff");
    }

    @Override
    void filter(Pay pay) {
        System.out.println("Doing fixing stuff for payment "+pay.getName());
    }
}
