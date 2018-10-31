package com.interview.kal.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesAtSameLevel {

	 Node root;
	 
     public static class Node {
		int data;
		Node left, right, nextRight; //NextRight pointer to hold next node 

		Node( int data){
			this.data  = data;
			left = null;
			right = null;
			nextRight = null;
		}
     }
		
	public void connectNodesAtSameLevel(Node node){
		
		//Do Level Order Traversal using Queue
		Queue<Node>  queue  = new LinkedList<Node>();
		
		queue.add(node);
		queue.add( null);  //This Null marker is to represent the end of the current list
		
		while ( !queue.isEmpty()){
			
			Node temp  = queue.peek();
			 queue.remove();
			if( temp != null){	
				
				temp.nextRight = queue.peek(); //Set Next Right ptr to peek element at Queue
				if( temp.left!= null){
					queue.add( temp.left);
				}
				if( temp.right != null) {
					queue.add( temp.right);
				}
			}
			else if ( !queue.isEmpty()){ //When node is null and Queue is not empty,
				                         //push NULL marker as end of that level
				queue.add(null);
			}
		}	
	}
	
	 public static void main(String args[])  
	    { 
		 	ConnectNodesAtSameLevel  tree = new ConnectNodesAtSameLevel(); 
	        tree.root = new Node(10); 
	        tree.root.left = new Node(8); 
	        tree.root.right = new Node(12); 
	        tree.root.left.left = new Node(3); 
	        tree.root.right.right = new Node(90); 
	         
	           //   10 -> NULL
	           //  / \
	        //    8 ->  12 -> NULL
	       //    /     \
	      //    3       90 -> NULL
	        
	        // Populates nextRight pointer in all nodes 
	        tree.connectNodesAtSameLevel(tree.root); 
	        
	        System.out.println("Root Node next right:" +  tree.root.nextRight); 
	        System.out.println("Root Node next right:" +  tree.root.left.nextRight.data); 
	        System.out.println("Root Node next right:" +  tree.root.right.nextRight); 
	        System.out.println("Root Node next right:" +  tree.root.left.left.nextRight.data); 
	        System.out.println("Root Node next right:" +  tree.root.right.right.nextRight); 

	    }
	 
}

