package LinkedList;

import java.security.PublicKey;

public class Tester {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		l1.insert(8);
		l1.insert(1);
		l1.insert(2);
		l1.insert(5);
		l1.insert(7);
		l1.insert(4);
			l1.display();
			
		System.out.println("By position");
		l1.insert(10, 4);
		l1.display();
		l1.insert(20, 1);
		l1.display();
		l1.insert(30, 8);
		l1.display();
		l1.insert(40, 11);
		l1.display();
		
		System.out.println("Reverse Order");
		l1.reverse();
		l1.display();
		
		l1.max();	
		l1.min();
		l1.evenSum();
			
	}
	
	
	

}
