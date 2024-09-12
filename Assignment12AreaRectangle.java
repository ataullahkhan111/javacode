package project1;

import java.util.Scanner;

public class Assignment12AreaRectangle {

	public static void main(String[] args) 
	{

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the length");
		int l = s1.nextInt();
		
		System.out.println("Enter the breadth");
		int b = s1.nextInt();
		
		int area = l*b;
		System.out.println("Print the area of the rectangle:" + area);
	}

}
