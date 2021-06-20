package com.company.bankDemo.bankV2;

import java.util.HashMap;
import java.util.Scanner;

public class BankProgram2  {

    public static void main(String[] args){
        HashMap<Integer,BankAccount> accounts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank(accounts, 0);
        BankClient client = new BankClient(scanner,bank);
        client.run();
    }
}
