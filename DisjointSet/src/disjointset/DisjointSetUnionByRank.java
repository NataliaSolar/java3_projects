
/*
 * This Java class is transcribed from Data Structures and Algorithm Analysis
 * in Java, 3rd edition, by Mark Allen Weiss
 */
package disjointset;

/**
 *Assignment 6, Natalia Solar, CSD-235-335-ABBOTT - S21
 */
public class DisjointSetUnionByRank 
        extends DisjointSetFindWithPathCompression {

    /**
     * Construct the disjoint sets object.
     *
     * @param numElements the initial number of disjoint sets.
     */
    public DisjointSetUnionByRank(int numElements) {
        super( numElements );
    }

    /**
     * Union by rank two disjoint sets. For simplicity, assume root1 
     * and root2 are distinct and represent set names.
     *
     * @param root1 the root of set 1.
     * @param root2 the root of set 2.
     */
    @Override
    public void union(int root1, int root2) {
        // TODO: Implement the union-by-rank algorithm for disjoint set
        if (s[root1]>-1 || s[root2]>-1 ) throw new IllegalArgumentException("Impossible to union because one of the roots is already dependant");
        if( s[root2] < s[root1]){ // root2 is deeper
            s[root1] = root2;// Make root2 new root
        } 
        else{
            if(s[root1] == s[root2]) s[ root1 ]--; // Update height if same
        s[root2] = root1; // Make root1 new root
        }
    }
}
