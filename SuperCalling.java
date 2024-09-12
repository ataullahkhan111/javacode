package project1;

class Grand_Parent
{
	Grand_Parent()
	   {
		System.out.println("Grand_Parent");	
		}
}

class Parent_Class extends Grand_Parent
{
	Parent_Class()
	{   
		super();
		System.out.println("Parent_Class");	

	}
}

public class SuperCalling extends Parent_Class {

	SuperCalling()
	{ 
		super();
		System.out.println("SuperCalling");	

	}
	
	
	public static void main(String[] args) {
		SuperCalling t = new SuperCalling();
	}

}
