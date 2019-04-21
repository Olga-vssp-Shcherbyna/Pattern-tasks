package com.Fay.services;

import com.Fay.grant.GrantRequest;
import com.Fay.states.Canceled;

public class Cancel {
    public static void cancel(GrantRequest request){
            request.setState(new Canceled(request));
    }
}
