package list;

public class LinkedList {
	private Node head;

	public LinkedList() {
		super();
		this.head = null;
	}
	public Node getHead() {
		return head;
	}
	
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if(newNode == null) {
			return false;
		}
		if(head == null) {
			head = newNode;
			return true;
		}
		Node temp = head;
//		if(head.getData() == data) {
//			return false;
//		}
		while(temp.getNext() != null) {
			temp = temp.getNext();
//			if(temp.getData() == data) {
//				return false;
//			}
		}
		temp.setNext(newNode);
		
		return true;
	}
	
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	public void reverse() {
		Node n1 = head;
		Node n2 = head.getNext();
		Node n3 = null;
		while(n2 != null) {
			n3 = n2.getNext();
			n2.setNext(n1);
			
			n1 = n2;
			n2 = n3;
		}
		head.setNext(null);
		head = n1;
	}
	
	public void removeDup() {
		if(head == null) {
			return;
		}
		Node temp = head;
		while(temp.getNext() != null && temp!=null) {
			int data = temp.getData();
			Node crnt = temp;
			
			while(crnt.getNext() != null) {
				Node t = crnt.getNext();
				if(t.getData() == data) {
					crnt.setNext(t.getNext());
				}else
					crnt = crnt.getNext();
			}
			
			temp = temp.getNext();
		}
	}
	public void count() {
		Node temp = head;
		int cnt = 1;
		while(temp.getNext() != null) {
			cnt++;
			temp = temp.getNext();
		}
		System.out.println("Count : "+cnt);
	}
	
	public void remove(int data) {
		if(head == null)
			return;
		if(head.getNext() == null){
			head = null;
		}
		
		Node temp = head;
		while(temp.getNext() != null) {
			Node t = temp.getNext();
			if(t.getData() == data) {
				temp = t.getNext();
			}
			temp = temp.getNext();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
