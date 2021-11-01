
/*
 * This Java class is transcribed from Data Structures and Algorithm Analysis
 * in Java, 3rd edition, by Mark Allen Weiss
 */
package disjointset;

/**
 *Assignment 6, Natalia Solar, CSD-235-335-ABBOTT - S21
 */
public class DisjointSetUnionBySize 
        extends DisjointSetFindWithPathCompression {

    /**
     * Construct the disjoint sets object.
     *
     * @param numElements the initial number of disjoint sets.
     */
    public DisjointSetUnionBySize(int numElements) {
        super( numElements );
    }

    /**
     * Union by size two disjoint sets. For simplicity, assume root1 
     * and root2 are distinct and represent set names.
     *
     * @param root1 the root of set 1.
     * @param root2 the root of set 2.
     */
    
    
//    if( s[root2] < s[root1]){ // root2 is deeper
//            s[root1] = root2;// Make root2 new root
//        } 
//        else{
//            if(s[root1] == s[root2]) s[ root1 ]--; // Update height if same
//        s[root2] = root1; // Make root1 new root
//        }
//        setByrank.union(6,7);
//        setBysize.union(4,6);
    @Override
    public void union(int root1, int root2) {
        // TODO: Implement the union-by-size algorithm for disjoint set
        
//        if( s[root2]== -1){ // root2 is not connected to any other root
//            s[root2] = root1; // Make root1 new root
//            s[ root1 ] --; //decrement the size
//            
//        } 
//        else{//if root2 is already a root for other nodes
//            s[root1] += s[root2];//make the size to be the sum of all dependent nodes
//            s[root2] = root1;// Make root1 new root            
//        }
        if (s[root1]>-1 || s[root2]>-1 ) throw new IllegalArgumentException("Impossible to union because one of the roots is already dependant");
        s[root1] += s[root2];//make the size to be the sum of all dependent nodes
        s[root2] = root1;
        
    }

}
