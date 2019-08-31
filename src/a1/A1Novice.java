package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numCustomers = scan.nextInt();
		double total = 0.0;
		
		for(int i = 0; i<numCustomers; i++)
		{
			
			String name = scan.next().substring(0, 1) + "." + " " + scan.next();
			
			for(int j = 0; j < scan.nextInt(); j++)
			{
				total = total + scan.nextInt() * scan.nextDouble();
			}
			//System.out.println(name + ":" + " " + total);
			System.out.print(total);
			
		}
		
	}
}
