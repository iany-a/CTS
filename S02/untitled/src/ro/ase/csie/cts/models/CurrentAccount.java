package ro.ase.csie.cts.models;

import ro.ase.csie.cts.exceptions.IllegalTransferException;
import ro.ase.csie.cts.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {

    private static final double MAX_CREDIT = 5000;


    //getter for constant private field
    public static double getMaxCredit(){
        return CurrentAccount.MAX_CREDIT;
    }

    protected CurrentAccount(String iban) {
        super(iban);
    }

    @Override
    public void deposit(double amount) {
        //check that the balance will not exceed 2x the credit line
        if ((this.balance += amount) > 2 * CurrentAccount.MAX_CREDIT){
            throw new IllegalTransferException();
        }
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        //do not use throws as it breaks the "contract" between the parent class and this class
        if ((this.balance - amount) < 0){
                throw new InsufficientFundsException("No more money!");
        }

        this.balance -= amount;

    }

    @Override
    public void transfer(Account destination, double amount) throws InsufficientFundsException {
        this.withdraw(amount);
        destination.deposit(amount);
    }
}
