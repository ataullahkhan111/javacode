package project1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryANDCatch {

	public static void main(String[] args) {
		

		/*Scanner s3 = new Scanner(System.in);
		System.out.println("Enter your age");
		int s = s3.nextInt(); */

		
		try {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your age");
		int f = s1.nextInt(); 
		
	}
		catch(InputMismatchException a)
		{
			System.out.println("Invalid Input");
			Scanner s2 = new Scanner(System.in);
			System.out.println("Please re enter your age");
			int d = s2.nextInt();
		}
}
}