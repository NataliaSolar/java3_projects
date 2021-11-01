package filetreewalk;

import java.io.File;

/**
 *
 * @author Natalia Solar
 * Assignment 2 
 * CSD-235-335-ABBOTT - S21
 */
public class FileTreeWalk {

    /**
     * node in a tree
     */
    private class Node {

        File value;
        Node firstChild;
        Node nextSibling;

        // Constructor for leaf nodes.
        Node(File val) {
            value = val;
            firstChild = null;
            nextSibling = null;
        }

        // Constructor for non-leaf nodes.
        Node(File val, Node firstChild, Node nextSibling) {
            value = val;
            this.firstChild = firstChild;
            this.nextSibling = nextSibling;
        }
    }
    
    private Node root;
    
    /**
     * A constructor for FileTreeWalk class traverses the file system and adds file names and subdirectory names to a generalized tree 
     * structure that when finished will represent the current state of the file system from the starting point specified by the String parameter 
     * @param pathname Subdirectory, a starting point for traversing a file system
     */
    public FileTreeWalk (String pathname){
        
        File folder = new File(pathname);
        root = new Node(folder);
        populateFileTree(folder);

    }
    
    /**
     * The method adds a file to the tree by calling a private populateFileTree
     * method and passing it the root of the tree.
     *
     * @param file The file to add to the tree.
     */
    private void populateFileTree(File file){
        root = populateFileTree(file, root);
    }
    
    /**
     * The method adds a file to the tree.
     *
     * @param folder the file to add.
     * @param root The root of the tree.
     * @return The root of the resulting tree.
     */
    private Node populateFileTree(File folder, Node root) {
        Node temp =null;
        File[] fileNames = folder.listFiles();
        for (File file : fileNames) {
            if(root.firstChild == null){
                root.firstChild = new Node(file);
                temp = root.firstChild;
            }
            else if(temp.nextSibling == null){
                    temp.nextSibling = new Node(file);
                    temp = temp.nextSibling;                
            }
            
            if (file.isDirectory()) {
                temp = populateFileTree(file,temp);            
            }
        }
        return root;
    }
    
    /**
     * This method creates a string representation of the generalized tree by calling private StringBuilder listAllFiles (Node rt, String indent, StringBuilder sb) method
     * @return string representation of the generalized tree
     */
    public String listAllFiles(){
        StringBuilder sb = new StringBuilder();
        sb.append("Pathname: "+root.value.toString()+"\n");
        return listAllFiles(root, "", sb).toString();
    }
    
    /**
     * The method traverses the file system tree and add folder and file names to the stringBuilder with the proper indentation
     * @param rt tree node
     * @param indent indentation for subdirectory files
     * @param sb the StringBuilder for creating a string representation of a file system
     * @return a stringBuilder containing a string representation of a current state of the file system
     */
    private StringBuilder listAllFiles (Node rt, String indent, StringBuilder sb){
        
        String[] token = rt.value.toString().split("\\\\");
        sb.append(indent);
        sb.append(token[token.length-1]);
        sb.append("\n");
      if (rt.value.isDirectory()) {          
        Node temp = rt.firstChild;        
        while (temp != null) {            
          listAllFiles(temp, indent + "   ", sb);          
          temp = temp.nextSibling;
        }
      }        
        return sb;
    }

    /**
     * This method returns a String representation of the file system traversal created by the constructor
     * @return string representation
     */
    @Override
    public String toString (){
        return listAllFiles();
    }
}
