package com.Fay;

import com.Fay.Chains.BankChain;
import com.Fay.Chains.GovernmentChain;
import com.Fay.Chains.OrdinaryChain;
import com.Fay.Handlers.BasicHandler;

public class Main {

    public static void main(String[] args) {
        Pay ordinary = new Pay("Client payment");
        Pay govPay = new Pay("VERY IMPORTANT PAYMENT (no)");
        Pay bank = new Pay("just another bank payment");
        OrdinaryChain.ordinaryChain.check(ordinary, BasicHandler.END);
        GovernmentChain.governmentChain.check(govPay, BasicHandler.END);
        BankChain.bankChain.check(bank,BasicHandler.END);
    }
}
