package project1;

public class CallingStaticMethod 
{
	
	static void first_method()
	{
		System.out.println("First Method");
	}
	
	static void second_method()
	{
		System.out.println("Second Method");
	}
	
	static void third_method()
	{
		System.out.println("Third Method");
	}
	
	static void fourth_method()
	{
		System.out.println("Fourth Method");
	}
	
	static void fifth_method()
	{
		System.out.println("Fifth Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("main method");
       first_method();
       second_method();
       third_method();
       fourth_method();
       fifth_method();
	}

}
