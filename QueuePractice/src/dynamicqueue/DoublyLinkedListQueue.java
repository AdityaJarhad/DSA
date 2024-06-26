package dynamicqueue;

public class DoublyLinkedListQueue<T> {
	private int size;
	private Node head;
	private Node tail;
	
	public DoublyLinkedListQueue() {
		super();
		this.head = null;
	}
	
	public boolean isEmpty() {
		if(tail == null)
			return true;
		return false;
	}

	public boolean insert(T data) {
		Node newNode = new Node<T>(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return true;
		}
		
		tail.setNext(newNode);
		newNode.setPrev(tail);
		tail =newNode;
		
		return true;
	}
	
	public void display() {
		Node temp = head;
		do {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}while(temp!=tail);
	}
	
	public void remove() {
		Node temp = tail;
		tail = temp.getPrev();
		tail.setNext(null);
		temp.setPrev(null);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}