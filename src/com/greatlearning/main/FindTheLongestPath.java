package com.greatlearning.main;
import java.util.ArrayList;

public class FindTheLongestPath {

	static class Node
	{
	    Node left;
	    Node right;
	    int data;
	};

	// new node
	static Node newNode(int data)
	{
	    Node temp = new Node();
	 
	    temp.data = data;
	    temp.left = null;
	    temp.right = null;
	 
	    return temp;
	}

	
	
	public static void main(String[] args)
	{
	    Node root = newNode(100);
	    root.left = newNode(20);
	    root.right = newNode(130);
	    root.left.left = newNode(10);
	    root.left.right = newNode(50);
	    root.left.left.left = newNode(5);
	    root.right.left = newNode(110);
	    root.right.right = newNode(140);

	    ArrayList<Integer> output = findLongestPath(root);
	    int n = output.size();
	     
	    System.out.print(output.get(n - 1));
	    for(int i = n - 2; i >= 0; i--)
	    {
	        System.out.print(" -> " + output.get(i));
	    }
	}

	public static ArrayList<Integer> findLongestPath(Node root) {
	     
		//System.out.println(root);
		if(root == null)
	    {
	    	ArrayList<Integer> output = new ArrayList<>();
	        return output;
	    }
	     
	   
		//System.out.println("right -" + root.right.data);
	    ArrayList<Integer> rightArray = findLongestPath(root.right);
	     

		//System.out.println("right -" + root.left.data);
	    ArrayList<Integer> leftArray = findLongestPath(root.left);
	     
	    // Compare the size of the two array
	    if(rightArray.size() < leftArray.size())
	    {
	    	leftArray.add(root.data);
	    }
	    else
	    {
	    	rightArray.add(root.data);
	    }
	     

	    return (leftArray.size() > rightArray.size() ? leftArray :rightArray);
	}
}
