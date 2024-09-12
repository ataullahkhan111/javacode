package project1;

class University{
	
	void show(int a , int b)
	{
	int c = a+b;
	System.out.println(c);
	}
}
class College extends University
{
	void display(int c, int y)
	{
		int d =c-y;
		System.out.println(d);

	}
}
public class MultilevelInheritance extends College {
	
	public static void main(String[] args) {
		MultilevelInheritance t = new MultilevelInheritance();
		t.show(5,8);
		t.display(6,2);
		
	}
		// TODO Auto-generated method stub

}