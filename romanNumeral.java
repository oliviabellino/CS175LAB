package romanNumeral;

import java.util.Scanner;

public class romanNumeral {

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a year to convert to Roman Numerals!: ");
		
String romanNumeral = "";
int year = in.nextInt();

int thousand = year/1000 % 10;
int hundred = year/100 % 10;
int ten = year/10 % 10;
int years = year % 10;

		{			

			{	
		while (thousand >= 1)
				{
					thousand--;
					romanNumeral = romanNumeral + "M";	
				}	
				while (hundred >= 1)
				{	
					if (hundred == 9)
					{		
						hundred = hundred - 9;
						romanNumeral = romanNumeral + "CM";		
					}	
					else if (hundred >= 5)
					{
						hundred = hundred - 5;
						romanNumeral = romanNumeral + "D";		
					}
					
					else if (hundred >= 5)
					{
						
						hundred = hundred - 4;
						romanNumeral = romanNumeral + "CD";		
					}
					else
					{
						
						hundred--;
						romanNumeral = romanNumeral + "C";
						
					}
				}
				
				while (ten >= 1)
				{
					
					if (ten == 9)
					{
						
						ten = ten - 9;
						romanNumeral = romanNumeral + "XC";
						
					}
					
					else if (ten >= 5)
					{
						
						ten = ten - 5;
						romanNumeral = romanNumeral + "L";
						
					}
					
					else if (hundred >= 5)
			{
						
						ten = ten - 4;
						romanNumeral = romanNumeral + "XL";
						
					}
					
					else
					{
						
						ten--;
						romanNumeral = romanNumeral + "X";
						
					}
					
				}
				
				while (years >= 1)
				{
					
					if (years == 9)
					{
						
						years = years - 9;
						romanNumeral = romanNumeral + "IX";
						
					}
					
					else if (years >= 5)
					{
						
						years = years - 5;
						romanNumeral = romanNumeral + "V";
						
					}
					
					else if (years >= 5)
					{
						
						years = years - 4;
						romanNumeral = romanNumeral + "IV";
						
					}
					
					else
					{

romanNumeral = romanNumeral + "I";
						
					}
					
				}
				
			
			}
		
		}
		
System.out.println("The year " + year + " in roman numerals is " + romanNumeral + ".");
	}

}