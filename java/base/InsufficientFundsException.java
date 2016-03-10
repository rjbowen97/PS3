package base;

import java.io.*;

public class InsufficientFundsException extends Exception
{
	private double amount;
	
	InsufficientFundsException(double amtOver)
	{
		this.amount = amtOver;
		System.out.println("WARNING, INSUFFICIENT FUNDS");
		System.out.println("You have gone over by " + amtOver);	
	}
	
	public double getAmount()
	{
		return amount;
	}
}
