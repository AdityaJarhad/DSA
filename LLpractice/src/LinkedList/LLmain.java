package LinkedList;

public class LLmain {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		ll.insertAtLast(10);
		ll.insertAtLast(200);
		ll.insertAtLast(30);
		l2.insertAtLast(150);
		l2.insertAtLast(2300);
		l2.insertAtLast(301);
		l2.insertAtLast(3004);
		System.out.println("merge list");
		l3 = l3.merge(ll, l2);
		l3.display();

		System.out.println("\nDisplay linked list");
		ll.display();
		
		System.out.println("\nReversed linked list by stack");
		ll.DisplayReversed();
		
		System.out.println("\nReversed linked list by recursion");
		ll.recursionReversed(ll.getHead());
		
		System.out.println("\nremoved element from linked list");
		ll.removeByPos(3);
		
		System.out.println("\nAscending");
		l2.ascending();
		l2.display();
		
		
	}

}
