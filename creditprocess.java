import java.util.Scanner;

public class creditprocess {

	
	
	
	
	
	public static void main(String[] args) {
		

	
		   
		        String cardNumber = null;
		        Scanner in = new Scanner(System.in);
		        System.out.println("Please enter the credit card number or  enter -99 to end the program:");
		        while(in.hasNextLine()){
		        	cardNumber=in.next();
		            if (cardNumber.equals("-99"))
		            {  System.out.print("Goodbye");
		                 }

		        int i=0;

		        while (i<cardNumber.length())
		        {
		            char cc = cardNumber.charAt(i);

		            if (cc==' '|| cc=='-') {
		                String before = cardNumber.substring(0,i);
		                String after = cardNumber.substring(i+1);
		                cardNumber=before+after;

		            }
		            else {
		                i++;

		                }
		}
		        System.out.println(cardNumber);

		        }
		    }
		    }









	


