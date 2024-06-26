package ll;

public class Tester {

	public static void main(String[] args) {
		LL1 l = new LL1();
		
		l.insert(10);
		l.insert(10);
		l.insert(10);
		l.insert(10);
		l.insert(10);

		l.display();
		System.out.println();
		l.dup();
		l.display();
	}

}
