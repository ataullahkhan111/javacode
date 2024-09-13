package stringprograms;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Anand";
		System.out.println(name.substring(2, 5));
			int size=	name.length();
			System.out.println(size);
			
			System.out.println(name.toLowerCase());
			System.out.println(name.toUpperCase());
		String s1="I am Manish";
		System.out.println(s1);
		System.out.println(s1.trim());
		String s2="         I am Manish";
		System.out.println(s2);
		System.out.println(s2.trim());
		
		String s3="         I am Manish           ";
		System.out.println(s3);
		System.out.println(s3.trim());
		
		String s4="I am Yamuna the";
		System.out.println(s4.substring(2));
		
		System.out.println(s4.substring(2,4));	
	}
	}


