package com.Fay.states;

import com.Fay.grant.GrantRequest;

public class UnderConsideration extends State{
    
    public State getState(GrantRequest request){
        return new UnderConsideration(request);
    }
    
    public void nextState(GrantRequest request) {
        if (request.getStatus().equalsIgnoreCase("ok"))
                request.setState(new Confirmed(request));
        else request.setState(new Rejected(request));
    }

    public UnderConsideration(GrantRequest request) {
        super(request);
        System.out.println("Grant request " + request.getId() + " is under consideration");
    }
}
