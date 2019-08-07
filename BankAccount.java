package com.maiya.bankaccount;

import java.util.Random;

public class BankAccount {
	private static int totalAccounts;
	private static double totalMoney;
	private String accountNumber;
	private double checking;
	private double savings;

	public BankAccount() {
		this.generateAccountNumber();
		totalAccounts++;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}

	public static int getTotalAccounts() {
		return totalAccounts;
	}

	public double deposit(String accountType, double amount) {
		if (accountType == "checking") {
			this.checking += amount;
			totalMoney += amount;
			return this.getChecking();
		} else if (accountType == "savings") {
			this.savings += amount;
			totalMoney += amount;
			return this.getSavings();
		} else {
			System.out.println("error");
			return -1.0;
		}
	}

	public double withdraw(String accountType, double amount) {
		if (accountType == "checking") {
			if (this.checking >= amount) {
				this.checking -= amount;
				totalMoney -= amount;
			} else {
				System.out.println("Insufficient funds");
			}
			return this.getChecking();
		} else if (accountType == "savings") {
			if (this.savings >= amount) {
				this.savings -= amount;
				totalMoney -= amount;
			} else {
				System.out.println("Insufficient funds");
			}
			return this.getSavings();
		} else {
			System.out.println("error");
			return -1.0;
		}
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public double getChecking() {
		return this.checking;
	}

	public double getSavings() {
		return this.savings;
	}

	public double getTotal() {
		return this.checking + this.savings;
	}

	private void generateAccountNumber() {
		String acctnum = "";
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			acctnum += String.valueOf(r.nextInt(9));
		}
		this.accountNumber = acctnum;
	}
}
