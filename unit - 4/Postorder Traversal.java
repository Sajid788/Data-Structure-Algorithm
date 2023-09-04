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
}
*/

class Solution{
  public List<Integer> postorder(TreeNode root){
      List<Integer> result = new ArrayList<>();
        if(root == null)
        { 
            return result;
        }
        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);
        while(stk.isEmpty()==false){
            TreeNode curr = stk.pop();
            result.add(0, curr.data);
            if(curr.left != null)
                stk.push(curr.left);
            if(curr.right != null)
                stk.push(curr.right);
        }
        return result;
  }
}
