package lwtmaxheap;

/**
 *
 * @author Natalia Solar
 * Assignment4
 */
public class LwtMaxHeapTest {
    
    public static void main(String[] args) {
        
        LwtMaxHeap maxh = new LwtMaxHeap();
        maxh.insert(9);
        maxh.insert(4);
        maxh.insert(7);
        maxh.insert(10);
        maxh.insert(2);
        maxh.insert(8);
        maxh.insert(15);
        
        System.out.println(maxh.toString());
        
        System.out.println("The maximum: "+ maxh.findMax());
        
        maxh.insert(0);
         maxh.insert(5);
         maxh.insert(10);
         System.out.println(maxh.toString());
         
         maxh.deleteMax();
         System.out.println(maxh.toString());
         
         Integer[] arr = new Integer[5];
         for(int i =0; i<arr.length;i++){
             arr[i] = (i+3)*2;
         }
         
        LwtMaxHeap maxh2 = new LwtMaxHeap(arr);
         System.out.println(maxh2.toString());
    }
}
