/**
 *
 * @author Amy Martinez
 * Ch4 PA
 */
public class LinkedListTester {

    public static void main(String[] args) {
        
        //create 3 nodes with specified data values
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        
        //create a linked list to append nodes 
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.listAppend(node1);
        myLinkedList.listAppend(node2);
        myLinkedList.listPrepend(node3);
        myLinkedList.listInsertAfter(myLinkedList.getHead(), node4);
        myLinkedList.listInsertAfter(myLinkedList.getTail(), node5);
        myLinkedList.listInsertAfter(node4, node6);
        myLinkedList.listInsertAfter(node2, node7);
        
        //call listTraverse which has print statements in it to display the list
        myLinkedList.listTraverse();
        
        //remove the head node
        myLinkedList.listRemoveNodeAfter(null);
        
        //remove node after 7
        myLinkedList.listRemoveNodeAfter(node7);
        
        //call listTraverse which has print statements in it to display the list
        myLinkedList.listTraverse();
        
        //search for node 5 and node 2, display whether found
        Node nodeData5 = (myLinkedList.listSearch(node5.getData()));
        
        if (nodeData5 == null){
            System.out.println("Node with data 5 was not found");
        }
        else {
            System.out.println("Node with data 5 was found");
            //int nodeValue5 = nodeData5.getData();
            //System.out.println("Node with data 5 was " + nodeValue5);
        }
        
        //search for node 5 and node 2, display whether found
        Node nodeData2 = (myLinkedList.listSearch(node2.getData()));
        
        if(nodeData2 == null){
            System.out.println("Node with data 2 was not found");
        }
        else{
            System.out.println("Node with data 2 was found.");
            //int nodeValue2 = nodeData2.getData();
            //System.out.println("Node with data 2 was " + nodeValue2);
        }
        
        //sum and display the sum of the node values
        System.out.println("The sum of the Linked List data values is: " + myLinkedList.sumDataValues());
        
        
    }
}
