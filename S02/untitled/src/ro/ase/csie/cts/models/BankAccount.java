package ro.ase.csie.cts.models;

public abstract class BankAccount extends Account {
    protected double balance;
    protected final String iban;


    protected BankAccount(String iban) { //protected or public does not matter in abstract case
        this.iban = iban;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }




}
