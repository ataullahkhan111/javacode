package project1;

import java.util.InputMismatchException;

public class ThrowANDThrows	
	{
	public static void main(String[] args) throws NullPointerException,InputMismatchException
	{
		if(1==1)
		{
		throw new NullPointerException("Sorry your cell is empty");
		}
		else
		{
			throw new InputMismatchException("Sorry check your input before entering");
		}
		
	}
	}
