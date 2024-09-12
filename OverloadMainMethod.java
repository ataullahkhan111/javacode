package project1;

public class OverloadMainMethod {

	public static void main() 
	
	{
		System.out.println("1");

	}
	
	void main(double f)
	{
		System.out.println("4");

	}
	

	public static void main(int a, String b) 
	
	{
		System.out.println("2");

	}
	
	public static void main(String b) 
	
	{
		System.out.println("3");

	}
	
	public static void main(String args[])
	{
		OverloadMainMethod t = new OverloadMainMethod();
		t.main(456.789);
		main();
		main(45, "Shyam");
		main("Ram");
	}
	
}
