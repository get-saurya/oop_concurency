package org.example.designpatterns.adapter.thirdParty.yesbank;

public class YESBank {

    public void transferMoney(int amount, String from, String to) {
        System.out.println("Transferring money via YES Bank");
    }
    //can have multiple methods as getBalance, registerAccount
}
