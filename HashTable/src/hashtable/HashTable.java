
package hashtable;


/**
 *
 * @author Natalia Solar
 * Assignment 3
 * CSD-235-335-ABBOTT - S21
 */
public class HashTable{

    private BinarySearchTree[] bucketList;
    private int currentSize;
    
    
    /**
     * A constructor that takes a single int parameter
     * @param sz the size of a bucketList
     */
    public HashTable( int sz ){
        bucketList = new BinarySearchTree[sz];
        currentSize = 0;
        for( int i = 0; i < bucketList.length; i++ ){
            bucketList[i] = new BinarySearchTree();
        }
    }
    
    /**
    * Insert into the hash table. If the item is
    * already present, then do nothing.
    * @param x the item to insert.
    */
    public void insert(Integer key){  //takes an Integer parameter and stores it in the Hash Table
        
        BinarySearchTree whichTree = bucketList[myhash(key)];
        if( !whichTree.contains(key))
        {
            whichTree.add(key);
            currentSize = size();


            // Rehash
             if(loadFactor() >= 1.0){
                 rehash( );
             }
        }
    }
    
    private int myhash( Integer key ){
        int hashVal = key % bucketList.length;
        return hashVal;
    }
    
    /**
     * Find an item in the hash table.
     * @param key the item to search for.
     * @return true if key is not found.
     */
    public boolean contains(Integer key)
    {
        BinarySearchTree whichList = bucketList[myhash(key)];
        return whichList.contains(key);
    }

    
    
    /**
    * Remove from the hash table.
     * @param key the item to remove.
    */
    public void remove(Integer key){  // find an item in the hash table and remove it
        BinarySearchTree whichTree = bucketList[myhash(key)];
         if( whichTree.contains(key))
        {
            whichTree.remove(key);
            currentSize = size();
        }
    }
    
    /**
     *  Searches for an item in the hash table and if found, return it. Otherwise, return null
     * @param key searched item
     * @return if found return the item, otherwise, return null
     */
    public Integer search(Integer key){
        if(contains(key)) return key;
        else return null;
    }
    
    /**
     *  Outputs the contents of the Hash Table, one row per element in Bucket List
     * @return string containing output
     */
    @Override
    public String toString(){  // outputs the contents of the Hash Table, one row per element in Bucket List
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<bucketList.length; i++){
            sb.append(i + " " + bucketList[i].toString() + "\n");
        }

        return sb.toString();   
    }
    
    /**
     * Method to find the size of hash table
     * @return the number of all of the elements in Hash Table
     */
    public int size(){
        int count = 0;        
        for(int i=0; i<bucketList.length; i++){
            count += bucketList[i].countNode();
        }
        return count;
    }
    
    /**
     * Method that finds the size of a binary search tree in the bucketList at the specified index
     * @param index index in the bucketList
     * @return the number of elements in the bucket specified by the parameter
     */
    public int size(int index){ 
        return bucketList[index].countNode();
    }
    
    /**
     * A method that calculates and returns the loading factor to the caller
     * @return the loading factor 
     */
    public double loadFactor(){  
        return (double)currentSize/bucketList.length;
    }
    
    
    /**
    * Rehashing for separate chaining hash table.
    */
    //resize the Bucket List to the next prime number greater than twice the current size. 
    //Then for each element in the original Bucket List, rehash it into new one (don't forget 
    //that the hash function is based  on the size of the Bucket List)
    private void rehash( ){
        BinarySearchTree[ ] oldList = bucketList;

        // Create new double-sized, empty table
       bucketList = new BinarySearchTree[2*bucketList.length];
       for( int j = 0; j < bucketList.length; j++ )
            bucketList[ j ] = new BinarySearchTree( );

        // Copy table over
        currentSize = 0;
        for( int i = 0; i < oldList.length; i++ ){
            for(Integer item : oldList[i].treeContent()){
                insert(item);
            }        
        }
        currentSize = size();
    }
    
    

    
    //19 * Rehashing for separate chaining hash table.
//20 */
//21 private void rehash( )
//22 {
//23 List<AnyType> [ ] oldLists = theLists;
//24
//25 // Create new double-sized, empty table
//26 theLists = new List[ nextPrime( 2 * theLists.length ) ];
//27 for( int j = 0; j < theLists.length; j++ )
//28 theLists[ j ] = new LinkedList<>( );
//29
//30 // Copy table over
//31 currentSize = 0;
//32 for( int i = 0; i < oldLists.length; i++ )
//33 for( AnyType item : oldLists[ i ] )
//34 insert( item );
//35 }
    
}

