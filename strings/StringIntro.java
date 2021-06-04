package strings;

public class StringIntro {
	public static void main(String args[]) {
		String name = "pankaj";
		String anotherName = new String("pankaj");
		String name2 = "pankaj";
		System.out.println(name.equals(name2));
		System.out.println(name == anotherName);
		System.out.println(name == name2);
		
		name2 = "pandey";
		System.out.println(name2);
		
		String campus = "dr ambedkar institute of technology";
		System.out.println(campus.charAt(3));
		System.out.println(campus.length());
		System.out.println(campus.substring(6));
		System.out.println(campus.substring(3,7));
		System.out.println(campus.contains("institute"));
		
		String usn = "1DA17";
		System.out.println(usn.isEmpty());
		String branch = usn+"CS";
		System.out.println(branch.concat("104"));
		
		System.out.println(branch.replace('C','M'));
		System.out.println(branch.replace('S','E'));
		System.out.println(branch+"104");
		
		String device = "laptop Mobile Tv Router Watch";
		String devs[] = device.split("ou");
		for(String items: devs) {
			System.out.println(items+" ");
		}
	}
}