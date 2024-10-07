/**
 * Perform a depth first search on a binary tree.
 * Start from the root and visit nodes in PreOrder
 * 
 * @author Megan Cole
 */

public class DepthFirstSearch {
	
	Node root;
	int nodeCount; //keep track of number of nodes that are getting traversed
	
	/**
	 * Constructor
	 */
	public DepthFirstSearch() {
		System.out.println("Call DFS with root node to do a DFS.");
		nodeCount = 0;
	} //end Constructor
	
	/**
	 * Depth first PreOrder Traversal
	 * @parm node The node to start with DFS from
	 */
	
	public void DFS(Node node) {
		if (node == null) {
			return; //if node is null
		}
		
		//Print value of current node and increment the node counter
		System.out.println("Node value: " + node.getData());
		nodeCount++;
		
		//Recursive calls to left and right children
		DFS(node.getlChild());
		DFS(node.getrChild());
	} //end DFS
	
	/**
	 * Return the number of nodes being traversed
	 * @return nodeCount The number of nodes visited during DFS
	 */
	public int getNodeCount() {
		return nodeCount;
	} //end getNodeCount
	
	/**
	 * Calculate the height of the tree
	 * @param node The node to calculate the height from
	 * @return The height of the tree from the current node
	 */
	
	public int getHeight(Node node) {
		if (node == null) {
			return 0; //if node is null, height equals 0
		}
		
		//Height is 1 + max of left or right subtree height
		int leftHeight = getHeight(node.getlChild());
		int rightHeight = getHeight(node.getrChild());
		return 1 + Math.max(leftHeight, rightHeight);
	}
} //end DepthFirstSearch
