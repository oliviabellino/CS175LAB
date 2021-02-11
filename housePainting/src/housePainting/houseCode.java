package housePainting;

import java.util.Scanner;
public class houseCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int length=40;
		int width=15;
		int height=25;
		int window=10;
		int doorwidth=3;
		int windowlength=4;
		int windowwidth=2;
		int doorlength=6;
		int door=2;
		double costPerSqFt=5;
	
		
		System.out.println("Input width of the doors: ");
		doorwidth=in.nextInt();
		System.out.println("Input length of the doors: ");
		doorlength=in.nextInt();
		System.out.println("Input number of windows: ");
		window=in.nextInt();
		System.out.println("Input number of doors: ");
		door=in.nextInt();
		System.out.println("Input the window length: ");
		windowlength=in.nextInt();
		System.out.println("Input the window width: ");
		windowwidth=in.nextInt();
		System.out.println("Input length of house: ");
		length=in.nextInt();
		System.out.println("Input width of house: ");
		width=in.nextInt();
		System.out.println("Input height of house: ");
		height=in.nextInt();
		System.out.println("Input cost to paint per sqft of house: ");
		costPerSqFt=in.nextInt();
		
		
		double peakside = (length*width) + (.5 * (length*(height-width)));
		double normalside = length*width;
		double totalDoors = doorwidth*doorlength;
		double totalwindows = windowlength*windowwidth*window;
		double walls = ((normalside * 2 ) + (peakside * 2)) - window + door;
		
		System.out.println(walls + "sqr/ft");
		double costTotal = walls * costPerSqFt;
		System.out.println("Cost to paint the house is: " +costTotal);
		in.close();

	}

}
