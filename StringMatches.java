package stringprograms;

public class StringMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Manish Tiwari";
			boolean b1=		s1.contains("school");
		System.out.println(b1);
		
		String a="ornage";
		boolean b2=		a.matches("(.*)l");
		System.out.println(b2);
		
		boolean b3=		a.matches("l(.*)");
		System.out.println(b3);
		
		boolean b4=a.matches("(.*)a(.*)");
		System.out.println(b4);
		
		String q1="manish";
		boolean b5=		q1.matches("......");	
		System.out.println(b5);
		
			String s2="aman";
			char c1=	s2.charAt(2);
		System.out.println(c1);
		char c2=	s2.charAt(1);
		System.out.println(c2);
		
		int i1=	s2.indexOf('n');
		System.out.println(i1);
		
	}
}