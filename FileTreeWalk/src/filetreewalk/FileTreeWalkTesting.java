/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filetreewalk;



import java.io.File;


/**
 *
 * @author Natalia Solar
 */
public class FileTreeWalkTesting {
    public static void main(String[] args) {

        FileTreeWalk newTree = new FileTreeWalk("C:\\Users\\Roman\\Desktop\\walk test");
        
        //newTree.preorder();
         System.out.print(newTree.listAllFiles());
    }

//    public void listAllFiles(File folder) {
//        File[] fileNames = folder.listFiles();
//        for (File file : fileNames) {
//            System.out.println(file);
//            if (file.isDirectory()) {
//                listAllFiles(file);
//            }
//        }
//    }
    
    
//        public void preorder (){
//        preorder(root);
//    }
//    
//    // Preorder traversal for general trees; just for seeing the result
//    private void preorder(Node rt) {
//      System.out.println(rt.value.toString());
//      if (rt.value.isDirectory()) {
//        Node temp = rt.firstChild;
//        while (temp != null) {
//          preorder(temp);
//          temp = temp.nextSibling;
//        }
//      }
//    }
}
