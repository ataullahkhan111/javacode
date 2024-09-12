package project1;

import java.util.Scanner;

public class Assignment13AreaofTriangle {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = s1.next();
		
		System.out.println("Enter the length");
		int l = s1.nextInt();
		
		System.out.println("Enter the breadth");
		int b = s1.nextInt();
		
		double area = 0.5*(l*b);
		System.out.println("Print the area of the traingle:" + area);
	}

}
