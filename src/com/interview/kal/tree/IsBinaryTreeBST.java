package com.interview.kal.tree;

public class IsBinaryTreeBST {
	
	TreeNode root;
	
    // To keep track of previous node in InOrder Traversal for Iterative solution
    TreeNode prev; 
  
    //Recursive Solution 
	public boolean isBST(){
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE );
	}
	
	public  boolean isBSTUtil(TreeNode root, int min, int max ){
		
		if( root == null)
			return true;
		
		if( root.value < min  || root.value  > max)
			return false;
		
		return (isBSTUtil( root.left, min, root.value )  &&
				isBSTUtil( root.right, root.value, max ));
		
	}
  
	//Iterative solution
    boolean isBST_iter()  { 
        prev = null; 
        return isBST_iter(root); 
    } 
  
    /* Returns true if given search tree is binary 
       search tree (efficient version) */
    boolean isBST_iter(TreeNode node) 
    { 	
        // traverse the tree in inorder fashion and 
        // keep a track of previous node 
        if (node != null) 
        { 
        	//System.out.println("Node value:" + node.value);
            if (!isBST_iter(node.left)) 
                return false; 
  
            // allows only distinct values node 
            if (prev != null && node.value <= prev.value ) 
                return false; 
            
            prev = node; 
            //System.out.println("prev node" + prev.value);
            return isBST_iter(node.right); 
        } 
        return true; 
        
    }
	
	
	public static void main(String[] args){
		IsBinaryTreeBST  tree  = new IsBinaryTreeBST();
		tree.root  = new TreeNode(4);
        tree.root.left = new TreeNode(2); 
        tree.root.right = new TreeNode(5); 
        tree.root.left.left = new TreeNode(1); 
        tree.root.left.right = new TreeNode(3); 
  
                  //  4
                //   / \
               //   2    5
              //   / \
             //   1   3
        
        if (tree.isBST())  //Recursive
            System.out.println("Tree1 IS BST"); 
        else
            System.out.println("Tree1 Not a BST"); 
        
        
      
        IsBinaryTreeBST  tree1  = new IsBinaryTreeBST();
		tree1.root  = new TreeNode(10);
        tree1.root.left = new TreeNode(6); 
        tree1.root.right = new TreeNode(15); 
        tree1.root.left.left = new TreeNode(5); 
        tree1.root.left.right = new TreeNode(12); 
  
         //   10
        //   / \
       //   6    15
      //   / \
     //   5   12

        
        if (tree1.isBST_iter())  //Iterative
            System.out.println("Tree2 is BST"); 
        else
            System.out.println("Tree2 Not a BST");
         
	}

}
