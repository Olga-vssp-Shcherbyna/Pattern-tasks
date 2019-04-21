package com.Fay;

import com.Fay.grant.GrantRequest;
import com.Fay.states.Confirmed;
import com.Fay.states.Rejected;
import com.Fay.states.UnderConsideration;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private GrantRequest request, badRequest;

    @Before
    public void setUp() throws Exception {
        request = new GrantRequest("ok");
        badRequest = new GrantRequest("neOk");
    }

    @Test
    public void nextStateCheck(){
        request.nextState();
        badRequest.nextState();
        assertTrue(request.getState().equals(new UnderConsideration(request)));
        assertTrue(badRequest.getState().equals(new UnderConsideration(badRequest)));
    }

    @Test
    public void finalStateCheck(){
        request.nextState();
        request.nextState();
        badRequest.nextState();
        badRequest.nextState();
        assertTrue(request.getState().equals(new Confirmed(request)));
        assertTrue(badRequest.getState().equals(new Rejected(badRequest)));
    }
}