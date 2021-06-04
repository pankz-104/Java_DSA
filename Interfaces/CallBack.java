package Interfaces;

public interface CallBack {
	void callback(int param);
}

class client implements CallBack{

	@Override
	public void callback(int param) {
		// TODO Auto-generated method stub
		System.out.println("callback called with param "+param);
	}	
}

class AnotherClient implements CallBack{
	public void callback(int p) {
		System.out.println("Another client callback");
		System.out.println("p is squared as :: "+(p*p));
	}
}

class MainMethod{
	public static void main(String [] args) {
		CallBack c = new client();
		AnotherClient ob = new AnotherClient();
		c.callback(50);
		
		c = ob; // now refers to AnotherClient object
		c.callback(55);
		
	}
}