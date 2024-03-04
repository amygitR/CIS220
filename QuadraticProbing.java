/**
 *
 * @author Amy Martinez
 * Ch 6 PA
 */
public class QuadraticProbing {

    //global variables + global array
    public static int tableSize = 16;
    public static int c1 = 1;
    public static int c2 = 1;
    public static int[] hashTable;
    public static int item; 
    //public static int H = item % tableSize;
    
    
    public static int hash(int key){
        int initialIndexHashTable; 
        //at i = 0, then initila Index Hash Table will equal H % table Size
        //no need to include i
        initialIndexHashTable = key % tableSize;  //(H + c1*i + c2*i*i)% tableSize;
        return initialIndexHashTable;
    }
    
    public static boolean hashInsert(int item){
        int bucket;
        int bucketsProbed = 0;
        int H = item % tableSize;
        //call hash to determine initial bucket
        bucket = hash(item);
       // System.out.println(bucket);
        int i=0;
        while(bucketsProbed<tableSize){
            
            //insert item in next empty bucket
            if((hashTable[bucket] == -1) || (hashTable[bucket] ==-2)){
                hashTable[bucket] = item;
                return true; //success
            }
            //use quadratic formula to update bucket bucket +1
            i= i+1;
            bucket = (H + c1*i + c2*i*i)% tableSize;
            
            //increment number of buckets probed
            bucketsProbed = bucketsProbed + 1;
            
        }
        //failed
        return false;
    }
    
    public static boolean hashRemove(int item){
        int bucket;
        int bucketsProbed = 0;
        int H = item % tableSize;
        //hash function determines first/initial bucket
        bucket = hash(item);
        int i=0;
        while((hashTable[bucket]!= -1) && (bucketsProbed<tableSize)){
            if(hashTable[bucket] == item){
                //sets bucket equal to empty after removal or -2
                hashTable[bucket] = -2;
                return true; //success
            }
             //use quadratic formula to update bucket bucket +1
            i= i+1;
            bucket = (H + c1*i + c2*i*i)% tableSize;
            
            //increment number of buckets probed
            bucketsProbed = bucketsProbed + 1;
        }
        return false;  //failure
    }
    
    public static int hashSearch(int item){
        int bucket;
        int bucketsProbed = 0;
        int H = item % tableSize;
        int i=0;
        //hash function determines first/initial bucket
        bucket = hash(item);
        
        while((hashTable[bucket]!= -1) && (bucketsProbed<tableSize)){
            if(hashTable[bucket] == item){
                return bucket; //success
            }
             //use quadratic formula to update bucket bucket +1
            i= i+1;
            bucket = (H + c1*i + c2*i*i)% tableSize;
            
            
            //increment number of buckets probed
            bucketsProbed = bucketsProbed + 1;
        }
        return -9;  //false
    }
    
    public static void displayHashTable(){
        System.out.println("The hash table contents are: ");
        //for each loop to print table items
        for(int i=0; i < tableSize; i++){
            System.out.println("HashTable[ " + i + "] is " + hashTable[i]);
            
        }
        System.out.println("\n");
    }
        
    
    
