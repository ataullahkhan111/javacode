package project1;

public class Assignment3Methods {

	
		void add1(int a, int b)
		{
			int sum=a+b;
			System.out.println(sum);
		}
		
		void add2(int a, int b)
		{
			int sum1=a+b;
			System.out.println(sum1);
		}
		
		void add3(int a, int b)
		{
			int sum2=a+b;
			System.out.println(sum2);
		}
		
		static void diff(int a, int b)
		{
			int sub=a-b;
			System.out.println(sub);

		}
		
		static void diff1(int a, int b)
		{
			int sub1=a-b;
			System.out.println(sub1);

		}
		
		static void diff2(int a, int b)
		{
			int sub2=a-b;
			System.out.println(sub2);

		}
		

		Assignment3Methods(int f, double v)
		{

			 double sum5=f+v;
			 System.out.println(sum5);
		}
		
		
		Assignment3Methods(int h, int l)
		{
			System.out.println("const with para1");
		}
				
		
		Assignment3Methods(int j, int o, int y)
		{
			System.out.println("const with para2");
		}
				
		
		public static void main(String[] args) 
		{
			Assignment3Methods t3 = new Assignment3Methods(200,400);

			Assignment3Methods t2 = new Assignment3Methods(200,500,600);

			Assignment3Methods t1 = new Assignment3Methods(100,78.99067);

			 /* t1.add1(6, 8);
			t1.add2(9, 3);
			t1.add3(8, 2); */
			
			t2.add1(6, 8);
			t2.add2(9, 3);
			t2.add3(8, 2); 
			
			
			diff(5,3);
			diff1(8,3);
			diff2(10,3);	

		}
}
			 
		

