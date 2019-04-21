package com.Fay.Handlers;

import com.Fay.Pay;

public class ValidationHandler extends BasicHandler {

    public ValidationHandler(int order) {
        this.order=order;
    }

    @Override
    void printHandler() {
        System.out.println("Doing validation stuff");
    }

    @Override
    void filter(Pay pay) {
        System.out.println("Doing validation stuff for payment "+pay.getName());
    }
}
