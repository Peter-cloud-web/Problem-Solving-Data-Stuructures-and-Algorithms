package com.company.bankDemo.bankV2;

import java.util.HashMap;
import java.util.Set;

public class Bank {

    private HashMap<Integer,BankAccount> accounts;
    private double rate = 0.01;
    private int nextacct;

    public Bank(HashMap<Integer,BankAccount> accounts,int n){
        this.accounts = accounts;
        nextacct = n;
    }

    public int newAccount(boolean isForeign){
        int acctnum = nextacct++;
        BankAccount ba = new BankAccount(acctnum);
        accounts.put(acctnum,ba);
        return acctnum;
    }

    public int getBalance(int acctnum){
        BankAccount ba = new BankAccount(acctnum);
        return ba.getBalance();
    }

    public void deposit(int acctnum,int amt){
        BankAccount ba = accounts.get(acctnum);
        ba.deposit(amt);
    }

    public void setForeign(int acctnum,boolean isforeign) {
        BankAccount ba = accounts.get(acctnum);
        ba.setForeign(isforeign);
    }


    public boolean authorizeLoan(int acctnum, int loanamt){
        BankAccount ba = accounts.get(acctnum);
        return ba.hasEnoughCollateral(loanamt);
    }


    public String toString() {
        String result = "The bank has " + accounts.size()
                + " accounts.";
        for (BankAccount ba : accounts.values())
            result += "\n\t" + ba.toString();
        return result;
    }

    public void addInterest() {
        for (BankAccount ba : accounts.values())
            ba.addInterest(rate);
    }

}
