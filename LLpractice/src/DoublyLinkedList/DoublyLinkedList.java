package DoublyLinkedList;

public class DoublyLinkedList<T> {
	private Node<T> head;
	private Node tail;

	public DoublyLinkedList() {
		super();
		this.head = null;
	}

	public boolean insertByPos(int pos, T data) {
		if(pos <= 0 || (head == null && pos > 1)) {
			return false;
		}
		
		Node newNode = new Node(data);
		
		if(head == null && pos == 1) {
			head = newNode;
			tail = newNode;
			head.setNext(head);
			return true;
		}
		
		Node temp = head;
		for(int i=1; i<pos-1; i++) {
			temp = temp.getNext();
			if(temp == null) {
				return false;
			}
		}

		temp.setNext(newNode);
		tail = newNode;
		newNode.setPrev(temp);
		newNode.setNext(head);
		
		return true;
	}

	public boolean removeByPos(int pos) {
		if(pos <= 0 || (head ==null)) {
			return false;
		}
		
		Node temp = head;
		for(int i=1; i<pos-1; i++) {
			temp = temp.getNext();
			if(temp == null) {
				return false;
			}
		}
		
		Node del = temp.getNext();
		Node next = del.getNext();
		temp.setNext(del.getNext());
		next.setPrev(del.getPrev());
		
		return true;
	}
	
	public void displayRev() {
		if(head == null)
			return;
		
		Node temp = tail;
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.getPrev();
		}
	}
	
	public void display() {
		if(head == null)
			return;
		
		Node temp = head;
		do {
			System.out.println(temp.getData());
			temp = temp.getNext();
		} while(temp!=head);
	}
	
	
	
	
	
	
	
	
	
	
}
