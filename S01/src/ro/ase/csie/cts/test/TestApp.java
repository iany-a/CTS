package ro.ase.csie.cts.test;

import ro.ase.csie.cts.exceptions.IllegalTransferException;
import ro.ase.csie.cts.exceptions.InsufficientFundsException;
import ro.ase.csie.cts.models.Account;

public class TestApp {
	
	public static void testIllegalTransfer() {
		System.out.println("Test illegal transfer"); //syso + CTRL+SPACE
		throw new IllegalTransferException();
	}
	
	public static void testInsufficientFunds() throws InsufficientFundsException{
		System.out.println("Test insufficient funds"); //syso + CTRL+SPACE
		throw new InsufficientFundsException("Not enough money!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testIllegalTransfer();
		try {
			testInsufficientFunds();
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//Account account = new Account(); this will fail if class is abstract

}
