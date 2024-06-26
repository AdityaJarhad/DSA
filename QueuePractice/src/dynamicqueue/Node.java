package dynamicqueue;

public class Node<T> {
	private Node prev;
	private Node next;
	private T data;
	public Node(T data) {
		super();
		this.prev = null;
		this.next = null;
		this.data = data;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}
