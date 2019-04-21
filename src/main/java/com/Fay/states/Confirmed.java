package com.Fay.states;

import com.Fay.grant.GrantRequest;

public class Confirmed extends State{

    public State getState(GrantRequest request){
    return new Confirmed(request);
    }

    public Confirmed(GrantRequest request) {
        super(request);
        System.out.println("Grant request " + request.getId() + " is confirmed because it was ok");
    }

    public void nextState(GrantRequest request) {}
}
