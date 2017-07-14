import java.util.*;
import java.io.*;
class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	void top_view(Node root){
		leftTree(root.left);
        System.out.print(root.data+" ");
        rightTree(root.right);
	}

		void leftTree(Node root){
		    if(root.left!=null)
		        leftTree(root.left);
		    System.out.print(root.data+" ");
		}

		void rightTree(Node root){
		    System.out.print(root.data+" ");
		    if(root.right!=null)
		        rightTree(root.right);
		    
		}


	public static Node insert(Node root, int data) {
	        if(root == null){
	            return new Node(data);
	        }
	        else {
	            Node cur;
	            if(data <= root.data){
	                cur = insert(root.left, data);
	                root.left = cur;
	            }
	            else{
	                cur = insert(root.right, data);
	                root.right = cur;
	            }
	            return root;
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int t = scan.nextInt();
	        Node root = null;
	        while(t-- > 0){
	            int data = scan.nextInt();
	            root = insert(root, data);
	        }
	        scan.close();
	        Solution s = new Solution();
	        s.TopView(root);
	        }	
}