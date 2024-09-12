package project1;

class Google
{
	void login()
	{
		System.out.println("Login with mobile no");	
	}
}

public class MethodOverridingSuper extends Google 
{
     void login()
     {
        //super.login();

 		System.out.println("Login with email ID");
 		super.login();

     }
	
	
	public static void main(String[] args) {
		MethodOverridingSuper t = new MethodOverridingSuper();
		t.login();

	}

}
