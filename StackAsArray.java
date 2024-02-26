/**
 *
 * @author Amy Martinez
 * Chpt5 PA
 */

import java.util.Scanner;

public class StackAsArray {
    
    public static int[] stack;
    public static int length = 0;
    public static int allocationSize;
    public static int maxLength;
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);      
	int item;
	boolean added = false;
            
	// Prompt the user for input
	System.out.print("Enter the allocation size of the array: ");
	// Enter 2 for this test scenario
	allocationSize = scnr.nextInt();
	System.out.print("Enter the maximum length of the array: ");
	// Enter -1 for this test scenario
	maxLength = scnr.nextInt();
        
        stack = new int[allocationSize];
        
        //space
        System.out.println("\n");
        // Add item 1 to stack
	item = 1;
	added = ArrayStackPush(item);
	if (added) {
		System.out.println("Item " + item + " was pushed successfully"); 
	} else {
		System.out.println("Item " + item + " was not pushed successfully");
	}
      
	// Add item 2 to queue
	item = 2;
	added = ArrayStackPush(item);
	if (added) {
		System.out.println("Item " + item + " was pushed successfully"); 
	} else {
		System.out.println("Item " + item + " was not pushed successfully");
	}
        
        //call peek and display the top item on the stack
        System.out.println("The top item on the stack is: " + peek());
        
        // Add item 3 to queue
	item = 3;
	added = ArrayStackPush(item);
	if (added) {
		System.out.println("Item " + item + " was pushed successfully"); 
	} else {
		System.out.println("Item " + item + " was not pushed successfully");
	}
        //display stack length
        System.out.println("the length of the stack is: " + length + "\n");
        
        //pop item from stack and display items's value
        System.out.println("The item popped from the stack was: " + ArrayStackPop());
        
        //call peek to display top item on stack
        System.out.println("The top item in the stack is: " + peek()+ "\n");
        // Add item 4 to queue
	item = 4;
	added = ArrayStackPush(item);
	if (added) {
		System.out.println("Item " + item + " was pushed successfully"); 
	} else {
		System.out.println("Item " + item + " was not pushed successfully");
	}
        
        //print stack contents
        System.out.println("The Stack contents are the following: " );
        printStack();
	  
        //push item 5 to stack
        item = 5;
	added = ArrayStackPush(item);
	if (added) {
		System.out.println("Item " + item + " was pushed successfully"); 
	} else {
		System.out.println("Item " + item + " was not pushed successfully");
	}
        
        System.out.println("The item popped from the stack was: " + ArrayStackPop());
        item = 6;
	added = ArrayStackPush(item);
	if (added) {
		System.out.println("Item " + item + " was pushed successfully"); 
	} else {
		System.out.println("Item " + item + " was not pushed successfully");
	}
        System.out.println("\n");
        //print stack contents
        System.out.println("The stack contents are the following: ");
        printStack();
        //space
        System.out.println("\n");
        //pop item from stack
        System.out.println("The item popped from the stack was: " + ArrayStackPop());
        //check to see if stack is empty
        System.out.println("The stack is empty: " + isEmpty()+"\n");
        //pop 3 items from stack
        System.out.println("The item popped from the stack was: " + ArrayStackPop());
        System.out.println("The item popped from the stack was: " + ArrayStackPop());
        System.out.println("The item popped from the stack was: " + ArrayStackPop());
        //check to see if list is empty
        System.out.println("The stack is empty: " + isEmpty());
    }

    public static void  stackResize() {
        int newSize = allocationSize * 2;
        if (maxLength > 0) {
            newSize = Math.min(newSize, maxLength);
        }
        int[] newArray = new int[newSize]; 
        int count = 0;
        for(int item: stack){
            newArray[count]= item;
            count += 1;
        }
        stack = newArray;
        allocationSize = newSize;
    }
    
    public static boolean ArrayStackPush(int item) {
        
//         Cannot push if at maximum length
        if (length == maxLength) {
            return false;
        }
//
//        // Resize if length equals allocation size
        if (length == allocationSize) {
            stackResize();
        }

       // Push the item and return true
        stack[length] = item;
        length = length + 1;
        return true;
    }
        
    public static int ArrayStackPop() {
        int popped = stack[length - 1];
        length = length - 1;
        return popped;
    }

    //returns true if the stack is empty and false if the stack is not empty
    public static boolean isEmpty(){
        return length == 0;
    }
    
    //returns the value of the item at the top of the stack
    public static int peek(){
        return stack[length - 1];
    }
    
    //prints the stack's values from the top to bottom, one on each line
    public static void printStack(){
        for(int i=length-1; i>=0;i--){
            System.out.println(stack[i]);
        }
    }

}