//_________________________________________________________

//1 public class SeparateChainingHashTable<AnyType>
//2 {
//3 public SeparateChainingHashTable( )
//4 { /* Figure 5.9 */ }
//5 public SeparateChainingHashTable( int size )
//6 { /* Figure 5.9 */ }
//7
//8 public void insert( AnyType x )
//9 { /* Figure 5.10 */ }
//10 public void remove( AnyType x )
//11 { /* Figure 5.10 */ }
//12 public boolean contains( AnyType x )
//13 { /* Figure 5.10 */ }
//14 public void makeEmpty( )
//15 { /* Figure 5.9 */ }
//16
//17 private static final int DEFAULT_TABLE_SIZE = 101;
//18
//19 private List<AnyType> [ ] theLists;
//20 private int currentSize;
//21
//22 private void rehash( )
//23 { /* Figure 5.22 */ }
//24 private int myhash( AnyType x )
//25 { /* Figure 5.7 */ }
//26
//27 private static int nextPrime( int n )
//28 { /* See online code */ }
//29 private static boolean isPrime( int n )
//30 { /* See online code */ }
//31 }
//Figure 5.6 Class skeleton for separate chaining hash table

//___________________________________________

//1 private int myhash( AnyType x )
//2 {
//3 int hashVal = x.hashCode( );
//4
//5 hashVal %= theLists.length;
//6 if( hashVal < 0 )
//7 hashVal += theLists.length;
//8
//9 return hashVal;
//10 }
//Figure 5.7 myHash method for hash tables

//________________________________________

//1 /**
//2 * Construct the hash table.
//3 */
//4 public SeparateChainingHashTable( )
//5 {
//6 this( DEFAULT_TABLE_SIZE );
//7 }
//8
//9 /**
//10 * Construct the hash table.
//11 * @param size approximate table size.
//12 */
//13 public SeparateChainingHashTable( int size )
//14 {
//15 theLists = new LinkedList[ nextPrime( size ) ];
//16 for( int i = 0; i < theLists.length; i++ )
//17 theLists[ i ] = new LinkedList<>( );
//18 }
//19
//20 /**
//21 * Make the hash table logically empty.
//22 */
//23 public void makeEmpty( )
//24 {
//25 for( int i = 0; i < theLists.length; i++ )
//26 theLists[ i ].clear( );
//27 currentSize = 0;
//28 }
//Figure 5.9 Constructors and makeEmpty for separate chaining hash table


//_________________________________________

///**
//2 * Find an item in the hash table.
//3 * @param x the item to search for.
//4 * @return true if x is not found.
//5 */
//6 public boolean contains( AnyType x )
//7 {
//8 List<AnyType> whichList = theLists[ myhash( x ) ];
//9 return whichList.contains( x );
//10 }
//11
//12 /**
//13 * Insert into the hash table. If the item is
//14 * already present, then do nothing.
//15 * @param x the item to insert.
//16 */
//17 public void insert( AnyType x )
//18 {
//19 List<AnyType> whichList = theLists[ myhash( x ) ];
//20 if( !whichList.contains( x ) )
//21 {
//22 whichList.add( x );
//23
//24 // Rehash; see Section 5.5
//25 if( ++currentSize > theLists.length )
//26 rehash( );
//27 }
//28 }
//29
//30 /**
//31 * Remove from the hash table.
//32 * @param x the item to remove.
//33 */
//34 public void remove( AnyType x )
//35 {
//36 List<AnyType> whichList = theLists[ myhash( x ) ];
//37 if( whichList.contains( x ) )
//38 {
//39 whichList.remove( x );
//40 currentSize--;
//41 }
//42 }
//Figure 5.10 contains, insert, and remove routines for separate chaining hash table


//__________________________________________________________

///**
//19 * Rehashing for separate chaining hash table.
//20 */
//21 private void rehash( )
//22 {
//23 List<AnyType> [ ] oldLists = theLists;
//24
//25 // Create new double-sized, empty table
//26 theLists = new List[ nextPrime( 2 * theLists.length ) ];
//27 for( int j = 0; j < theLists.length; j++ )
//28 theLists[ j ] = new LinkedList<>( );
//29
//30 // Copy table over
//31 currentSize = 0;
//32 for( int i = 0; i < oldLists.length; i++ )
//33 for( AnyType item : oldLists[ i ] )
//34 insert( item );
//35 }
//Figure 5.22 Rehashing for both separate chaining and probing hash tables
