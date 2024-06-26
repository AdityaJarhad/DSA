package Node;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		super();
		this.root = null;
	}

	public boolean insert(int data) {
		Node newRoot = new Node(data);
		if (root == null) {
			root = newRoot;
			return true;
		}

		Node temp = root;
		Node prev = root;
		while (temp != null) {
			if (temp.getData() > data) {
				prev = temp;
				temp = temp.getLeft();
			}else {
				prev = temp;
				temp = temp.getRight();
			}
		}
		
		if(prev.getData() > data) {
			prev.setLeft(newRoot);
		}else {
			prev.setLeft(newRoot);
		}

		return true;
	}
	
	public void inOrder() {
		if(root == null)
			return;
		
		Node temp = root;
		while(temp!=null){
			 
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}