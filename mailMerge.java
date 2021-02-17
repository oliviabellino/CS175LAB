import java.util.Scanner;

public class mailMerge {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
	
		System.out.print("Please enter your first name: ");
		String firstName = in.nextLine();
		
		
		System.out.print("Please enter your last name: ");
		String lastName = in.nextLine();
		
	
		System.out.print("Please enter your house number: ");
		String houseNumber = in.nextLine();
		

		System.out.print("Please enter your street: ");
		String street = in.nextLine();
		

		String line1 = "Dear <firstname> <lastname>,";
		String line2 = "Please confirm that your address is <houseNumber> <street>.";
		String line3 = "Is this address correct? Answer: ";
		
	
		System.out.println(line1.replace("<firstname>", firstName).replace("<lastname>", lastName));
		System.out.println(line2.replace("<houseNumber>", houseNumber).replace("<street>", street));
		System.out.print(line3);
	
		String yorno = in.nextLine();
		System.out.println("Your answer is " + yorno + ". Thank you.");
	}
}

