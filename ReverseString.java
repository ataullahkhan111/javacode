package stringprograms;

public class ReverseString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name="My name is Ataullah Khan";
		String output="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char c = name.charAt(i);
			output=output+c;			
		}
		System.out.println(output);

	}
}
