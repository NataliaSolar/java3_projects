package assign1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Natalia Solar 
 * CSD-235-335-ABBOTT - S21
 * Assignment 1
 */
public class LwtList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<Integer> llist1 = new LinkedList<>();
        LinkedList<Integer> llist2 = new LinkedList<>();
        ArrayList<Integer> alist1 = new ArrayList<>();
        ArrayList<Integer> alist2 = new ArrayList<>();
        llist1.add(1);
        llist1.add(3);
        llist1.add(5);
        llist1.add(7);       
        llist1.add(9);

//[1,3,5,7,9] and 
//[3,4,5,6,7]

        llist2.add(3);
        llist2.add(4);
        llist2.add(5);
        llist2.add(6);
        llist2.add(7);

        //2, 3, 4, 7, 14, 17, 20,21,50,51,101
        
//        createList(alist1, 500);
//        createList2(alist2, 500);
        List<Integer> uni = Union(llist1,llist2);
        
        Iterator<Integer> it = uni.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
            
        }
        
        //List<Integer> in = Intersect(alist1,alist2);
        
//        Iterator<Integer> it = in.iterator();
//        while(it.hasNext()) {
//            System.out.print(it.next() + " ");
//            //expectr
//        }
   
    }
    
    /**
     * Method that finds intersect of two lists
     * @param list1 sorted (ascending) list
     * @param list2 sorted (ascending) list
     * @return new intersection list 
     */
    public static List<Integer> Intersect(List<Integer> list1, List<Integer> list2) {
                
        List<Integer> inter = new LinkedList<>();
        
        Iterator<Integer> it1 = list1.iterator();
        Iterator<Integer> it2 = list2.iterator();      

        Integer previous1 = null;
        Integer previous2 = null;
        
        Integer current1 = it1.next();
        Integer current2 = it2.next();
        

        while (true)
        {
            if(it1.hasNext()&& it2.hasNext()){ //while both list have elements
                if(current1 < current2){//check if current element of the first list is smaller, increment current and previous of the first list if that is the case
                previous1 = current1;
                current1 = it1.next();
                }else if(current1 > current2){//check if current element of the second list is smaller, increment current and previous of the second list if that is the case
                    previous2 = current2;
                    current2 = it2.next();
                }else{//in case if elements of two lists are equal, add one of them to inter and increment current and previous for both lists
                    if(previous2 != current2) inter.add(current2);
                    previous1 = current1;
                    previous2 = current2;
                    current1 = it1.next();
                    current2 = it2.next();
                }
            }
            
            if(!it1.hasNext()&& it2.hasNext()){// in case if second list is larger that the first one
                
                 //this if block is intended to process the last element of smaller list (list1), compare the last element of smaller list with element of larger list,
                 //increment current and previous for larger list (list2)
                if(current1 < current2){
                    previous1 = current1;
                    current2 = it2.next();
                }else if(current1 > current2){
                    previous2 = current2;
                    current2 = it2.next();
                }else{
                    if(previous2 != current2) inter.add(current2);
                    previous1 = current1;
                    previous2 = current2;
                    current2 = it2.next();
                }

                if(!it2.hasNext()) {//process the last element of larger (list2) array
                    if(previous2 != current2 && current1 == current2) inter.add(current2);
                    break;// break out of the loop
                } 
            }
            
            if(it1.hasNext()&& !it2.hasNext()){// in case if first list is larger that the second one
                //this block is intended to copmare the last element of smaller list (list2) to remaining elements of larger list (list1)
                if(current1 < current2){
                    previous1 = current1;
                    current1 = it1.next();
                }else if(current1 > current2){
                    previous2 = current2;
                    current1 = it1.next();
                }else{
                    if(previous2 != current2) inter.add(current2);
                    previous1 = current1;
                    previous2 = current2;
                    current1 = it1.next();
                }

                if(!it1.hasNext()) {//process the last element of larger (list1) list
                    if(previous1 != current1 && current2 == current1) inter.add(current1);
                    break;
                } 
            }            
            if(!it1.hasNext()&& !it2.hasNext()) break;//in case lists are of the same length
        }

        return inter;
    }
    
    
    
    /**
     * Method that finds a union of two lists
     * @param list1 sorted list
     * @param list2 sorted list
     * @return new union list 
     */
    public static List<Integer> Union(List<Integer> list1, List<Integer> list2) {
        
        List<Integer> union = new LinkedList<>();

        Iterator<Integer> it1 = list1.iterator();
        Iterator<Integer> it2 = list2.iterator();      

        Integer previous1 = null;
        Integer previous2 = null;
        
        Integer current1 = it1.next();
        Integer current2 = it2.next();

        while (true)
        {
            
            if(it1.hasNext()&& it2.hasNext()){ //while both list have elements
                if(current1 < current2){//check if current element of the first list is smaller, add it to union and increment current and previous if that is the case
                if(previous1 != current1) union.add(current1);//always check if previous element of the list is equal to current before adding to union (to hanlde duplicates)
                previous1 = current1;
                current1 = it1.next();
                }else if(current1 > current2){//check if current element of the second list is smaller, add it to union and increment current and previous if that is the case
                    if(previous2 != current2) union.add(current2);
                    previous2 = current2;
                    current2 = it2.next();
                }else{//in case if elements of two lists are equal, add one of them to union and increment both current and previous
                    if(previous2 != current2) union.add(current2);
                    previous1 = current1;
                    previous2 = current2;
                    current1 = it1.next();
                    current2 = it2.next();
                }
            }
            

            if(!it1.hasNext()&& it2.hasNext()){// in case if second list is larger that the first one
                
                if(current1 != null){ //this if block is intended to prosses the last element of smaller list
                    if(current1 < current2){
                    if(previous1 != current1) union.add(current1);
                    previous1 = current1;
                    current1 = null;
                    }else if(current1 > current2){
                        if(previous2 != current2) union.add(current2);
                        previous2 = current2;
                        current2 = it2.next();
                    }else{
                        if(previous2 != current2)union.add(current2);
                        previous1 = current1;
                        previous2 = current2;
                        current1 = null;
                        current2 = it2.next();
                    }
                }else{ // add the remaining elements of the larger list to union
                    
                    if(previous2 != current2) union.add(current2);
                    previous2 = current2;
                    current2 = it2.next();                    
                    
                    
                    if(!it2.hasNext()) {//if it's the last element of larger list add to union
                        if(previous2 != current2) union.add(current2);
                        break;
                    } 
                }
            }
            
            if(it1.hasNext()&& !it2.hasNext()){// in case if first list is larger that the second one
                
                if(current2 != null){ //this if block is intended to prosses the last element of smaller list
                    if(current1 < current2){
                    if(previous1 != current1) union.add(current1);
                    previous1 = current1;
                    current1 = it1.next();
                    }else if(current1 > current2){
                        if(previous2 != current2) union.add(current2);
                        previous2 = current2;
                        current2 = null;
                    }else{
                        if(previous2 != current2) union.add(current2);
                        previous1 = current1;
                        previous2 = current2;
                        current1 = it1.next();
                        current2 = null;
                    }
                }else{ // add the remainig elements of the larger list to union

                    if(previous1 != current1) union.add(current1);
                    previous1 = current1;
                    current1 = it1.next();
                    
                    
                    
                    if(!it1.hasNext()) {//if it's the last element of larger list add to union
                        if(previous1 != current1) union.add(current1);
                        break;
                    } 
                }
            }
            if(!it1.hasNext()&& !it2.hasNext()) break;//in case lists are of the same length
        }

        return union;
    }
    
    private static void createList(List<Integer> list, int n) {
        list.clear();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }
    }
    private static void createList2(List<Integer> list, int n) {
        list.clear();

        for (int i = 0; i < n; i+=3) {
            list.add(i);
        }
    }
}
