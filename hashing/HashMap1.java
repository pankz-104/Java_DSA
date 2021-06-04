package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	public static void main(String [] args) {
		
//		Map<String, Integer> num = new HashMap<>();
		
		//adding elements to the map 
		// put() method
//		num.put("One", 1);
//		num.put("two", 2);
//		num.put("three", 3);
//		num.put("four", 4);
		
		// put if the value is not present already
		// putIfAbsent() method
//		num.putIfAbsent("One", 5);
		
		//get() function to obtain the values of key
//		System.out.println(num.get("One"));
//		System.out.println(num.get("Seven"));
		
		// copying elements of existing hashmap into new one 
		// putAll() function
//		Map<String, Integer> new_map = new HashMap<>();
//		new_map.putAll(num);
//		System.out.println(new_map);
//		
//		System.out.println(num.containsKey("Three"));
//		System.out.println(num.containsValue(4));
//		
//		num.replace("One", 11);
//		System.out.println(num);
//		
//		num.replace("two", 2, 22);
//		System.out.println(num.toString());
//		
//		num.remove("three");
//		System.out.println(num.toString());
//		
//		System.out.println(num.keySet());
//		System.out.println(num.values());
//		System.out.println(num.entrySet().toString());
//		
//		Set<Entry<String, Integer>> entries = num.entrySet();
//		
//		for(Entry<String, Integer> entry : entries) {
//			entry.setValue(entry.getValue() * 100);
//		}
//		System.out.println(num);
//		
//		System.out.println(hash("CAT"));
		
	}
	public static int hash(String s) {
		int hash = 0;
		for(int i=0; i<s.length(); i++) {
			hash = s.charAt(i);
		}
		return hash;
	}
}
