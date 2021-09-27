package test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> set = new HashSet<String>();
		set.add("abc");
		set.add("def");
		set.add("ghi");
		set.add("ghi");
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		LinkedHashSet<String> set1 =new LinkedHashSet<String> ();
		set1.add("abc");
		set1.add("def");
		set1.add("ghi");
		set1.add("ghi");
		set1.add(null);
		set1.add(null);
		System.out.println(set1);
		
		
		TreeSet<String> set2 =new TreeSet<String> ();
		set2.add("abc");
		set2.add("def");
		set2.add("ghi");

		System.out.println(set2);
		System.out.println(set2.descendingSet());
	}
	
	

}
