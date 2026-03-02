package ro.ase.csie.cts.models;

import ro.ase.csie.cts.models.enums.AccountType;

import java.util.ArrayList;

public class Bank {
    private String name;
    private int nextId = 1;

    //eager instantiation
    //1 bank to many bank accounts
    private ArrayList<BankAccount> accounts = new ArrayList<>(); //array list, equivalent to templates in C++

    public Bank(String name) {
        //super(); //eclipse adds super, IntelliJ does not
        this.name = name;
    }

    public BankAccount openAccount(AccountType type){
        switch(type) {
            case CURRENT:
                CurrentAccount current = new CurrentAccount(this.name + "-" + nextId);
                this.accounts.add(current);
                this.nextId++;
                return current;
            case SAVINGS:
                SavingsAccount savings = new SavingsAccount(this.name + "-" + nextId);
                this.accounts.add(savings);
                this.nextId++;
                return savings;
            default:
                throw new UnsupportedOperationException("Account type not covered.");
        }
    }





}
