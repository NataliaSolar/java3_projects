/*
 * This Java class is transcribed from Data Structures and Algorithm Analysis
 * in Java, 3rd edition, by Mark Allen Weiss
 */
package disjointset;

/**
 *Assignment 6, Natalia Solar, CSD-235-335-ABBOTT - S21
 */
public class DisjointSet {

    protected int[] s;

    /**
     * Construct the disjoint sets object.
     *
     * @param numElements the initial number of disjoint sets.
     */
    public DisjointSet(int numElements) {
        s = new int[numElements];
        for (int i = 0; i < s.length; i++) {
            s[i] = -1;
        }
    }

    /**
     * Union two disjoint sets. For simplicity, assume root1 and root2 are
     * distinct and represent set names.
     *
     * @param root1 the root of set 1.
     * @param root2 the root of set 2.
     */
    public void union(int root1, int root2) {
        s[root2] = root1;
    }

    /**
     * Perform a find using a simple disjoint set find algorithm. Error checks
     * omitted again for simplicity.
     *
     * @param x
     * @return
     */
    public int find(int x) {
        if (s[x] < 0) {
            return x;
        }
        return find(s[x]);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        
        for( int i = 0; i < s.length; i++ ){
            sb.append(s[i]).append(" ");
        }
        
        sb.append("]");
        return sb.toString();
    }
}
