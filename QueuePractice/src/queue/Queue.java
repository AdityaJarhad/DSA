package queue;

public class Queue {
	private int size;
	private int front;
	private int rear;
	private int[] arr;
	public Queue(int size) {
		super();
		this.size = size;
		this.front = -1;
		this.rear = -1;
		arr = new int[size];
	}

	private boolean isEmpty() {
		if((front==-1 && rear==-1) || rear < front)
			return true;
		return false;
	}
	
	private boolean isFull() {
		return rear==size-1;
	}
	
	public boolean insert(int data) {
		if(isFull())
			return false;
		arr[++rear] = data;
		if(front==-1)
			front = 0;
		return true;
	}

	public int delete() {
		return arr[front++];
	}

	public static void main(String[] args) {
		Queue q = new Queue(5);
		
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.delete());
	}












}