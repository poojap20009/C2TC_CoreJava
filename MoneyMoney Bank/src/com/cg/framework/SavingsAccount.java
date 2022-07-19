package com.cg.framework;

public abstract class SavingsAccount extends BankAccount  {
	private boolean isSalary;
	private static final float MINBAL =1;
	public SavingsAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		super (accNo, accNm, accBal);
		this.isSalary = isSalary;
	}
	public void withdraw(float accBal)
	{
		System.out.println("Remaining balace after withdraw :"+accBal);
	}
	@Override
	public String toString() {
		return "SavingsAccount [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public boolean isSalary() 
	{
		return isSalary;
	}
	public void setSalary(boolean isSalary)
	{
		this.isSalary = isSalary;
	}
	public static float getMinbal() 
	{
		return MINBAL;
	}
}
