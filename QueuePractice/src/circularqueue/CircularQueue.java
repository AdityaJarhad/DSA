package circularqueue;

public class CircularQueue {
	private int size;
	private int front;
	private int rear;
	private int[] arr;
	public CircularQueue(int size) {
		super();
		this.size = size;
		this.front = -1;
		this.rear = -1;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		if(rear == front)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if((front == -1 && rear == size-1) || (rear+1)%size==front)
			return true;
		return false;
	}
	
	public boolean insert(int data) {
		if(isFull())
			return false;
		rear = (rear+1)%size;
		arr[rear] = data;
		return true;
	}

	public int delete() {
		if(isEmpty())
			return 404;
		front = (front+1)%size;
		return arr[front];
	}

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(10);
		
		cq.insert(10);
		cq.insert(20);
		cq.insert(30);
		cq.insert(40);
		cq.insert(50);
		System.out.println(cq.insert(50));
		System.out.println(cq.delete());
		System.out.println(cq.delete());
		System.out.println(cq.delete());
		System.out.println(cq.delete());
		System.out.println(cq.delete());
		System.out.println(cq.delete());
		System.out.println(cq.delete());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
