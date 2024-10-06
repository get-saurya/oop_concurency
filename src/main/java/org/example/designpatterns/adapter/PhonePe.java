package org.example.designpatterns.adapter;

public class PhonePe {
    //Ideally we should use dependency Injection here
    private static BankAPI bankAPI = new ICICIAdapter();
   // private static BankAPI bankAPI2 = new YESBankAdapter();

    public static void main(String[] args) {
        bankAPI.sendMoney("1234", "6789", 1000);
    }

}
