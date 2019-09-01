package a1;

import java.util.Scanner;

public class A1Jedi 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int totalAmount = scan.nextInt();
		double[] prices = new double[totalAmount];
		String[] brands = new String[totalAmount];
		int[] timesGoods = new int [totalAmount];
		
		for(int i = 0; i < totalAmount; i++)
		{
			brands[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
	    
		int totalCustomers = scan.nextInt();
		int[] timesCustomers = new int [totalAmount];
		int[] timesItems = new int [totalAmount];
		for(int i = 0; i<totalCustomers; i++)
		{
			scan.next();
			scan.next();
			int howManyItems = scan.nextInt();
			for(int j = 0; j<howManyItems; j++)
			{
				int howManyThis = scan.nextInt();
				String brandName = scan.next();
				for(int k = 0; k <totalAmount; k++)
				{
					
					if(brandName.equals(brands[k]))
					{
						//index = k;
						//timesCustomers[k] = timesCustomers[k] + howManyThis;
						timesCustomers[k]++;
						timesItems[k]= timesItems[k] + howManyThis;
					}
				}
				
			}
		}
		for(int i = 0; i < totalAmount; i++)
		{
			if(timesItems[i]==0)
				System.out.println("No customers bought " + brands[i]);
			else
				System.out.println(timesCustomers[i]+" "+"customers bought "+timesItems[i]+" "+brands[i]);
		}
	}

}
