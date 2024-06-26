package Stack;

public class DoubleStack {
	private int top1;
	private int top2;
	private int size;
	private int[] arr;

	public DoubleStack(int size) {
		super();
		this.top1 = -1;
		this.top2 = size;
		this.size = size;
		this.arr = new int[size];
	}

	public boolean isEmpty1() {
		if (top1 == -1)
			return true;
		return false;
	}

	public boolean isEmpty2() {
		if (top2 == -1)
			return true;
		return false;
	}

	public boolean isFull() {
		return top1 + 1 == top2;
	}

	public boolean push1(int data) {
		if (isFull())
			return false;
		arr[++top1] = data;
		return false;
	}

	public boolean push2(int data) {
		if (isFull())
			return false;
		arr[--top2] = data;
		return false;
	}

	public int pop1() {
		if (isEmpty1())
			return 404;
		return arr[top1--];
	}

	public int pop2() {
		if (isEmpty2())
			return 404;
		return arr[top2++];
	}

	public static void main(String[] args) {
		DoubleStack ds = new DoubleStack(5);
		ds.push1(10);
		ds.push2(20);
		System.out.println(ds.pop2());
	}
}
