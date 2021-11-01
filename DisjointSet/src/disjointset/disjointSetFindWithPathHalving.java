/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disjointset;

/**
 *Assignment 6, Natalia Solar, CSD-235-335-ABBOTT - S21
 */
public class disjointSetFindWithPathHalving extends DisjointSet{

    /**
     * Construct the disjoint sets object.
     *
     * @param numElements the initial number of disjoint sets.
     */
    public disjointSetFindWithPathHalving(int numElements) {
        super(numElements);
    }
    
    /**
     * Perform a find with path compression.
     *
     * @param x the element being searched for.
     * @return the set containing x.
     */
    @Override
    public int find(int x) {
        if(x > s.length -1 || x<0)throw new IllegalArgumentException("x should be in the range from 0 to " + (s.length -1));
        if(s[x] < 0)return x;// if x is the root
        else{
            while(s[x] >= 0){
                 if(s[s[x]]< 0) return s[x];// if grandparent is root
                s[x] = s[s[x]];
                x=s[x];
            }
            return x;
        }            
    }
    

}
