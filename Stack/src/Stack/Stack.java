package Stack;

public class Stack<T> {
	private int size;
	private int top;
	private T[] arr;
	
	public Stack(int size) {
		this.size = size;
		this.top = -1;
		arr =(T[]) new Object[size];
	}
	
	
	public boolean isFull() {
		return size-1 == top;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean push(T data) {
		if(isFull())
			return false;
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
	
	
	
}
