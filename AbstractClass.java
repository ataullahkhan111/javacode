package project1;

abstract class Grand_Facebook
{
	abstract void fb_login();
	abstract void fb_registration();
}

abstract class Google_auth extends Grand_Facebook
{
	abstract void google_login();
	abstract void google_registration();

}

public class AbstractClass extends Google_auth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void google_login() {
		
	}

	@Override
	void google_registration() {
		
	}

	@Override
	void fb_login() {
		
	}

	@Override
	void fb_registration() {
		
	}

}
