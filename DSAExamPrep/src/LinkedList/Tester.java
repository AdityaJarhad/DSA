package LinkedList;

public class Tester {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.insertByPos(1, 30);
		ll.insertByPos(2, 220);
		ll.insertByPos(3, 30);
		ll.insertByPos(4, 40);
		ll.insertByPos(5, 50);
		ll.display();
		
//		ll.deleteByPos(1);
//		ll.display();
		
		ll.removeDup();
//		ll.display();
		
		ll.displayReverse();
//		ll.displayReverse(ll.getHead());
		
		ll.ascOrder();
		ll.display();

	}

}
