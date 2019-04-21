package com.Fay.Chains;

import com.Fay.Handlers.BasicHandler;
import com.Fay.Handlers.HandlersInit;

public class OrdinaryChain {
    public static BasicHandler ordinaryChain = HandlersInit.validationHandler.link(HandlersInit.taxingHandler.link(HandlersInit.bankHandler.link(HandlersInit.saveHandler)));
}
