package LinkedList;

public class LinkedList {
	private Node head;

	public LinkedList() {
		super();
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void reverse() {
		Node n1 = head;
		Node n2 = n1.getNext();
		Node n3 = null;
		
		n1.setNext(null);
		
		while(n2 != null) {
			n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
		} 
		head = n1;
	}

	public boolean insert(int data, int pos) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		if (pos <= 0 || (head == null && pos > 1)) {
			return false;
		}

		if (pos == 1) {
			newNode.setNext(head);
			;
			head = newNode;
			return true;
		}

		Node temp = head;
		for (int i = 1; i < pos - 1; i++) {
			temp = temp.getNext();
			if (temp == null) {
				return false;
			}
		}

		newNode.setNext(temp.getNext());
		temp.setNext(newNode);

		return true;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public boolean insert(int data) {

		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		if (head == null) {
			head = newNode;
			return true;
		}

		Node temp = head;
		if (head.getData() == data) {
			return false;
		}
		while (temp.getNext() != null) {
			temp = temp.getNext();
			if (temp.getData() == data) {
				return false;
			}
		}

		temp.setNext(newNode);
		return true;
	}

	public void max() {
		int max = head.getData();
		Node temp = head;
		int d;

		while (temp != null) {
			d = temp.getData();
			if (d > max) {
				max = d;
			}
			temp = temp.getNext();
		}

		System.out.println("Max : " + max);
	}

	public void min() {
		Node temp = head;
		int min = temp.getData();
		int d = temp.getData();
		while (temp != null) {
			d = temp.getData();
			if (min > temp.getData()) {
				min = d;
			}
			temp = temp.getNext();
		}
		System.out.println("Min : " + min);
	}

	public void evenSum() {
		Node temp = head;
		int sum = 0;
		while (temp != null) {
			sum += temp.getData();
			temp = temp.getNext();
		}
		System.out.println("Sum : " + sum);
	}

}
