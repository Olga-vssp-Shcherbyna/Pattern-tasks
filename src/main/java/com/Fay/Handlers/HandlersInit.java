package com.Fay.Handlers;


public class HandlersInit {
    public static BasicHandler validationHandler = new ValidationHandler(BasicHandler.VALID);
    public static BasicHandler taxingHandler = new TaxingHandler(BasicHandler.FIX);
    public static BasicHandler bankHandler = new BankHandler(BasicHandler.BANK);
    public static BasicHandler saveHandler = new SaveHandler(BasicHandler.END);
}
