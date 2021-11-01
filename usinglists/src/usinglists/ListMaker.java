package usinglists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Natalia Solar
 */
public class ListMaker {

    public static void main(String[] args) {
        final int nodeCount = 500000;
        
        long startTime = 0;
        long endTime = 0;

        LinkedList<Integer> llist = new LinkedList<>();
        ArrayList<Integer> alist = new ArrayList<>();

        ////////////////////////////////////////////////
        //
        // calc how long it takes to populate a linked
        // list by adding elements at the front of the
        // list
        //
        ////////////////////////////////////////////////
        
        System.out.print("building a linkedlist by adding ");

        startTime = System.currentTimeMillis();
        createList(llist, nodeCount);
        endTime = System.currentTimeMillis();

        System.out.println(nodeCount + " nodes to the front of the list took "
                + (endTime - startTime)
                + " msec");

        ////////////////////////////////////////////////
        //
        // calc how long it takes to populate an array
        // list by adding elements at the front of the
        // list
        //
        ////////////////////////////////////////////////
        
        System.out.print("building an arraylist by adding ");

        startTime = System.currentTimeMillis();
        createList(alist, nodeCount);
        endTime = System.currentTimeMillis();

        System.out.println(nodeCount + " nodes to the front of the list took "
                + (endTime - startTime)
                + " msec");

        ////////////////////////////////////////////////
        //
        // calc how long it took to sum up the elements
        // in a linked list by traversing the list using 
        // the collection get method
        //
        ////////////////////////////////////////////////

        System.out.print("sum the elements in a linkedlist with ");

        startTime = System.currentTimeMillis();
        sumListElements(llist);
        endTime = System.currentTimeMillis();

        System.out.println(llist.size()
                + " nodes using the collection get method took "
                + (endTime - startTime)
                + " msec");

        ////////////////////////////////////////////////
        //
        // calc how long it takes to sum up the elements
        // in a linked list by traversing the list using the 
        // collection get method
        //
        ////////////////////////////////////////////////

        System.out.print("sum the elements in an arraylist with ");

        startTime = System.currentTimeMillis();
        sumListElements(alist);
        endTime = System.currentTimeMillis();

        System.out.println(alist.size() 
                + " nodes using the collection get method took "
                + (endTime - startTime)
                + " msec");

        ////////////////////////////////////////////////
        //
        // calc how long it took to sum up the elements
        // in a linked list by traversing the list using 
        // the collection iterator
        //
        ////////////////////////////////////////////////

        System.out.print("sum the elements in a linkedlist with ");

        startTime = System.currentTimeMillis();
        sumWithIterator(llist);
        endTime = System.currentTimeMillis();

        System.out.println(llist.size() 
                + " nodes using the collection iterator get method took "
                + (endTime - startTime)
                + " msec");


    }

    private static void createList(List<Integer> list, int n) {
        list.clear();

        for (int i = 0; i < n; i++) {
            list.add(0, i);
        }
    }

    private static int sumListElements(List<Integer> list) {
        int total = 0;
        int n = list.size();

        for (int i = 0; i < n; i++) {
            total += list.get(i);
        }
        return total;
    }
    
    private static int sumWithIterator(List<Integer> list) {
        int total = 0;
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            total += it.next();
        }
        
        return total;
    }    
}
