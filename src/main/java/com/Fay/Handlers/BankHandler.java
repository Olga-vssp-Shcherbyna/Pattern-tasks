package com.Fay.Handlers;

import com.Fay.Pay;

public class BankHandler extends BasicHandler {
    public BankHandler(int order) {
        this.order=order;
    }

    @Override
    void printHandler() {
        System.out.println("Doing bank stuff");
    }

    @Override
    void filter(Pay pay) {
        System.out.println("Doing bank stuff for payment "+pay.getName());
    }
}
