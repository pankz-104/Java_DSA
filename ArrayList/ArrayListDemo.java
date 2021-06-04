package ArrayList;

import java.util.*;

public class ArrayListDemo {
	public static void main(String [] args) {
//		ArrayList<Integer> arr = new ArrayList<>();
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		System.out.println(arr.toString());
//		
//		arr.remove(2);
//		System.out.println(arr);
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("mango");
		fruits.add("PineApple");
		System.out.println(fruits);
		
		List<String> veggies = new LinkedList<>();
		veggies.add("potato");
		veggies.add("tomato");
		veggies.add("cauliflower");
//		veggies.addAll(fruits);
		fruits.addAll(veggies);
//		System.out.println(fruits);
//		System.out.println(veggies);
		
		System.out.println(veggies.get(2));
		veggies.set(2, "carrot");
		System.out.println(veggies);
		
		List<String> toRemove = new ArrayList<>();
		toRemove.add("potato");
		toRemove.add("carrot");
		veggies.removeAll(toRemove);
		System.out.println(veggies);
		
		System.out.println(fruits.size());
		System.out.println(fruits.contains("guava"));
		System.out.println(fruits.contains("mango"));
		System.out.println(fruits.isEmpty());
		String [] temp = new String[fruits.size()];
		fruits.toArray(temp);
		
		for(String a : fruits) {
			System.out.println(a);
		}
		
		System.out.println(fruits.toString());
		
		Pair<String, Integer> p1 = new Pair<>("pankaj", 104);
		Pair<Boolean, Integer> p2 = new Pair<>(true, 111);
		
		p1.getDescription();
		p2.getDescription();
	}
}
