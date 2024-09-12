package project1;

class GrandParent1
{
	GrandParent1(int a)
	{
		System.out.println("GrandParent1");
	}
}
class Parent1 extends GrandParent1
{
	Parent1(String b)
	{ 
		super(45);
		System.out.println("Parent1");
	}
}

public class SuperCallingParameter extends Parent1
{
	SuperCallingParameter()
	{
		super("Ram");
		System.out.println("SuperCallingParameter");

	}
	public static void main(String[] args) 
	{
		SuperCallingParameter t = new SuperCallingParameter();
	}

}
