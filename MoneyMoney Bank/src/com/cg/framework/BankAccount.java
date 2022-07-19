package com.cg.framework;

public abstract class BankAccount {
	private int accNo;
	private String accNm;
	private float accBal;
	public BankAccount(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
		
	}
	public void withdraw(float accBal)
	{
		System.out.println("Available account balance:"+accBal);
		
	}
	public void deposite(float accBal)
	{
		System.out.println("After depositing available Balance:"+accBal);

		
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getAccNo()
	{
		return accNo;
	}

	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}

	public String getAccNm() 
	{
		return accNm;
	}

	public void setAccNm(String accNm)
	{
		this.accNm = accNm;
	}

	public float getAccBal() 
	{
		return accBal;
	}

	public void setAccBal(float accBal)
	{
		this.accBal = accBal;
	}	
}
