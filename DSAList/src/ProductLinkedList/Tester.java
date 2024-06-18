package ProductLinkedList;

import java.util.Scanner;
import static ProductLinkedList.Utils.productList;;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		
		System.out.println("Enter id, name, qty, price");
		list.insert(new Product(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt()));
		list.display();
	}

}
