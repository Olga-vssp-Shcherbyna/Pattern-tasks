package com.Fay.states;

import com.Fay.grant.GrantRequest;

public class Rejected extends State{

    public State getState(GrantRequest request){
    return new Rejected(request);
    }

    public Rejected(GrantRequest request) {
        super(request);
        System.out.println("Grant request " + request.getId() + " is rejected because it was neOk");
    }

    public void nextState(GrantRequest request) {}
}
