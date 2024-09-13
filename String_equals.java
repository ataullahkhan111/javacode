package stringprograms;

public class String_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Manish";
		String s2="manish";
		
		boolean b1=	s1.equals(s2);
		System.out.println(b1);


		boolean b2=	s1.equalsIgnoreCase(s2);
		System.out.println(b2);
		String s5="Kumar";	

		String s3=	s1.concat(" Tiwari").concat(s5);
					System.out.println(s3);
					
					

		String s4=	s1.concat(" ").concat("Tiwari");
					System.out.println(s4);

					
					String s7=		s1.replace('h', 'z');
					System.out.println(s7);

					String s8="Manish Tiwari";
					String s9=			s8.replaceAll("Tiwari", "Kumar");
					System.out.println(s9);
					
					String name="kv no  2 bangalore";
					String s42=			name.replaceAll("[a-z]", "");
					System.out.println(s42);


					String nameofsinger="50 cent";
					String s90= nameofsinger.replaceAll("[0-9]", "");		
					System.out.println(s90);


					String name1="Manish Tiwari";
					String s41=	name1.replaceAll("[A-Z]", "");
					System.out.println(s41);

		
	}

}
