package project1;

 // check if main method can be overloaded by making sure other main methods are non static
public class Assignment13Aug {

	 void main()
	{
		System.out.println("1");
	}
	
	void main(String r)
	{
		System.out.println("2");
	}
	
	void main(int d)
	{
		System.out.println("3");
	}
	
	
	public static void main(String[] args) 
	{
		Assignment13Aug t = new Assignment13Aug();
		t.main();
		t.main("Ram");
		t.main(50);
	}

}
