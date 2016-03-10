package base;

import java.util.Date;

public class Account
{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	//No arg constructor
	Account()
	{
		
	}
	
	/*
	 * One arg constructor for account object.
	 * 
	 * @param  idParam An integer that specifies the id of the account
	 * @return Nothing
	*/
	
	Account(int idParam)
	{
		this.id = idParam;
	}
	
	/*
	 * Two arg constructor for account object.
	 * 
	 * @param  idParam An integer that specifies the id of the account
	 * @param  balanceParam An integer that specifies the id of the account
	 * @return Nothing
	*/
	
	Account(int idParam, double balanceParam)
	{
		this.id = idParam;
		this.balance = balanceParam;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate()
	{
		return(annualInterestRate/12);
	}
	
	/*
	 * Method that subtracts the withdraw amount from the balance.
	 * Throws a custom exception if the balance is exceeded by the 
	 * amount to be withdrawn
	 * 
	 * @param  withdrawalAmount A double that specifies the amount of money to withdraw
	 * @return Nothing
	*/
	public void withdraw(double withdrawalAmount) throws InsufficientFundsException
	{
		if (withdrawalAmount > this.balance)
		{
			throw new InsufficientFundsException(withdrawalAmount - this.balance);
		}
		this.balance -= withdrawalAmount;
	}
	
	/*
	 * Method that adds depositAmount to the balance of the account
	 * 
	 * @param  depositAmount A double that specifies the amount of money to deposit
	 * @return Nothing
	*/
	
	public void deposit(double depositAmount)
	{
		this.balance += depositAmount;
	}
}
