package Inheritance;

class PersonNew{
	protected static String name;
	public void eat() {
		System.out.println(name+" is eating food");
	}
	
	public void walk() {
		System.out.println(name+" is walking");
	}
}

class TeacherNew extends PersonNew{
	public void eat() {
		System.out.println(name+" is eating pizza");
	}
	
	public static void laugh() {
		System.out.println(name + " is laughing");
	}
}
public class MethodOverriding {
	public static void main(String [] args) {
		TeacherNew t = new TeacherNew();
		t.name = "pankaj";
		t.eat();
		t.walk();
	}
}
