package project1;

import java.util.Scanner;

public class CircumferenceCircleScanner 
{
	public static void main(String[] args) 
	{
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the radius");
        int c = s1.nextByte();
        double d = 2*3.14*c;
        System.out.println("Circumference of circle:"+d);
	}

}
