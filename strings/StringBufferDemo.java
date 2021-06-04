package strings;

public class StringBufferDemo {
	public static void main(String [] args) {
		StringBuffer s = new StringBuffer("Pankaj ");
		s.append("Pandey");
		System.out.println(s);
	
		// append text to existing string buffer
		s.append(1);
		System.out.println(s);
		
		// find total capacity and existing length of the string 
		int n1 = s.capacity();
		int n2 = s.length();
		
		// reverse the string content 
//		System.out.println(n1+" "+n2);
//		s.reverse();
//		System.out.println(s);
		
		// delete content in specified index range
		s.delete(0, 3);
		System.out.println(s);
		
		// delete content at specified index
		s.deleteCharAt(4);
		System.out.println(s);
		
		s.replace(3, 5, "pa");
		System.out.println(s);
		
		s.appendCodePoint(104);
		System.out.println(s);
		
		System.out.println(s.charAt(5));
		
		int index = s.indexOf("pan");
		System.out.println("index of 'pan' : "+index);
		
		
	}
}
