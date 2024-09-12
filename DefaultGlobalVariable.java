package project1;

public class DefaultGlobalVariable {
	
	int student_id;
	String name;
	double salary;
	
	void student_details(int student_id,String name,double salary)
	{
		System.out.println("Topper");
	}

	public static void main(String[] args) 
	{
		DefaultGlobalVariable t = new DefaultGlobalVariable();
		t.student_details(85, "Vishnu" , 987452);
		System.out.println(t.salary);
		System.out.println(t.name);
		System.out.println(t.student_id);



	}

}
