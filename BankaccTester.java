import java.util.Scanner;
public class BankaccTester {

	public static void main(String[] args) 
	{
Scanner in = new Scanner(System.in);
Scanner in2 = new Scanner(System.in);
System.out.print("Enter the amount you want to start the bank account with: ");
double startBal = in.nextDouble();
System.out.print("Enter the interest rate for the account: ");
double interestAmount = in.nextDouble();
BankAcc myBankAccount = new BankAcc(startBal,interestAmount);
System.out.print("Enter the amount you would like to deposit: ");
double depositAmount = in.nextDouble();
myBankAccount.deposit(depositAmount);
System.out.print("Enter the amount you would like to withdraw: ");
double withdrawAmount = in.nextDouble();
myBankAccount.withdraw(withdrawAmount);
System.out.print("Enter the amount you would like to withdraw: ");
double withdrawAmountRedo = in.nextDouble();
myBankAccount.withdraw(withdrawAmountRedo);
System.out.print("Would you like me to generate interest, Enter 'Yes': ");
String response = in2.next();
myBankAccount.calcInterest();
System.out.print("Your account balance is: "+myBankAccount.getBalance());
	}

}
