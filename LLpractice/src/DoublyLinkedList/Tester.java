package DoublyLinkedList;

public class Tester {

	public static void main(String[] args) {
		DoublyLinkedList<String> dll = new DoublyLinkedList<String>();
		
		dll.insertByPos(1, "Hello");
		dll.insertByPos(2, "Hii");
		dll.insertByPos(3, "Good");
		dll.insertByPos(4, "bye");
		dll.display();
		System.out.println();

		System.out.println("Display reverse");
		dll.displayRev();
		
		System.out.println("\nRemove by pos");
		dll.removeByPos(4);
		dll.display();
	}

}
