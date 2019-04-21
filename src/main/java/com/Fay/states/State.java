package com.Fay.states;

import com.Fay.grant.GrantRequest;

public abstract class State {
    private GrantRequest request;

    public State(GrantRequest request) {
        this.request = request;
    }
    public abstract void nextState(GrantRequest request);
    public abstract State getState(GrantRequest request);
}
