package list;

public class Tester {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		System.out.println("Insert Data");
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(20);
		ll.insert(40);
		ll.insert(30);
		ll.insert(50);
		ll.display();
		ll.count();

		System.out.println("Reverse Linked List");
		ll.reverse();
		ll.display();
		
		System.out.println("Dup removed");
		ll.removeDup();
		ll.display();
		
		ll.count();
		
		ll.remove(20);
		ll.display();
	}

}
