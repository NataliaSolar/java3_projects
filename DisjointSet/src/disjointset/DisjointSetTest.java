/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disjointset;

/**
 *Assignment 6, Natalia Solar, CSD-235-335-ABBOTT - S21
 */
public class DisjointSetTest {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DisjointSetUnionByRank setByrank = new DisjointSetUnionByRank(17);
        System.out.println(setByrank.toString());
//        setByrank.union(6,7);
//        setByrank.union(4,3);
//        setByrank.union(4,5);
//        setByrank.union(4,6);
        System.out.println(setByrank.toString());
        System.out.println();
        
//        System.out.println(setByrank.toString());
//        setByrank.union(1,2);
//        System.out.println("union(1,2)");
//        System.out.println(setByrank.toString());
//        setByrank.union(3,4);
//        System.out.println("union(3,4)");
//        System.out.println(setByrank.toString());
//        setByrank.union(3,5);
//        System.out.println("union(3,5)");
//        System.out.println(setByrank.toString());
//        setByrank.union(1,7);
//        System.out.println("union(1,7)");
//        System.out.println(setByrank.toString());
//        setByrank.union(3,6);
//        System.out.println("union(3,6)");
//        System.out.println(setByrank.toString());
//        setByrank.union(8,9);
//        System.out.println("union(8,9)");
//        System.out.println(setByrank.toString());
//        setByrank.union(1,8);
//        System.out.println("union(1,8)");
//        System.out.println(setByrank.toString());
//        setByrank.union(3,10);
//        System.out.println("union(3,10)");
//        System.out.println(setByrank.toString());
//        setByrank.union(3,11);
//        System.out.println("union(3,11)");
//        System.out.println(setByrank.toString());
//        setByrank.union(3,12);
//        System.out.println("union(3,12)");
//        System.out.println(setByrank.toString());
//        setByrank.union(3,13);
//        System.out.println("union(3,13)");
//        System.out.println(setByrank.toString());
//        setByrank.union(14,15);
//        System.out.println("union(14,15)");
//        System.out.println(setByrank.toString());
//        setByrank.union(16,0);
//        System.out.println("union(16,0)");
//        System.out.println(setByrank.toString());
//        setByrank.union(14,16);
//        System.out.println("union(14,16)");
//        System.out.println(setByrank.toString());
//        setByrank.union(1,3);
//        System.out.println("union(1,3)");
//        System.out.println(setByrank.toString());
//        setByrank.union(1,14);
//        System.out.println("union(1,14)");
//        System.out.println(setByrank.toString());
//        System.out.println();
        
//        DisjointSetUnionBySize setBysize = new DisjointSetUnionBySize(8);
//        System.out.println(setBysize.toString());
//        setBysize.union(6,7);
//        System.out.println("union(6,7)");
//        System.out.println(setBysize.toString());
//        setBysize.union(4,3);
//        System.out.println("union(4,3)");
//        System.out.println(setBysize.toString());
//        setBysize.union(4,5);
//        System.out.println("union(4,5)");
//        System.out.println(setBysize.toString());
//        setBysize.union(4,6);
//        System.out.println("union(4,6)");
//        System.out.println(setBysize.toString());
        
//        DisjointSetUnionBySize setBysize = new DisjointSetUnionBySize(17);
//        System.out.println(setBysize.toString());
//        setBysize.union(1,2);
//        System.out.println("union(1,2)");
//        System.out.println(setBysize.toString());
//        setBysize.union(3,4);
//        System.out.println("union(3,4)");
//        System.out.println(setBysize.toString());
//        setBysize.union(3,5);
//        System.out.println("union(3,5)");
//        System.out.println(setBysize.toString());
//        setBysize.union(1,7);
//        System.out.println("union(1,7)");
//        System.out.println(setBysize.toString());
//        setBysize.union(3,6);
//        System.out.println("union(3,6)");
//        System.out.println(setBysize.toString());
//        setBysize.union(8,9);
//        System.out.println("union(8,9)");
//        System.out.println(setBysize.toString());
//        setBysize.union(1,8);
//        System.out.println("union(1,8)");
//        System.out.println(setBysize.toString());
//        setBysize.union(3,10);
//        System.out.println("union(3,10)");
//        System.out.println(setBysize.toString());
//        setBysize.union(3,11);
//        System.out.println("union(3,11)");
//        System.out.println(setBysize.toString());
//        setBysize.union(3,12);
//        System.out.println("union(3,12)");
//        System.out.println(setBysize.toString());
//        setBysize.union(3,13);
//        System.out.println("union(3,13)");
//        System.out.println(setBysize.toString());
//        setBysize.union(14,15);
//        System.out.println("union(14,15)");
//        System.out.println(setBysize.toString());
//        setBysize.union(16,0);
//        System.out.println("union(16,0)");
//        System.out.println(setBysize.toString());
//        setBysize.union(14,16);
//        System.out.println("union(14,16)");
//        System.out.println(setBysize.toString());
//        setBysize.union(1,3);
//        System.out.println("union(1,3)");
//        System.out.println(setBysize.toString());
//        setBysize.union(1,14);
//        System.out.println("union(1,14)");
//        System.out.println(setBysize.toString());
//        
//        System.out.println("find 10: "+setBysize.find(10));
//        System.out.println(setBysize.toString());
//        
//        System.out.println("find 0: "+setBysize.find(0));
//        System.out.println(setBysize.toString());
//        
        System.out.println("------------------------------");
        //disjointSetFindWithPathHalving ph = new disjointSetFindWithPathHalving(9);
        //System.out.println(ph.toString());
//        ph.union(7,8);
//        System.out.println(ph.toString());
//        ph.union(6,7);
//        System.out.println(ph.toString());
//        ph.union(5,6);
//        ph.union(4,5);
//        ph.union(3,4);
//        ph.union(2,3);
//        ph.union(1,2);
//        ph.union(0,1);
//        System.out.println(ph.toString());
//        System.out.println(ph.find(8));
//        System.out.println(ph.toString());
        
