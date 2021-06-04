package Inheritance;

class Person{
	protected String name;
	public void eat() {
		System.out.println(name+" is eating food");
	}
	
	public void walk() {
		System.out.println(name + " is walking");
	}
}

class Teacher extends Person{
	public void teach() {
		System.out.println("He is a math's teacher");
	}
}

class Footballer extends Person{
	public void play() {
		System.out.println("He plays football very well");
	}
}

class Singer extends Person{
	public void sing() {
		System.out.println("He is singing beautifully");
	}
}

public class InheritClassDemo {
	public static void main(String [] args) {
		Teacher t = new Teacher();
		t.name = "pankaj";
		t.eat();
		t.walk();
		t.teach();
		
		Singer s = new Singer();
		s.name = "Manisha";
		s.eat();
		s.sing();
		s.walk();
		
		Footballer f = new Footballer();
		f.eat();
		f.walk();
		f.play();
	}
}
