/**
 *
 * @author used/modified by Amy Martinez
 */
class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public Node search(int desiredKey) {
        System.out.println("\nSearching for node " + desiredKey);
        Node currentNode = root;
        while (currentNode != null) {
            // Return the node if the key matches
            if (currentNode.key == desiredKey) {
                return currentNode;
            }
            // Navigate to the left if the search key is 
            // less than the node's key.
            else if (desiredKey < currentNode.key) {
                System.out.print("\nDid not find node, navigating to node " + currentNode.key + "'s left child");   
                currentNode = currentNode.left;
            }
            // Navigate to the right if the search key is 
            // greater than the node's key.
            else {
                System.out.print("\nDid not find node, navigating to node " + currentNode.key + "'s right child");         
                currentNode = currentNode.right;
            }
        }
        // The key was not found in the tree.
        return null;
    }

    public void insert(Node node) {
        System.out.println("Inserting node " + node.key);
        // Check if tree is empty
        if (root == null) {
            root = node;
            System.out.println("Inserted node " + node.key + " as the root node.\n");
        } else {
            Node currentNode = root;
            while (currentNode != null) {
                if (node.key < currentNode.key) {
                    // If no left child exists, add the new node
                    // here; otherwise repeat from the left child.
                    System.out.println("Checking node " + currentNode.key + " for left child.");
                    if (currentNode.left == null) {
                        System.out.println("Inserting node " + node.key + " as left child of node " + currentNode.key +".\n");
                        currentNode.left = node;
                        currentNode = null;
                    } else {
                        currentNode = currentNode.left;
                        System.out.println("Traversed to left child node " + currentNode.key +".");
                    }
                } else {
                    // If no right child exists, add the new node
                    // here; otherwise repeat from the right child.
                    System.out.println("Checking node " + currentNode.key + " for right child.");
                    if (currentNode.right == null) {
                        System.out.println("Inserting node " + node.key + " as right child of node " + currentNode.key +".\n");  
                        currentNode.right = node;
                        currentNode = null;
                    } else {
                        currentNode = currentNode.right;
                        System.out.println("Traversed to right child node " + currentNode.key +".");
                    }
                }
            }
        }
    }

    public boolean remove(int key) {
        return remove(key, true);
    }

    private boolean remove(int key, Boolean display) {
            // Function needs to be implemented, see pseudocode found in Section 7.6.1
        Node parent = null;
        Node currentNode = root;

        //search for node
        while(currentNode != null){
            if(currentNode.key == key){ // node found
                if(currentNode.left == null && currentNode.right == null){  //remove leaf
                    if(display) { System.out.println("Leaf node " + key + " was removed."); }
                    if(parent == null){  //node is root
                        root = null;
                    }
                    else if (parent.left == currentNode){
                        parent.left = null;
                    }
                    else { parent.right = null; }

              //  return true;  //node found & removed
                }
                else if (currentNode.right == null) {  //remove node w only left chld
                    if(display) { System.out.println("Node " + key + " with only left child was removed."); }
                    if(parent == null) {  //root
                        root = currentNode.left;
                    } 
                    else if (parent.left == currentNode){
                        parent.left = currentNode.left;
                    }
                    else {parent.right = currentNode.left;}

                //return true; // node found/removed
                }
                else if (currentNode.left == null) {  //remove node w only right
                    if(display) { System.out.println("Node " + key + " with only right child was removed."); }
                    if(parent == null) {  //root
                        root = currentNode.right;
                    } 
                    else if (parent.left == currentNode){
                        parent.left = currentNode.right;
                    }
                    else {parent.right = currentNode.right;}

                //return true; // node found/removed 
                }
                else  {         //remove node with 2 children
                    if(display) { System.out.println("Node " + key + " with a right and left child was removed."); }
                    //find successor leftmost child of right subtree
                    Node successor = currentNode.right;
                    while (successor.left != null){
                        successor = successor.left;
                    }
                    int successorData = successor.key;
                    remove(successorData, false);  // remove successor
                    currentNode.key = successorData;
                }

                return true;  // node found and removed
            }

            else if (currentNode.key < key){  // search right
                parent = currentNode;
                currentNode = currentNode.right;

            }
            else{
               parent = currentNode;
               currentNode = currentNode.left;
            }

        }

        if(display) { System.out.println("Node " + key + " was not removed."); }
        return false;     // node not found
    }
}
