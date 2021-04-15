import java.util.Random;

public class randArrayAndSearch
{
	public static void main(String[] args)
	{
		Random random = new Random();
		int array[] = new int [50];
		int number;
		boolean valueSet = false;
		int large = 0;
		int small = 0;
		
		for (int i = 0;i < array.length;i++)
		{
			number = random.nextInt(25)+1;
			if (!valueSet)
			{
				large = number;
				small = number;
				valueSet = true;
			}
			array[i] = number;
			if (number > large) 
			{
				large = number;
			}
			if (number < small)
			{
				small = number;
			}
			
		}
		for (int x = 0; x < array.length;x++) 
		{
			System.out.print(array[x]+" ");			
		}
		
		int count = 1;
		int tempCount;
		int popular = array[0];
		int temp = 0;
		
		for (int x = 0;x < (array.length-1);x++)
		{
			temp = array[x];
			tempCount = 0;
		    for (int y = 1;y < array.length;y++)
		    {
		      if (temp == array[y])
		    	  tempCount++;
		    }
		    if (tempCount>count)
		    {
		      popular = temp;
		      count = tempCount;
		    }
		}
		
		System.out.println("\nLargest: " + large);
		System.out.println("Smallest: " + small);
		System.out.println("Product of largest and smallest: " + (large * small));
		System.out.println("Most popular number: " + popular);
		System.out.println("Times present in array: " + count);
	}

}
