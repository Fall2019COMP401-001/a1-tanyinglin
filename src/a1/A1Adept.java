package a1;

import java.util.Scanner;

public class A1Adept 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
//		double[] test = {0.2,0.5,0,0.9,0.1,0.5};
//        System.out.println(getMaxIndex(test));
//        System.out.print(getMinIndex(test));
        
        
		// Your code follows here.
		
		int totalAmount = scan.nextInt();
		double[] prices = new double[totalAmount];
		String[] brands = new String[totalAmount];
		//double sum = 0.0;
		for(int i = 0; i < totalAmount; i++)
		{
			brands[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
//		for(int i = 0; i<totalAmount;i++)
//		{
//			System.out.println(brands[i]+prices[i]);
//		}
		
		int totalCustomers = scan.nextInt();
		String[] names = new String[totalCustomers];
		double[] compare = new double[totalCustomers];
		for(int j = 0; j <totalCustomers; j++)
		{
			double sum =0.0;
			names[j]=scan.next()+" "+scan.next();
			int times = scan.nextInt();
			//double sum = 0.0;
			
			for(int k = 0; k<times; k++)
			{
				int howMany = scan.nextInt();
				//int index = 0;
				String realBrand = scan.next();
				for(int a = 0; a < totalAmount; a++)
				{
					
					if(realBrand.equals(brands[a]))
					 sum = sum + howMany * prices[a];
					//System.out.println(sum);
					compare[j]=sum;	
					//break;
						//index = a;
						//sum = sum + howMany * prices[index];

				}
				compare[j]=sum;	
				//break;
			}
			
		}
		System.out.println("Biggest"+":"+" "+names[getMaxIndex(compare)]+" "+"("+ String.format("%.2f", getMax(compare)) +")");
		System.out.println("Smallest"+":"+" "+names[getMinIndex(compare)]+" "+"("+ String.format("%.2f", getMin(compare)) +")");
		System.out.println("Average"+":"+" "+String.format("%.2f", getAverage(compare)));
		
	}
	public static double getMax(double[]a)
	{
		double res = a[0];
		for(int i = 0; i<a.length-1; i++)
		{
			if(a[i+1]>res)
				res = a[i+1];
		}
		return res;
	}
	public static double getMin(double[]a)
	{
		double res = a[0];
		for(int i = 0; i<a.length-1; i++)
		{
			if(a[i+1]<res)
				res = a[i+1];
		}
		return res;
	}
	public static int getMaxIndex(double[]a)
	{
		double res = a[0];
		int index = 0;
		for(int i = 0; i<a.length-1; i++)
		{
			if(a[i+1]>res)
				{
				res = a[i+1];
				index = i+1;
				}
		}
		return index;
	}
	public static int getMinIndex(double[]a)
	{
		double res = a[0];
		int index = 0;
		for(int i = 0; i<a.length-1; i++)
		{
			if(a[i+1]<res)
				{
				res = a[i+1];
				index = i+1;
				}
		}
		return index;
	}
	public static double getAverage(double[]a)
	{
		double sum = 0.0;
		for(int i =0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		return (sum/a.length);
	}
}

	

