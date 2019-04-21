package com.Fay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Receipt.Builder receiptBuilder = new Receipt.Builder()
                .setData("Some medicine")
                .setTerm(20);
        Receipt receipt = receiptBuilder.build();
        System.out.println("Term is "+receipt.getTerm());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter new term");
        int newTerm = Integer.parseInt(reader.readLine());
        receipt = receiptBuilder.setTerm(newTerm).build();
        System.out.println("New term is "+receipt.getTerm());
    }
}
