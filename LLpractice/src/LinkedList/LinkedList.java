package LinkedList;

import java.util.Stack;

public class LinkedList<T> {
	private Node<?> head;
	private Node<T> tail;
	private int cnt = 0;
	
	public LinkedList() {
		head = null;
		tail = null;
	}

	@SuppressWarnings("unchecked")
	public Node<T> getHead() {
		return (Node<T>) head;
	}

	public boolean insertAtLast(T data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return true;
		}
		
		if(tail.getData() == data) {
			return false;
		}
		cnt++;
		tail.setNext(newNode);
		tail = newNode;
		return true;
	}
	
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData()+" ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void DisplayReversed() {
		Stack<T> stack = new Stack<T>();
		Node temp = head;
		while (temp != null) {
			stack.push((T) temp.getData());
			temp = temp.getNext();
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
	
	public void recursionReversed(Node temp) {
		if(temp == null) {
			return;
		}
		recursionReversed(temp.getNext());
		System.out.print(temp.getData()+" ");
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean removeByPos(int pos) {
		if(head == null)
			return false;
		
		Node temp = head;
		
		if(pos == 1) {
			head = head.getNext();
			return true;
		}
		
		for (int i = 1; i < pos-1; i++) {
			temp = temp.getNext();
			if(temp == null)
				return false;
		}
		
		Node t = temp.getNext();
		temp.setNext(t.getNext());
		
		return true;
	}
	
	public LinkedList<T> merge(LinkedList<T> l1, LinkedList<T> l2) {
		Node<T> temp1 = (Node<T>) l1.head;
		Node<T> temp2 = (Node<T>) l2.head;
		LinkedList<T> l3 = new LinkedList<T>();
		while(temp1!=null || temp2!=null) {
			if(temp1!=null) {
				l3.insertAtLast(temp1.getData());
				temp1 = (Node<T>) temp1.getNext();
			}
			if(temp2!=null) {
				l3.insertAtLast(temp2.getData());
				temp2 = (Node<T>) temp2.getNext();
			}
		}
		return l3;
	}
	
	public void ascending() {
		Node temp1 = head;
		Node<T> temp2 = temp1.getNext();
		for (int i = 0; i < cnt-1; i++) {
			for(int j=i; j<cnt-2; j++) {
				temp2 = (Node<T>) temp2.getNext();
				if((Integer)temp1.getData() > (Integer)temp2.getData()) {
					Node<T> t = temp1;
					temp1.setNext(temp2.getNext());
					temp2.setNext(temp1);
				}
				
			}
			temp1 = temp1.getNext();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}