    public static void main(String[] args) {
        
        boolean inserted;
        boolean removed;
        
        //initialize with -1 (empty since start)
        hashTable = new int[tableSize];
        for(int i = 0; i < tableSize; i++) {
            hashTable[i] = -1;
        }

        //add item 32 to table
        item = 32;
        inserted = hashInsert(item);
        if(inserted){
            System.out.println("Item " + item +  " was inserted successfully");
        }
        else System.out.println("Item " + item +  " was not inserted successfully");
        
        //add item 63 to table
        item = 63;
        inserted = hashInsert(item);
        if(inserted){
            System.out.println("Item " + item +  " was inserted successfully");
        }
        else System.out.println("Item " + item +  " was not inserted successfully");
        
        //add item 16 to table
        item = 16;
        inserted = hashInsert(item);
        if(inserted){
            System.out.println("Item " + item +  " was inserted successfully");
        }
        else System.out.println("Item " + item +  " was not inserted successfully");
        
        //add item 3 to table
        item = 3;
        inserted = hashInsert(item);
        if(inserted){
            System.out.println("Item " + item +  " was inserted successfully");
        }
        else System.out.println("Item " + item +  " was not inserted successfully");
        
        //add item 23 to table
        item = 23;
        inserted = hashInsert(item);
        if(inserted){
            System.out.println("Item " + item +  " was inserted successfully");
        }
        else System.out.println("Item " + item +  " was not inserted successfully");
        
        //add item 11 to table
        item = 11;
        inserted = hashInsert(item);
        if(inserted){
            System.out.println("Item " + item +  " was inserted successfully");
        }
        else System.out.println("Item " + item +  " was not inserted successfully");
        
        //add item 64 to table
        item = 64;
        inserted = hashInsert(item);
        if(inserted){
            System.out.println("Item " + item +  " was inserted successfully");
        }
        else System.out.println("Item " + item +  " was not inserted successfully");
        
        //add item 99 to table
        item = 99;
        inserted = hashInsert(item);
        if(inserted){
            System.out.println("Item " + item +  " was inserted successfully");
        }
        else System.out.println("Item " + item +  " was not inserted successfully");
        
        //add item 42 to table
        item = 42;
        inserted = hashInsert(item);
        if(inserted){
            System.out.println("Item " + item +  " was inserted successfully");
        }
        else System.out.println("Item " + item +  " was not inserted successfully");
        
        //add item 49 to table
        item = 49;
        inserted = hashInsert(item);
        if(inserted){
            System.out.println("Item " + item +  " was inserted successfully");
        }
        else System.out.println("Item " + item +  " was not inserted successfully");
        
        //add item 48 to table
        item = 48;
        inserted = hashInsert(item);
        if(inserted){
            System.out.println("Item " + item +  " was inserted successfully");
        }
        else System.out.println("Item " + item +  " was not inserted successfully");
        
        //add item 21 to table
        item = 21;
        inserted = hashInsert(item);
        if(inserted){
            System.out.println("Item " + item +  " was inserted successfully");
        }
        else System.out.println("Item " + item +  " was not inserted successfully");
        
        System.out.println("\n");

        //display contents of hashtable
        displayHashTable();
        System.out.println("\n");

        //remove item 32 to table
        item = 32;
        removed = hashRemove(item);
        if(removed){
            System.out.println("Item " + item +  " was removed successfully");
        }
        else System.out.println("Item " + item +  " was not removed successfully");
        
        //remove item 11 to table
        item = 11;
        removed = hashRemove(item);
        if(removed){
            System.out.println("Item " + item +  " was removed successfully");
        }
        else System.out.println("Item " + item +  " was not removed successfully");
        
        //search for 64
        item = 64;
       int afterSearch = hashSearch(item);
       if(afterSearch!=-9){
           System.out.println("Item " + item +  " was found in bucket " + afterSearch);
       }
       else System.out.println("Item " + item +  " was not found");
       
       
      //add item 9 to table
        item = 9;
        inserted = hashInsert(item);
        if(inserted){
            System.out.println("Item " + item +  " was inserted successfully");
        }
        else System.out.println("Item " + item +  " was not inserted successfully");
        
       //search for 48
        item = 48;
       afterSearch = hashSearch(item);
       if(afterSearch!=-9){
           System.out.println("Item " + item +  " was found in bucket " + afterSearch);
       }
       else System.out.println("Item " + item +  " was not found");
       
        //search for 32
       item =32;
       afterSearch = hashSearch(item);
       if(afterSearch!=-9){
           System.out.println("Item " + item +  " was found in bucket " + afterSearch);
       }
       else System.out.println("Item " + item +  " was not found");
       
         //remove item 64 to table
        item = 64;
        removed = hashRemove(item);
        if(removed){
            System.out.println("Item " + item +  " was  removed successfully");
        }
        else System.out.println("Item " + item +  " was not  removed successfully");
       
        //remove item 99 to table
        item = 99;
        removed = hashRemove(item);
        if(removed){
            System.out.println("Item " + item +  " was removed successfully ");
        }
        else System.out.println("Item " + item +  " was not removed successfully ");
        
        
        System.out.println("\n");
         //display contents of hashtable
        displayHashTable();
    }
}
