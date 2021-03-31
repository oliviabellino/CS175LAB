import java.util.Scanner;
public class bankThreshold {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the starting $$ balance: ");
		System.out.println("Enter the interest rate: ");
		BankAccount myBankAccount = new BankAccount(in.nextDouble(), in.nextDouble());
		int months = 0;
		System.out.println("Enter a threshold $$:");
		while(in.hasNextDouble()) {
			double threshold = in.nextDouble();
			while(myBankAccount.balance <= threshold) {
				myBankAccount.calcInterest();
				months++;
			}
			System.out.println("It will take " + months + " months to reach: " + threshold);
		  
		}
			
		}

	}
