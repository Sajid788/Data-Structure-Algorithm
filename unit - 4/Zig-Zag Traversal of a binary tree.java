class Solution{
	/*
	class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	*/
public List<List<Integer>> zigzagTraversal(TreeNode root){
		List<List<Integer>> arr= new ArrayList<>();
		if(root== null){
		    return arr;
		}
		Stack<TreeNode> st1= new Stack<>();
		Stack<TreeNode> st2= new Stack<>();
		
		st1.push(root);
		int cnt=0;
		while(!st1.isEmpty() || !st2.isEmpty()){
		    List<Integer> temp= new ArrayList<>();
		   cnt++;
		   if(cnt%2 !=0){
		       int size= st1.size();
		       for(int i=0; i<size; i++){
		           TreeNode current= st1.pop();
		           temp.add(current.data);
		           if(current.left!=null){
		                st2.push(current.left);
		            }
		            if(current.right!=null){
		                st2.push(current.right);
		            }
		       }
		       
		   }else{
		       int size= st2.size();
		       for(int i=0; i<size; i++){
		           TreeNode current= st2.pop();
		           temp.add(current.data);
	
		            if(current.right!=null){
		                st1.push(current.right);
		            }
		            if(current.left!=null){
		                st1.push(current.left);
		            }
		       }
		   }
		   arr.add(temp);
		}
		return arr;
		
	}
}
