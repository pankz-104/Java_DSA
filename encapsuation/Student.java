package encapsuation;

public class Student {
	private int age;
	private String name;
	
	public void setAge(int age) {
		if(age > 25) {
			System.out.println("you are unable to join !!");
		}
		this.age = age;
	}
	public int getAge() {
		if(age < 18) {
			System.out.println("You are still not able to join!!");
		}
		return age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
