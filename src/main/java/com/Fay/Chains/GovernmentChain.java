package com.Fay.Chains;

import com.Fay.Handlers.BasicHandler;
import com.Fay.Handlers.HandlersInit;


public class GovernmentChain {
    public static BasicHandler governmentChain = HandlersInit.validationHandler.link(HandlersInit.saveHandler);
}
