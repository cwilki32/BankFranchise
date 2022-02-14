package com.company;

import java.util.Scanner;

public class BankFranchise {
//Create a new project in IntelliJ named BankFranchise
//Rename your Main file to BankFranchise(right-click -> Refactor -> Rename…)
//Create a new Java class file (File -> New -> Java Class) named Bank
//In BankFranchise instantiate 2 instances of Bank.
    //Give each bank a name using accessor methods
    //Give each bank a starting cashInVault value of 100,000 using accessor methods
    //Call the deposit and withdraw methods twice for each bank instance.

    public static void main(String[] args) {
        // instantiate 2 banks
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        //name banks

        bank1.setBranchName("Super Fun Money"); //naming 1st bank
        bank2.setBranchName("Super Boring Money"); //naming 2nd bank

        //Give each bank a starting cashInValue value of 100,000
        bank1.setCashInVault(100000); //giving starting value to 100000
        bank2.setCashInVault(100000); // giving starting value of 100000

        //call deposit and withdraw methods twice for each bank instance
        bank1.deposit(50000);
        bank1.deposit(40000);

        bank2.deposit(20000);
        bank2.deposit(10000);

        bank1.withdrawal(70000);
        bank1.withdrawal(20000);

        bank2.withdrawal(30000);
        bank2.withdrawal(10000);

        //self created bonus Create a menu for a customer to select branch and what they want to do
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome, please choose your branch: Super Fun Money or Super Boring Money");
        String branchSelection = userInput.next();
        boolean keepAsking = true;

        while (keepAsking == true) {
            if (branchSelection.equals(bank1.getBranchName()) || branchSelection.equals(bank2.getBranchName())) {
                System.out.println("What would you like to do today? Deposit or withdraw");
                keepAsking = false;
            } else {
                System.out.println("Sorry that is not a valid option, please try again: ");
                branchSelection = userInput.next();
            }
        }
    }
}
