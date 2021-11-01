package lwtmaxheap;

/**
 *
 * @author Natalia Solar
 * Assignment 4
 */
public class LwtMaxHeap <T extends Comparable<? super T>> {

    private static final int DEFAULT_CAPACITY = 10;
    
    private int currentSize;    // number of elements in heap
    private T [] array;         // the underlying data structure

    
    /**
     * Constructor
     */
    public LwtMaxHeap() {
        array = (T[]) new Comparable[DEFAULT_CAPACITY];
        currentSize = 0;
    }
    
    
    /**
     * Constructor for the MaxHeap
     * @param capacity the maximum capacity of the heap
     */
    public LwtMaxHeap(int capacity) {
        array = array = (T[]) new Comparable[capacity];;
        currentSize = 0;
    }
    

    
    /**
    * Construct the binary heap given an array of items.
    */
    public LwtMaxHeap(T[] items) {
        currentSize = items.length;
        array = (T[]) new Comparable[(currentSize + 2) * 11 / 10];

        int i = 1;
        for(T item : items)
            array[i++] = item;
        buildHeap();
    }



    /**
     * Insert into the priority queue, maintaining heap order.
     * Duplicates are allowed.
     * @param x the item to insert.
     */
    public void insert(T x) { // this is percolate up
        if( currentSize == array.length - 1 )
            enlargeArray( array.length * 2 + 1 );
            
             // Percolate up
             int hole = ++currentSize;
            for( array[ 0 ] = x; x.compareTo( array[ hole / 2 ] ) > 0; hole /= 2 ){
                array[ hole ] = array[ hole / 2 ];
            }           
            array[ hole ] = x;
            array[0] = null;//??
    }   
    
    
    /**
     * Method to find the maximum value in the MaxHeap
     * @return 
     */
    public T findMax() {
        return array[1];
    }
    

    
    /**
    * Remove the largest item from the priority queue.
    * @return the largest item, or throw UnderflowException, if empty.
    */
    public T deleteMax(){
        if(isEmpty()) throw new RuntimeException();

        T maxItem = findMax();
        array[1] = array[ currentSize-- ];
        percolateDown(1);

        return maxItem;
    }
    
    /**
     * Method to check if the heap is empty
     * @return true if empty
     */
    public boolean isEmpty() {
        if(array[1]==null) return true;
        else return false;
    }
    
    /**
     * Method to make the heap empty
     */
    public void mainEmpty() {
        for(int i=0; i<array.length; i++){
            array[i] = null;
        }
    }

    /**
     * Method to make string representation of the heap
     * @return string representation
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<array.length; i++){
            sb.append(array[i] + " ");
        }
        return sb.toString();
    }
    

    
    
    /**
    * Internal method to percolate down in the heap.
    * @param hole the index at which the percolate begins.
    */
    private void percolateDown(int hole) {
        
        int child;
        T tmp = array[ hole ];

       for( ; hole * 2 <= currentSize; hole = child ){
           
            child = hole * 2;
            if( child != currentSize && array[ child + 1 ].compareTo( array[ child ] ) > 0 ){    
                child++;
            }
            if( array[ child ].compareTo( tmp ) > 0 ){
                array[ hole ] = array[ child ];
            }
            else break;
        }
        array[ hole ] = tmp;
    
    }
    
    
    /**
    * Establish heap order property from an arbitrary
    * arrangement of items. Runs in linear time.
    */
    private void buildHeap() {
        for( int i = currentSize / 2; i > 0; i-- )
            percolateDown( i );
    }
    
    /**
     * Resize the heap array
     * @param newSize the new size of the array
     */
    private void enlargeArray(int newSize) {
        T[] newArray = (T[]) new Comparable[newSize];
        
        for(int i=0; i<array.length; i++){
            newArray[i] = array[i];
        }
        
        array = newArray;
    }
    
}




//________________________________________________________________________
//
//1 /**
//2 * Insert into the priority queue, maintaining heap order.
//3 * Duplicates are allowed.
//4 * @param x the item to insert.
//5 */
//6 public void insert( AnyType x )
//7 {
//8 if( currentSize == array.length - 1 )
//9 enlargeArray( array.length * 2 + 1 );
//10
//11 // Percolate up
//12 int hole = ++currentSize;
//13 for( array[ 0 ] = x; x.compareTo( array[ hole / 2 ] ) < 0; hole /= 2 )
//14 array[ hole ] = array[ hole / 2 ];
//15 array[ hole ] = x;
//16 }
//Figure 6.8 Procedure to insert into a binary heap











//______________________________________________________________
//1 /**
//2 * Construct the binary heap given an array of items.
//3 */
//4 public BinaryHeap( AnyType [ ] items )
//5 {
//6 currentSize = items.length;
//7 array = (AnyType[]) new Comparable[ ( currentSize + 2 ) * 11 / 10 ];
//8
//9 int i = 1;
//10 for( AnyType item : items )
//11 array[ i++ ] = item;
//12 buildHeap( );
//13 }
//14
//15 /**
//16 * Establish heap order property from an arbitrary
//17 * arrangement of items. Runs in linear time.
//18 */
//19 private void buildHeap( )
//20 {
//21 for( int i = currentSize / 2; i > 0; i-- )
//22 percolateDown( i );
//23 }
//Figure 6.14 Sketch of buildHeap

//________________________________________________

//1 /**
//2 * Remove the smallest item from the priority queue.
//3 * @return the smallest item, or throw UnderflowException, if empty.
//4 */
//5 public AnyType deleteMin( )
//6 {
//7 if( isEmpty( ) )
//8 throw new UnderflowException( );
//9
//10 AnyType minItem = findMin( );
//11 array[ 1 ] = array[ currentSize-- ];
//12 percolateDown( 1 );
//13
//14 return minItem;
//15 }
//16
//17 /**
//18 * Internal method to percolate down in the heap.
//19 * @param hole the index at which the percolate begins.
//20 */
//21 private void percolateDown( int hole )
//22 {
//23 int child;
//24 AnyType tmp = array[ hole ];
//25
//26 for( ; hole * 2 <= currentSize; hole = child )
//27 {
//28 child = hole * 2;
//29 if( child != currentSize &&
//30 array[ child + 1 ].compareTo( array[ child ] ) < 0 )
//31 child++;
//32 if( array[ child ].compareTo( tmp ) < 0 )
//33 array[ hole ] = array[ child ];
//34 else
//35 break;
//36 }
//37 array[ hole ] = tmp;
//38 }
//Figure 6.12 Method to perform deleteMin in a binary heap
