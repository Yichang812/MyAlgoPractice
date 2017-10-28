import java.util.*;

class TreeNode{
	int key;
	TreeNode left;
	TreeNode right;
	public TreeNode(int key) {
		this.key = key;
		left = null;
		right = null;
	}
}

public class BinaryTree {

	TreeNode root;
	
	public BinaryTree() {
		root = null;
	}
	
	// Tree Traversal
	//DFS
	//pre-order: root-left-right
	public static void printPreOrder(TreeNode node) {
		if(node == null) return;
		System.out.print(node.key + " ");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	
	//post-order: left-right-root
	public static void printPostOrder(TreeNode node) {
		if(node == null) return;
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.key + " ");
	}
	
	//in-order: left-root-right
	public static void printInOrder(TreeNode node) {
		if(node == null) return;
		printInOrder(node.left);
		System.out.print(node.key + " ");
		printInOrder(node.right);
	}
	
	//BFT using Queue 
	public static void printBFT(TreeNode node) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.key);
			if(temp.left != null) {
				queue.add(temp.left);
			}
			if(temp.right != null) {
				queue.add(temp.right);
			}
		}
	}
	
	public static void printNodeOfLevel(TreeNode root, int level) {
		if(root == null) return;
		if(level == 1) {
			System.out.print(root.key);
		}else if(level >1) {
			printNodeOfLevel(root.left, level-1);
			printNodeOfLevel(root.right, level-1);
		}
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		
		System.out.println("BFT: ");
		printBFT(tree.root);
	}

}

