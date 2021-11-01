
package hashtable;

/**
 *
 * Natalia Solar
 * CSD-235-335-ABBOTT - S21
 */

/**
   Node class.
*/
public class Node
{
    Integer value;
    Node left, right;

    // Constructor for leaf nodes.
    Node(Integer val)
    {
        value = val;
        left = null;
        right = null;
    }

    // Constructor for non-leaf nodes.
    Node(Integer val, Node leftChild, Node rightChild)
    {
        value = val;
        left = leftChild;
        right = rightChild;
    }
}
