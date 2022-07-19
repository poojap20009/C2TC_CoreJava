package com.cg.framework;

public abstract class BankFactory {
	public abstract SavingsAccount getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary);
	public abstract CurrentAccount getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit);
	
}
