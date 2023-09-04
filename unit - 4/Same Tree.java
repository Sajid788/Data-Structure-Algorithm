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
  public boolean sametree(TreeNode root1,TreeNode root2){
           Stack<TreeNode> stP = new Stack<>();
        Stack<TreeNode> stQ = new Stack<>();
        stP.push(root1); 
        stQ.push(root2); 
        while (!stP.isEmpty() && !stQ.isEmpty()) {
            TreeNode nodeP = stP.pop();
            TreeNode nodeQ = stQ.pop();

            if (nodeP == null && nodeQ == null) {
                continue;
            }
            if (nodeP == null || nodeQ == null || nodeP.data != nodeQ.data) {
                return false;
            }
            stP.push(nodeP.right);
            stP.push(nodeP.left);

            stQ.push(nodeQ.right);
            stQ.push(nodeQ.left);
        }
        return stP.isEmpty() && stQ.isEmpty();
  }
}
