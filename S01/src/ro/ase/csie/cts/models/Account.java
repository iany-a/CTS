package ro.ase.csie.cts.models;

public abstract class Account { //abstract meaning you can not create Account objects
	public abstract void deposit(double amount); // need to specify abstract on each method
	public abstract void withdraw(double amount);
	public abstract void transfer(Account destination, double amount);
	public abstract double getBalance();
}
