package test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.add("abc");
		queue1.add("def");
		queue1.add("ghi");
		System.out.println(queue1);
		System.out.println(queue1.peek());;//head of the queue
		queue1.poll();//removes head of the queue
		System.out.println(queue1);
		
		
		System.out.println(queue1);
		
		ArrayDeque<String> queue2 = new ArrayDeque<String>();
		queue2.add("abc");
		queue2.add("def");
		queue2.add("ghi");
		queue2.addFirst("mno");
		queue2.addLast("rst");
		//queue2.peekFirst();
		//queue2.peekLast();
		//queue2.pollFirst();
		//queue2.pollLast();
		

	}

}
