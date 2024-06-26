package Stack;

import Stack.Stack;

public class Tester {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack(5);
		
		System.out.println("isEmpty "+s.isEmpty());
		System.out.println("isFull "+s.isFull());
		
		System.out.println("Pop "+s.pop());
		System.out.println("Push "+s.push(10));
		System.out.println("Push "+s.push(20));
		System.out.println("Push "+s.push(30));
		System.out.println("Push "+s.push(40));
		System.out.println("Push "+s.push(50));
		System.out.println("Peek "+s.peek());
		System.out.println("Pop "+s.pop());
		System.out.println("Peek "+s.peek());
	}

}
