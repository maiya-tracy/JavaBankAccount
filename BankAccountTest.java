package com.maiya.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		BankAccount b1 = new BankAccount();
		System.out.println(b.getAccountNumber());
		System.out.println(b1.getAccountNumber());
		
		b.deposit("savings", 500.0);
		b.deposit("checking", 70.0);
		System.out.println(b.getChecking());
		System.out.println(b.getSavings());
		System.out.println(b.getTotal());
		b.withdraw("savings", 200.0);
		System.out.println(b.getChecking());
		System.out.println(b.getSavings());
		System.out.println(b.getTotal());
		
		b1.withdraw("checking", 10.0);
		System.out.println(b1.getChecking());
//		b1.checking = 100;
	}

}
