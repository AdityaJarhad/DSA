package ProductLinkedList;

public class LinkedList {
	
	Node head ;

	public LinkedList() {
		super();
		this.head=null;
	}
	
	
	public Node insert(Product data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return head;
		}
		
		Node temp = head;
		if(temp.getNext() == null) {
			temp = newNode;
		}
		
		temp = temp.getNext();
		
		return temp;
	}
	
	public boolean insertByPosition(Product data, int pos) {
		Node newNode = new Node(data);
		if(newNode == null) {
			return false;
		}
		
		if(pos <= 0 || (head == null && pos > 1)) {
			return false;
		}
		
		if(pos == 1) {
			head = newNode;
			return true;
		}

		Node temp = head;
		for (int i = 1; i < pos; i++) {
			if(temp!=null) {
				temp = temp.getNext();
			}
		}
		
		newNode = temp.getNext();
		temp = newNode;
		
		return true;
	}
	
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
