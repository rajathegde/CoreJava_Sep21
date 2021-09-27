package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("EFG");
		list.add("XYZ");
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.get(list.size()-1));
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		Iterator <String> itr =list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String data:list) {
            System.out.println(data);
        }
	//	list.remove(index)
		//list.removeAll(c)
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		LinkedList<String> ls = new LinkedList <String> ();
		
		ls.add("Abc");
		ls.add("Mah");
		ls.addFirst("First");
		ls.addLast("Last");
		System.out.println(ls);
		//Iterator <String> los =ls.listIterator();
		//System.out.println(los);
		
		
		Stack <String> st =new Stack <String>();
		st.push("name 1");
		st.push("name 2");
		st.push("name 3");
		System.out.println(st);
		st.pop();
		System.out.println(st.peek());//top ele
		
		Vector<String> vect = new Vector<String>();
		vect.add("xyz");
		vect.add("acd");
		System.out.println(vect);
	}
	
	
	
	
	


}
