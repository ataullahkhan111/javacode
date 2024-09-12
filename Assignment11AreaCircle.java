package project1;

import java.util.Scanner;

public class Assignment11AreaCircle {

	public static void main(String[] args) {
		

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double r = s1.nextDouble();
		double area = 3.14*r*r;
		System.out.println(area);
		
	}

}
