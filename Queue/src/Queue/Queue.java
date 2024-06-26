package Queue;

public class Queue<T> {
	private int front;
	private int rear;
	private int size;
	private T[] arr;
	public Queue(int size) {
		super();
		this.size = size;
		front = -1;
		rear = -1;
		arr = (T[])new Object[size];
	}
	
	public boolean isEmpty() {
		if(front > rear || rear == -1)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if(rear == size-1)
			return true;
		return false;
	}
	
	public T dequeue() {
		if(isEmpty())
			return null;
		T a = arr[front];
		arr[front++] = null;
		return a;
	}
	
	public boolean enqueue(T data) {
		if(isFull())
			return false;
		arr[++rear] = data;
		if(front == -1)
			front = 0;
		return true;
	}
}
