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
  public List<Integer> inorder(TreeNode root){
    List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        TreeNode currNode = root;
        while (currNode != null || !stk.isEmpty()) {
            while (currNode != null) {
                stk.push(currNode);
                currNode = currNode.left;
            }
            currNode = stk.pop();
            result.add(currNode.data);
            currNode = currNode.right;
        }
        return result;
   }
}
