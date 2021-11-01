/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

/**
 *
 * @author Natalia Solar
 * Assignment 3
 * CSD-235-335-ABBOTT - S21
 */
public class HashTableTest {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashTable myHashTable = new HashTable(10);
        System.out.println(myHashTable.toString());
        
        myHashTable.insert(5);
        myHashTable.insert(3);
        myHashTable.insert(7);        
        myHashTable.insert(10);
        myHashTable.insert(14);
        myHashTable.insert(24);
        myHashTable.insert(224);
        myHashTable.insert(135);
        myHashTable.insert(11);
        
        System.out.println(myHashTable.toString());
        
        System.out.println("size " + myHashTable.size());
        System.out.println("load factor " + myHashTable.loadFactor());
        
        System.out.println("size at index 4: " + myHashTable.size(4));
        System.out.println("size at index 1: " + myHashTable.size(1));
        
        System.out.println("search 24: " + myHashTable.search(24));
        System.out.println("search 1: " + myHashTable.search(1));
        System.out.println("search 20: " + myHashTable.search(20));
        
        
        System.out.println("\nremove 11:");
        myHashTable.remove(11);
        System.out.println(myHashTable.toString());
        
        
        System.out.println("\nremove 24:");
        myHashTable.remove(24);
        System.out.println(myHashTable.toString());
        
        
        System.out.println("\nremove 15 (there's no 15 in the bucketList):");
        myHashTable.remove(15);
        System.out.println(myHashTable.toString());
        
        System.out.println("size " + myHashTable.size());
        
        System.out.println("\ninsert 43 and 15:");
        myHashTable.insert(43);
        myHashTable.insert(15);
        System.out.println(myHashTable.toString());
        System.out.println("size " + myHashTable.size());
        System.out.println("load factor " + myHashTable.loadFactor());
        
        System.out.println("\ninsert 67:");
        myHashTable.insert(67);
        System.out.println(myHashTable.toString());
        System.out.println("size " + myHashTable.size());
        System.out.println("load factor " + myHashTable.loadFactor());
    }
}
