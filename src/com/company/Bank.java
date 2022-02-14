package com.company;

public class Bank {

    //Give bank 2 properties
    //name
    //cashInVault
//Create accessor methods for both properties
//Create a method in Bank called Deposit
    //Deposit should take a parameter for amount to be deposited
    //Deposit should add the amount passed through its parameter to the property cashInVault
    //Deposit should print to the console stating the branch name, amount deposited, and current cash in the vault
//Create a method in Bank called Withdrawal
    //Withdrawal should take a parameter for the amount to be withdrawn.
    //Withdrawal should subtract the amount passed through its parameter from the property cashInVault
    //Withdrawal should print to the console stating the branch name, amount withdrawn, and current cash in the vault

    //Giving bank 2 properties name and cash in vault
    private String branchName;
    private double cashInVault;

    //create setter methods for both properties

    public void setBranchName (String name) {
        branchName = name;
    }
    public void setCashInVault (double cash) {
        cashInVault = cash;

    }

    //create getter methods for each
    public String getBranchName() {
        return branchName;
    }

    public double getCashInVault() {
        return cashInVault;
    }

    //Create deposit method
    public void deposit(double amount) {
        double newBalance = cashInVault + amount;
        cashInVault = newBalance;

        System.out.println("Branch Name: "+ branchName + ". " + '\n' +
                "Amount deposited: " + "$" + amount + '\n' +"Account balance: " +"$" + newBalance + '\n');
    }

    //Create withdrawal method
    public void withdrawal(double amount) {
        double newBalance = cashInVault - amount;
        cashInVault = newBalance;

        System.out.println("Branch Name: " + branchName + ". " + '\n' +
                "Amount withdrawn: " + "$" + amount + '\n' + "Account balance: " + "$" + newBalance + '\n');
    }
}
