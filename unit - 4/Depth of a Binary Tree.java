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
  public int maxDepth(TreeNode root){
    if(root == null){
       return 0; 
    } 
    int st = maxDepth(root.left);
    int end = maxDepth(root.right);
    return Math.max(st,end) + 1;
  }
}
