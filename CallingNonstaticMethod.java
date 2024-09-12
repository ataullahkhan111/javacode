package project1;

public class CallingNonstaticMethod {
	
	void sum(int a, int b)
	{
		int c =a+b;
		System.out.println(c);
	}
	
	void diff(int f, int g)
	{
		int k = f-g;
		System.out.println(k);

	}

	public static void main(String[] args) {
		CallingNonstaticMethod t = new CallingNonstaticMethod();
		t.sum(6, 7);
		t.diff(5, 3);
		
	}

}
