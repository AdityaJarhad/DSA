package Stack;

public class SingleStack<T> {
	private int size;
	private int top;
	private T[] arr;
	
	public SingleStack(int size) {
		super();
		this.size = size;
		this.top = -1;
		this.arr = (T[]) new Object[size];
	}
	
	private boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top+1 == size;
	}
	
	public boolean push(T data) {
		if(isFull()) {
			return false;
		}
		arr[++top] = data;	
		return true;
	}

	public T pop() {
		if(isEmpty())
			return null;
		return arr[top--];
	}
	
	public T peek() {
		if(isEmpty())
			return null;
		return arr[top];
	}	

	public static void main(String[] args) {
		SingleStack<Integer> ss = new SingleStack<Integer>(5);
		ss.push(10);
		ss.push(20);
		ss.push(30);
		ss.push(40);
		System.out.println(ss.peek());
		System.out.println(ss.pop());
		System.out.println(ss.peek());
		System.out.println(ss.pop());
		System.out.println(ss.peek());
		System.out.println(ss.pop());
		System.out.println(ss.peek());
		System.out.println(ss.pop());
		System.out.println(ss.peek());
		System.out.println(ss.pop());
		System.out.println(ss.peek());
		
	}

}