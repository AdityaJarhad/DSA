package Node;

public class Tester {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node node;
		bst.insert(50);
		bst.insert(30);
		bst.insert(60);
		bst.insert(20);
		bst.insert(10);
		bst.insert(100);

		bst.inOrder();

	}

}
