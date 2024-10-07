/**
 * Megan Cole
 * Test application to test DFS for binary tree
 */

/**
 * @author Nathan Johnson, Bellarmine University 
 */

public class Application {

	/**
	 * @param args Tree Height
	 */
	
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		
		DepthFirstSearch aSearch=new DepthFirstSearch(); //Initialize DFS
		aSearch.DFS(root);
		
		//Print number of nodes being traversed
		System.out.println("The total nodes traversed: " + aSearch.getNodeCount());
		
		//Print the height of the tree
		System.out.println("The heigh of the tree is: " + aSearch.getHeight(root));
	} //end main

} // end Application