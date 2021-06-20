package com.company.bankDemo.bankV2;

import java.util.Scanner;

public class BankClient {
    private int current = -1;
    private Scanner scanner;
    private boolean done = false;
    private Bank bank;

    public BankClient(Scanner scanner,Bank bank){
        this.scanner = scanner;
        this.bank = bank;
    }

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
                    "\n6 = interest" +
                    "\n7 = foreign or local");
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
                boolean isForeign = false;
                newAccount(isForeign);
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
            case 7:
                setForeign();
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

    private void newAccount(boolean isForeign){
        isForeign = requestForeign();
        current = bank.newAccount(isForeign);
        System.out.println("Your new Account number is :" + current);
    }

    private void setForeign() {
        bank.setForeign(current, requestForeign());
    }

    private boolean requestForeign() {
        System.out.print("Enter 20 for foreign, 30 for domestic: ");
        int val = scanner.nextInt();
        return (val == 1);
    }

    private void select(){
        System.out.println("Enter account number# :");
        current = scanner.nextInt();
        int balance =bank.getBalance(current);
        System.out.println("The balance is :" + current + "is" + balance);
    }

    private void deposit(){
        System.out.println("Enter deposit amount :");
        int amt = scanner.nextInt();
        bank.deposit(current,amt);
    }

    private void authorizeLoan() {
        System.out.print("Enter loan amt: ");
        int loanamt = scanner.nextInt();
        if (bank.authorizeLoan(current, loanamt))
            System.out.println("Your loan is approved");
        else
            System.out.println("Your loan is denied");
    }

    private void showAll() {
        System.out.println(bank.toString());
    }

    private void addInterest() {
        bank.addInterest();
    }

}
