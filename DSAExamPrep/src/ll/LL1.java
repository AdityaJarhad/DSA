package ll;

public class LL1 {
	private Node head;
	private Node tail;
	public LL1() {
		head = null;
		tail = null;
	}
	public Node getHead() {
		return head;
	}
	
	public boolean insert(int data) {
		Node nN = new Node(data);
		if(head == null) {
			head = nN;
			tail = nN;
			return true;
		}
		
		tail.setNext(nN);
		tail = nN;
		
		return true;
	}

	public void display() {
		if(head == null) {
			return ;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}
		
		
	}

	public boolean dup() {
		if(head == null)
			return false;
		
		Node temp = head;
		while(temp != null) {
			Node prev = temp;
			Node t = temp.getNext();
			while(t != null) {
				if(temp.getData() == t.getData()) {
					prev.setNext(t.getNext());
					t = t.getNext();
				}
				else {
				 prev = t;
				t = t.getNext();
				}
			}
			temp = temp.getNext();
		}
		
		return true;
	}

}
