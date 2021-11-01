/*
 * This Java class is transcribed from Data Structures and Algorithm Analysis
 * in Java, 3rd edition, by Mark Allen Weiss
 */
package disjointset;

/**
 *Assignment 6, Natalia Solar, CSD-235-335-ABBOTT - S21
 */
public class DisjointSetFindWithPathCompression extends DisjointSet {

    /**
     * Construct the disjoint sets object.
     *
     * @param numElements the initial number of disjoint sets.
     */
    public DisjointSetFindWithPathCompression(int numElements) {
        super(numElements);
    }

    /**
     * Perform a find with path compression. Error checks omitted again for
     * simplicity.
     *
     * @param x the element being searched for.
     * @return the set containing x.
     */
    @Override
    public int find(int x) {
        if(x > s.length -1 || x<0)throw new IllegalArgumentException("x should be in the range from 0 to " + (s.length -1));
        if( s[x] < 0 )// if x is the root
            return x;
        else
            return s[x] = find(s[x]);
    }
}
