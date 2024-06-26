package Queue;

public class Tester {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>(5);
		
		System.out.println("isEmpty : "+q.isEmpty());
		System.out.println("isFull : "+q.isFull());
		System.out.println("dequeue : "+q.dequeue());
		System.out.println("enqueue : "+q.enqueue(10));
		System.out.println("enqueue : "+q.enqueue(20));
		System.out.println("enqueue : "+q.enqueue(30));
		System.out.println("enqueue : "+q.enqueue(40));
		System.out.println("enqueue : "+q.enqueue(50));
		System.out.println("enqueue : "+q.enqueue(60));
		System.out.println("dequeue : "+q.dequeue());
		System.out.println("dequeue : "+q.dequeue());
		System.out.println("dequeue : "+q.dequeue());
		System.out.println("dequeue : "+q.dequeue());
		
	}

}
