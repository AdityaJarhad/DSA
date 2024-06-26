package queue;

public class Queue {
	private int f;
	private int r;
	private int[] arr;
	private int size;
	public Queue(int size) {
		super();
		this.f = -1;
		this.r = -1;
		this.arr = new int[size];
		this.size = size;
	}
	
	public boolean isFull() {
		return r == size-1;
	}
	
	public boolean enqueue(int d) {
		if(isFull())
			return false;
		arr[++r] = d;
		if(f == -1) {
//			f;
		}
		return true;
	}
	
	public boolean isEmpty() {	
		return (f == -1 && r == -1) || f>r;
	}
	
	public int dequeue() {
		if(isEmpty()){
			return 404;
		}
	
		return arr[++f];
	}
	
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		
		System.out.print(q.dequeue()+" ");
		System.out.print(q.dequeue()+" ");
		System.out.print(q.dequeue()+" ");
		System.out.print(q.dequeue()+" ");
		System.out.print(q.dequeue()+" ");
	}
	
	
	
	
	
	
	
	
	
	
}
