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
    public int TreeD(TreeNode root){
        
          if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int leftDiameter = TreeD(root.left);
        int rightDiameter = TreeD(root.right);
        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }
    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        return 1 + Math.max(height(node.left), height(node.right));
        
    }
}
