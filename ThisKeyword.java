package project1;

public class ThisKeyword {
	int student_id;
	String name;
	double salary;
	
	void student_details(int student_id, String name, double salary)
	{
		this.student_id = student_id;
		this.name = name;
		this.salary =salary;
		System.out.println("Topper");
		//this.student_id = student_id;

	}
	
    public static void main(String[] args) {
		ThisKeyword t1 = new ThisKeyword();
		t1.student_details(11, "Nazrin", 95000.0);
		System.out.println(t1.student_id);
		System.out.println(t1.name);
		System.out.println(t1.salary);
    	
	}

}