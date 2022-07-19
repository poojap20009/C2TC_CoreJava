package com.cg.bankapplication;

import com.cg.framework.SavingsAccount;


public class MMSavingAccount extends SavingsAccount {
		private static final float MINBAL = 2;
		public MMSavingAccount(int accNo, String accNm, float accBal, boolean issalary)
		{
			super(accNo, accNm, accBal, issalary);
		}
		
		public void withdraw(float accBal)
		{
			System.out.println("Withdrawl amount:"+accBal);

		}

		@Override
		public String toString() {
			return "MMSavingAccount [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + "]";
		}

		
}
