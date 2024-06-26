package dynamicqueue;

public class Tester {

	public static void main(String[] args) {
		DoublyLinkedListQueue<Integer> q = new DoublyLinkedListQueue<>();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.insert(50);
		q.insert(60);
		q.display();
		
		System.out.println("list to BinaryTree");
		
		System.out.println("removed element");
		q.remove();
		q.display();
		q.remove();
		q.display();
	}

}
