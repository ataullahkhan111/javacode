package project1;
interface Google1
{
	void login_auth();
	void logout_auth();
}

interface Amazon1 extends Google1
{
	void login_auth_AMZ();
	void logout_auth_AMZ();
}

public class MultilevelInterface implements Amazon1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void login_auth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout_auth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login_auth_AMZ() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout_auth_AMZ() {
		// TODO Auto-generated method stub
		
	}
}