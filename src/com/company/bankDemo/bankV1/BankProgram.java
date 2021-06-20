package com.company.bankDemo.bankV1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class  BankProgram {

    private HashMap<Integer,Integer> accounts = new HashMap<>();
    private double rate = 0.1;
    private int nextAccount = 0;
    private int current = -1;
    private Scanner scanner;
    private boolean done  = false;

    public void run(){
        scanner = new Scanner(System.in);
        while(!done){
            System.out.println("Enter command :" +
                    "\n0 = quit" +
                    "\n1 = new" +
                    "\n2 = select" +
                    "\n3 = deposit" +
                    "\n4 = loan" +
                    "\n5 = show" +
                    "\n6 = interest");
            int cmd = scanner.nextInt();
            processCommand(cmd);
        }
        scanner.close();
    }
    private void processCommand(int cmd){
        switch(cmd){
            case 0:
                quit();
                break;
            case 1:
                newAccount();
                break;
            case 2:
                select();
                break;
            case 3:
                deposit();
                break;
            case 4:
                authorizeLoan();
                break;
            case 5:
                showAll();
                break;
            case 6:
                addInterest();
                break;
            default:
                System.out.println("Illegal Command");
                break;
        }
    }

    public void quit(){
        done = true;
        System.out.println("Goodbye");
    }

    public void newAccount(){
        current = nextAccount++;
        accounts.put(current,0);
        System.out.println("Your new account number is :" + current);
    }

    private void select(){
        System.out.println("Enter account# :");
        current = scanner.nextInt();
        int balance = accounts.get(current);
        System.out.println("The balance of account :" + current + "is" + balance) ;
    }

    public void deposit(){
        System.out.println("Enter deposit amount :");
        int amt = scanner.nextInt();
        int balance = accounts.get(current);
        accounts.put(current,balance+amt);
    }


    public void authorizeLoan(){
        System.out.println("Enter loan amount :");
        int loanAmt = scanner.nextInt();
        int balance = accounts.get(current);

        if(balance > loanAmt/2)
            System.out.println("Loan Approved");
        else
            System.out.println("Loan denied");

    }

    public void showAll(){
        Set<Integer> accts = accounts.keySet();
        System.out.println("The bank has : " + accts.size()
        + "accounts.");

        for(int i : accts)
            System.out.println("\tBank account " + i + ": balance = " + accounts.get(i));
    }

    public void addInterest(){
        Set<Integer> accts = accounts.keySet();
        for(int i:accts){
            int balance = accounts.get(i);
            int newBalance = (int)(balance * (1 + rate));
            accounts.put(i,newBalance);
        }
    }

    public static void main(String[] args){
        BankProgram bankProgram = new BankProgram();
        bankProgram.run();
    }


}
