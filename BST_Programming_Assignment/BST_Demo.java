/**
 *
 * @author (used by Amy Martinez 3/24)
 */
public class BST_Demo {
	public static void main(String[] args) {
		// Insert
		int[] numbers = {20,35,13,6,24,18,48,1,27};
		BinarySearchTree tree = new BinarySearchTree();
		for (int number : numbers) {
                    tree.insert(new Node(number));
		}
                //print
                System.out.println("--------------------");
                System.out.println("Binary Search Tree");
                BSTPrint.print2D(tree.getRoot());
                
                //remove 18, 48
                tree.remove(18);
                tree.remove(48);
                System.out.println("--------------------");
                System.out.println("Binary Search Tree after removing nodes 18 and 48:");
                BSTPrint.print2D(tree.getRoot());
                
                //insert 16 and 45
                tree.insert(new Node(16));
                tree.insert(new Node(45));
                //print
                                System.out.println("--------------------");
                System.out.println("Binary Search Tree after inserting nodes 16 and 45");
                BSTPrint.print2D(tree.getRoot());
                
                //remove 6, 24
                tree.remove(6);
                tree.remove(24);
                System.out.println("--------------------");
                System.out.println("Binary Search Tree after removing nodes 6 and 24");
                BSTPrint.print2D(tree.getRoot());
                
                //remove 20, 38 (attempt)
                tree.remove(20);
                tree.remove(38);
                System.out.println("--------------------");
                System.out.println("Binary Search Tree after removing nodes 20 and 38");
                BSTPrint.print2D(tree.getRoot());
                
//		// Search for key 3.
//		Node foundNode = tree.search(3);
//		if (foundNode != null) {
//			System.out.printf("Found node with key = %d.%n", foundNode.key);
//		} else {
//			System.out.println("Key 3 not found.");
//		}
//      
//		// Search for key 99.
//		foundNode = tree.search(99);
//		if (foundNode != null) {
//			System.out.printf("Found node with key = %d.%n", foundNode.key);
//		} else {
//			System.out.println("Key 99 not found.");
//		}
//	  
//		System.out.println("\n--------------------------------------");
//		System.out.println("Binary Search Tree:");
//		BSTPrint.print2D(tree.getRoot());
//		System.out.println();
	}
}
