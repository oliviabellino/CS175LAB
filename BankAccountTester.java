import java.util.Scanner;
public class BankAccountTester {
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter starting balance: ");
		double startBal = in.nextDouble();
		
		
	BankAccount myBankAccount = new BankAccount(startBal);  	 
	
	System.out.println("How much do you want to deposit?: ");
	double depositAmount = in.nextDouble();
	myBankAccount.deposit(depositAmount);					
	
	System.out.println("How much do you want to withdraw?: ");
	double withdrawAmount = in.nextDouble();
	myBankAccount.withdraw(withdrawAmount);
	
	System.out.println("Balance: " + myBankAccount.getBalance());
	
	
		
		
		
		
		
	}

}