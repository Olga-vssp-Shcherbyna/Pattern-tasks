package com.Fay.Chains;

import com.Fay.Handlers.BasicHandler;
import com.Fay.Handlers.HandlersInit;

public class BankChain {
    public static BasicHandler bankChain = HandlersInit.validationHandler.link(HandlersInit.saveHandler);
}
