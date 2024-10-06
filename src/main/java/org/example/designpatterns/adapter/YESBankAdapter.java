package org.example.designpatterns.adapter;

import org.example.designpatterns.adapter.thirdParty.yesbank.YESBank;

public class YESBankAdapter implements BankAPI{
    private YESBank yesBank = new YESBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        yesBank.transferMoney(amount, from, to);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}
