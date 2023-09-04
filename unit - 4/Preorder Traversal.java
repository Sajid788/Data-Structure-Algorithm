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
  public List<Integer> preorder(TreeNode root){
       List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        stk.add(root);
        while (!stk.isEmpty()) {
            TreeNode curr = stk.peek();
            stk.pop();
            if (curr != null) {
                result.add(curr.data);
                stk.add(curr.right);
                stk.add(curr.left);
            }
        }
       return result;
  }
}
