
import java.util.ArrayList;

public class bankAcc 
{
	private String name;
	private double balance;
	private int acct;
	private static int accountNumber = 0;
	private static double previous = 0;
	private static String x;
	public static void main(String[] args)
	{
		bankAcc gil = new bankAcc("Gil",500);
		bankAcc joe = new bankAcc("Joe",1000);
		bankAcc fred = new bankAcc("Fred",2000);
		bankAcc sally = new bankAcc("Sally",2500);
		ArrayList<BankAccount> accountList= new ArrayList<>();
		accountList.add(gil);
		accountList.add(joe);
		accountList.add(fred);
		
		
		for(BankAccount element : accountList)
		{
			System.out.println(element.getAccount());
		}
		accountList.add(sally);

		for(BankAccount element : accountList)
		{
			if(element.getBalance() > previous)
			{
				
				previous = element.getBalance();
				x = element.getAccount();
			}
			
		}
		System.out.println("highest " + x);
		accountList.remove(sally);
		previous = 0;
		for(BankAccount element : accountList)
		{
			if(element.getBalance() > previous)
			{
				
				previous = element.getBalance();
				x = element.getAccount();
			}
			
		}
		System.out.println("highest " + x);
	}
	

	public BankAccount()
	{
		balance = 0;
	}
	
	public BankAccount(String name,double initialBalance)
	{
		this.balance = initialBalance;
		this.name = name;
		accountNumber++;
		this.acct = accountNumber;
		
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount)
	{
		if (amount>balance) 
		{
			throw new IllegalArgumentException("WD amount "+amount+" exceeds balance of "+balance);
		}
		balance = balance - amount;
	}

	public double getBalance()
	{
		return balance;
	}
	public String getAccount()
	{
		return this.name+" " + this.acct+" " + this.balance;
	}
	public double anyAccount(BankAccount otherAccount) 
	{
		return otherAccount.getBalance();
	}
	public void transfer(double amount,BankAccount otherAccount) 
	{
		balance = balance - amount;
		otherAccount.deposit(amount);
		
	}
}