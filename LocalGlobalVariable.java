package project1;

public class LocalGlobalVariable {

	String name="Ram";
	static double ram_salary=98654.304;  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ram_salary=100000;
		
     System.out.println(ram_salary);
     LocalGlobalVariable t = new LocalGlobalVariable();
     System.out.println(t.name);
    	
	}
}
