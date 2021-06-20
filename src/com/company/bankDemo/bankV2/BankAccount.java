package com.company.bankDemo.bankV2;

public class BankAccount {
    private int acctnum;
    private int balance = 0;
    private boolean isForeign = false;

    public BankAccount(int a){
        acctnum = a;
    }

    public int getAcctnum() {
        return acctnum;
    }

    public void setAcctnum(int acctnum) {
        this.acctnum = acctnum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isForeign() {
        return isForeign;
    }

    public void setForeign(boolean foreign) {
        isForeign = foreign;
    }
    public void deposit(int amt){
        balance += amt;
    }

    public boolean hasEnoughCollateral(int loanamt){
        return balance >= loanamt/2;
    }

    public String toString(boolean isforeign) {
        return "Bank account " + acctnum + ": balance="
                + balance + ", is "
                + (isforeign ? "foreign" : "domestic");
    }
    public void addInterest(double rate) {
        balance += (int) (balance * rate);
    }


}
