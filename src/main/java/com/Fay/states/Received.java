package com.Fay.states;

import com.Fay.grant.GrantRequest;

public class Received extends State{

    public State getState(GrantRequest request){
        return new Received(request);
    }

    public void nextState(GrantRequest request) {
        request.setState(new UnderConsideration(request));
    }

    public Received(GrantRequest request) {
        super(request);
        System.out.println("Grant request " + request.getId() + " is received");
    }
}
