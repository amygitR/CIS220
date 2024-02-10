/**
 *
 * @author Amy Martinez
 * Chapter 3PA 
 */
public class BubbleSort {

    public static void bubbleSort(int[] array, int n){
        
        int temp;
        //if I use n-2 then I have to have <=
        //if I use n-1, then I can use just the < sign
        for (int i = 0; i< n-1;i++){
            for(int j = 0 ; j< n-1; j++){
                if (array[j] > array[j+1]){
                  temp = array[j];
                  array[j] = array[j+1];
                  array[j+1] = temp;
                }
            }
        }
          
    } 
    
    public static void main(String[] args) {
        
        //instantiate array with values
        int[] numberArray = {93,52,72,42,3,63,100,19,61,44,21,98,6,41,78,5,51,60,67,11};
        //initialize n = length of array
        int n = numberArray.length;
        //call bubble sort method with array name(arrayToSort) and length(n)
        bubbleSort(numberArray,n);
        //print out sorted array
        System.out.println("The sorted array is: ");
        //interate through array to print each index
        for(int i=0; i<numberArray.length;i++){
            System.out.print( numberArray[i] + " ");
        }
    }
}
