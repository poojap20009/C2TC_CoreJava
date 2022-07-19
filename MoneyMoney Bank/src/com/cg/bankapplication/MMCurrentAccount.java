package com.cg.bankapplication;

import com.cg.framework.CurrentAccount;

public class MMCurrentAccount extends CurrentAccount {
	public MMCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}
	
	public void withdraw(float creditLimit)
	{
		System.out.println("Check the current account balance:" +getAccBal());
	}

	@Override
	public String toString() {
		return "MMCurrentAccount [ toString()=" + super.toString() + ", getClass()=" + getClass() +", hashCode()=" + hashCode() +"]";
	}

	
	
}
