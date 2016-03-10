package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest
{
	
	Account testAccount;
	
	@Before
	public void setUp() throws Exception {
		testAccount = new Account(101);
		
	}

	@After
	public void tearDown() throws Exception {
		testAccount = null;
	}

	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		testAccount.deposit(500.00);
		//throw new InsufficientFundsException();
		assertEquals("$400 Expected, actual is $500",(long)testAccount.getBalance(),(long)500.00);
		testAccount.withdraw(900);
	}
	
	@Test
	public void AccountTest() throws InsufficientFundsException
	{
		Account testAccount = new Account(1122,20000);
		testAccount.setAnnualInterestRate(.045);
		testAccount.withdraw(2500);
		testAccount.deposit(3000);
		System.out.println("Balance: " + testAccount.getBalance());
		System.out.println("Monthly interest: " + testAccount.getMonthlyInterestRate());
		System.out.println("Date created: " + testAccount.getDateCreated());
		
		
	}
}
