package com.Fay.states;

import com.Fay.grant.GrantRequest;

public class Canceled extends State{

    public State getState(GrantRequest request){
        return new Canceled(request);
    }

    public Canceled(GrantRequest request) {
        super(request);
        System.out.println("Grant request " + request.getId() + " is canceled");
    }

    public void nextState(GrantRequest request) {System.out.println("Grant request " + request.getId() + " is canceled");}
}
