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
  public TreeNode mergeTree(TreeNode root1,TreeNode root2){
       if (root1 == null && root2 == null) {
            return null;
        } else if (root1 == null) {
            return root2;
        } else if (root2 == null) {
            return root1;
        } else {
            TreeNode mergedNode = new TreeNode(root1.data + root2.data);
            mergedNode.left = mergeTree(root1.left, root2.left);
            mergedNode.right = mergeTree(root1.right, root2.right);
            return mergedNode;
        }
  }
}
// output 6 5 7 7 8 
