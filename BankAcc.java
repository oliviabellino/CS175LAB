
public class BankAcc
{
   private double balance;
   private double interestPct;

  
   public BankAcc(double amount, double interest)
   {
      balance = amount;
      interestPct=interest;
   }

   
   public void deposit(double amount)
   {
      balance = balance + amount;
   }

  
   public void withdraw(double amount)
   {
      balance = balance - amount;
   }
   
   public double calcInterest() {
	   return balance*interestPct;
   }
   
   public double getBalance()
   {
      return balance;
   }
   
   public double getInterest() {
	   return interestPct;
   }
}
