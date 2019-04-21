package com.Fay;

import com.Fay.grant.GrantRequest;

import java.util.ArrayList;

import static com.Fay.services.Cancel.cancel;


public class Main {
    public static void main(String[] args) {
        ArrayList<GrantRequest> requests = new ArrayList<GrantRequest>();
        requests.add(new GrantRequest("ok"));
        requests.add(new GrantRequest("ok"));
        requests.add(new GrantRequest("neOk"));
        requests.add(new GrantRequest("neOk"));
        requests.add(new GrantRequest("ok"));
        for (GrantRequest request : requests){
            System.out.println(request.getId());
            System.out.println(request.getStatus());
            request.nextState();
            request.nextState();
            if (request.getStatus().equalsIgnoreCase("neOk"))
                cancel(request);
        }
        System.out.println();
        for (GrantRequest request :requests)
            request.getState();
    }
}
