package Inheritance;

class Animal{
	
}

class cat extends Animal{
	
}

public class UpAndDownCasting {
	cat c = new cat();
	Animal a = c;		// upcasting
	
	cat c1 = (cat) a;	// Downcasting
}
