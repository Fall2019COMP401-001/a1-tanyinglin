package a1;

import java.util.Scanner;

public class A1Novice
{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		int numCustomers = scan.nextInt();
		
		for(int i = 0; i<numCustomers; i++)
		{
			double total = 0.0;
			String name = scan.next().substring(0, 1) + "." + " " + scan.next();
			int times = scan.nextInt();
			for(int j = 0; j < times; j++)
			{
				int number = scan.nextInt();
				scan.next();
				String.format("%.2f", total);
				total = total + number * scan.nextDouble();
			}
			System.out.println(name + ":" + " " + String.format("%.2f", total));

			//System.out.print(total);
			
		}
		
	}
}
