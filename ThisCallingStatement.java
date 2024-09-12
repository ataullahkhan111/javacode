package project1;

public class ThisCallingStatement {

	ThisCallingStatement(int a, int b)
	{ 
		this('S');
		int sum =a+b;
		System.out.println(sum);
	}
	
	ThisCallingStatement(String s)
	{ 
		this(4,5);
		System.out.println("class2");
	}

	ThisCallingStatement(int f)
	{  
		this("new");
		System.out.println("class3");
	}

	public static void main(String[] args) {

		ThisCallingStatement t = new ThisCallingStatement(5);
	}
	ThisCallingStatement(char z)
	{
		System.out.println("character z");
	}
	
}
