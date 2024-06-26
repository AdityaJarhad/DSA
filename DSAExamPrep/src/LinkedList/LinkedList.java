package LinkedList;

import java.util.Iterator;
import java.util.Stack;

public class LinkedList {
	private Node head;
//	private Node tail;

	public LinkedList() {
		super();
		this.head = null;
//		this.tail = null;
	}

	public Node getHead() {
		return head;
	}

	public boolean insertByPos(int position, int data) {
        if(position <= 0 || (head == null && position > 1)) {
            return false;
        }

        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(position == 1) {
            newNode.setNext(head);
            head = newNode;
            return true;
        }

        //locate prev node
        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev == null) {
                return false;
            }
        }

        newNode.setNext(prev.getNext());
        prev.setNext(newNode);

        return true;
    }
	 
	public boolean removeDup() {
		if(head == null) {
			return false;
		}
		
		Node temp = head;
		while(temp != head) {
			
			while(temp != head) {
				Node prev = temp;
				if(temp.getData() == temp.getData()) {
					prev.setNext(temp.getNext());
				}
				temp = temp.getNext();
			}
			
			temp = temp.getNext();
		}
		
		return true;
	}

	public boolean deleteByPos(int position) {
        if(head == null || position <= 0) {
            return false;
        }

        if(position == 1) {
            head = head.getNext();
            return true;
        }

        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev.getNext() == null) {
                return false;
            }
        }

        Node del = prev.getNext();
        prev.setNext(del.getNext());

        return true;
    }


	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		} 
		System.out.println(" ");
	}

	public void displayReverse(Node temp) {
        if(temp == null) {
            System.out.println();
            return;
        }
        displayReverse(temp.getNext());
        System.out.print(temp.getData() + " ");
    }

	public void displayReverse() {
        Stack<Node> stack = new Stack<Node>();
        Node temp = head;

        while(temp != null) {
            stack.push(temp);
            temp = temp.getNext();
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().getData() + " ");
        }
        System.out.println();
    }
	
	public void ascOrder() {
		Node temp = head;
		while(temp != null) {
			Node t = temp;
			while(t != null) {
				if(temp.getData() > t.getData()) {
					int a = temp.getData();
					temp.setData(t.getData());
					t.setData(a);
				}
				t = t.getNext();
			}
			temp = temp.getNext();
		}
			

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}