        disjointSetFindWithPathHalving ph = new disjointSetFindWithPathHalving(17);
        ph.union(1,2);
        System.out.println("union(1,2)");
        System.out.println(ph.toString());
        ph.union(3,4);
        System.out.println("union(3,4)");
        System.out.println(ph.toString());
        ph.union(3,5);
        System.out.println("union(3,5)");
        System.out.println(ph.toString());
        ph.union(1,7);
        System.out.println("union(1,7)");
        System.out.println(ph.toString());
        ph.union(3,6);
        System.out.println("union(3,6)");
        System.out.println(ph.toString());
        ph.union(8,9);
        System.out.println("union(8,9)");
        System.out.println(ph.toString());
        ph.union(1,8);
        System.out.println("union(1,8)");
        System.out.println(ph.toString());
        ph.union(3,10);
        System.out.println("union(3,10)");
        System.out.println(ph.toString());
        ph.union(3,11);
        System.out.println("union(3,11)");
        System.out.println(ph.toString());
        ph.union(3,12);
        System.out.println("union(3,12)");
        System.out.println(ph.toString());
        ph.union(3,13);
        System.out.println("union(3,13)");
        System.out.println(ph.toString());
        ph.union(14,15);
        System.out.println("union(14,15)");
        System.out.println(ph.toString());
        ph.union(16,0);
        System.out.println("union(16,0)");
        System.out.println(ph.toString());
        ph.union(14,16);
        System.out.println("union(14,16)");
        System.out.println(ph.toString());
        ph.union(1,3);
        System.out.println("union(1,3)");
        System.out.println(ph.toString());
        ph.union(1,14);
        System.out.println("union(1,14)");
        System.out.println(ph.toString());
        
        System.out.println("find 10: "+ph.find(10));
        System.out.println(ph.toString());
        
        System.out.println("find 0: "+ph.find(0));
        System.out.println(ph.toString());
        
        System.out.println("find 2: "+ph.find(2));
        System.out.println(ph.toString());
        
        System.out.println("find 15: "+ph.find(15));
        System.out.println(ph.toString());
        System.out.println("find 0: "+ph.find(0));
        System.out.println(ph.toString());
    }
}
