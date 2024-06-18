package CircularLinkedList;

public class CircularLinkedList {
	private Node head;

	public CircularLinkedList() {
		super();
		this.head = null;
	}

	public Node getHead() {
		return head;
	}
	
	public boolean insert(int data, int pos) {
		
		Node newNode = new Node(data);
		if(pos <= 0 || (head == null && pos > 1))
			return false;
		
		if(pos == 1) {
			if(head == null) {
				head = newNode;
				newNode.setNext(head);
			}
			
			newNode.setNext(head.getNext());
			head = newNode;
		}
		
		Node temp = head;
		for(int i=0; i< pos-1; i++) {
			temp = temp.getNext();
		}
		
		newNode.setNext(temp.getNext());
		temp = newNode;
		return true;
	}
	
	public void display() {
		if(head == null)
			return;
		
		Node temp = head;
		do {
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		} while(temp != head);
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
