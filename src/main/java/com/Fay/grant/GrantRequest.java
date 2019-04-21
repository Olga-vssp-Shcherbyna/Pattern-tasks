package com.Fay.grant;

import com.Fay.states.Received;
import com.Fay.states.State;

public class GrantRequest {
    private int id;
    private static int count;
    private String status;
    private State state;

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public GrantRequest(String status) {
        if (status.equalsIgnoreCase("ok")||status.equalsIgnoreCase("neOk")) {
            this.status = status;
            this.id = ++count;
            this.state = new Received(this);
        }
        else System.out.println("Wrong status, please, try again");
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state.getState(this);
    }

    public void nextState(){
        this.state.nextState(this);
    }
}
